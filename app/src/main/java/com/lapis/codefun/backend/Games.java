package com.lapis.codefun.backend;

public class Games {
    private int score;
    private int percentCorrect;
    private String language;

    Games(int newScore, int numOfQuestions, String lang) {
        score = newScore;
        percentCorrect = score / numOfQuestions;
        language = lang;
    }

    // get score of this game
    public int getScore() { return score; }

    // get percent correct for this game
    public int getPercentCorrect() { return percentCorrect; }

    // get this game's language
    public String getLanguage() { return language; }
}
