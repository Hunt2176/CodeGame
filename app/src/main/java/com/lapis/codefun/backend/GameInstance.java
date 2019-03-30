package com.lapis.codefun.backend;

import java.util.ArrayList;
import java.util.Collections;

public class GameInstance{
    private String currentLang;
    private int numberofQuestions;
    private Question CurrentCode;
    private ArrayList<Question> CodeList;
    private int currentScore;
    private int currentScoreMulti;


    // setup new game
    GameInstance(int questionNum, String lang) {
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
        ArrayList<String> questions

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
        ArrayList<Question> questionObjects = new ArrayList<Question>();

        questionStrings.forEach((question) -> System.out.print(question));

        return questionObjects;
    }


    public Question getQuestion() {
        return CodeList.remove(0);
    }

    public void submit(Question question) {

    }

    // update game history
    public Tracker concludeGame(Tracker gameStore) {
        gameStore.setNewScore(currentScore, numberofQuestions, currentLang);
        return gameStore;
    }
}
