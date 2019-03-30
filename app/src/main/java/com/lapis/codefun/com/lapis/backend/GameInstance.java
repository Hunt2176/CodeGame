package com.lapis.codefun.com.lapis.backend;

import java.util.ArrayList;
import java.util.Collections;
import com.google.gson.*;

public class GameInstance{
    private String currentLang;
    private int numberofQuestions;
    private Question CurrentCode;
    private ArrayList<Question> CodeList;
    private int currentScore;
    private int currentScoreMulti;


    GameInstance(int questionNum, String lang) {
        currentLang = lang;
        numberofQuestions = questionNum;
        CodeList = getQuestionList();
        currentScore = 0;
        currentScoreMulti = 1;
    }

    private ArrayList<Question> getQuestionList() {
        // get list of questions
        CodeStore store = new CodeStore();
        ArrayList<Question> questions = store.getQuestionsByLang(currentLang);

        //shuffle the questions
        Collections.shuffle(questions);

        // cut off the list of questions
        questions.subList(numberofQuestions, questions.size() - 1).clear();
        return questions;
    }

    public Question getQuestion() {
        return CodeList.remove(0);
    }

    public void submit(Question question) {

    }

    public void concludeGame() {

    }
}
