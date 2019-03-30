package com.lapis.codefun.backend;

import java.util.ArrayList;
import java.util.Collections;
import com.google.gson.*;
import com.lapis.codefun.Language;

public class GameInstance{
    private Language currentLang;
    private int numberofQuestions;
    private int[] CurrentAnswer;
    private ArrayList<Question> CodeList;
    private int currentScore;
    private int currentScoreMulti;


    // setup new game
    public GameInstance(int questionNum, Language lang) {
        currentLang = lang;
        numberofQuestions = questionNum;
        CodeList = getQuestionList();
        currentScore = 0;
        currentScoreMulti = 1;
    }

    // retrieve list of questions
    private ArrayList<Question> getQuestionList() {
        // get list of questions
        CodeStore store = new CodeStore();
        ArrayList<String> questions = store.getLangList(currentLang);

        //shuffle the questions
        Collections.shuffle(questions);

        // cut off the list of questions
        questions.subList(numberofQuestions, questions.size() - 1).clear();

        // parse JSON in question objects
        ArrayList<Question> questionObjects = parseTheJSON(questions);

        return questionObjects;
    }

    // parse the json questions into question objects
    private ArrayList<Question> parseTheJSON(ArrayList<String> questionStrings) {
        ArrayList<Question> questionObjects = new ArrayList<>();
        Gson gson = new Gson();

        questionStrings.forEach((question) -> {
            Question newQuestion = gson.fromJson(question, Question.class);
            questionObjects.add(newQuestion);
        });

        return questionObjects;
    }


    public Question getQuestion() {
        try {
            return CodeList.remove(0);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    public int submit(int[] currentCode, Question original) {
        int questionScore = 0;
        for (int line : currentCode) {
           for (int origLine : original.correctCode) {
               if (line == origLine) {
                   questionScore++;
               }
           }
        }

        currentScore += questionScore;
        CurrentAnswer = currentCode;

        if (questionScore == original.correctCode.length) {
            currentScoreMulti++;
        }
        else {
            currentScoreMulti = 1;
        }

        return questionScore;
    }

    // update game history
    public Tracker concludeGame(Tracker gameStore) {
        gameStore.setNewScore((currentScore * currentScoreMulti), numberofQuestions, currentLang);
        return gameStore;
    }
}