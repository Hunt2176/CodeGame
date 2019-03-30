package com.lapis.codefun.backend;

import com.lapis.codefun.Language;

public class Games {
    private int score;
    private int percentCorrect;
    private Language language;

    Games(int newScore, int numOfQuestions, Language lang) {
        score = newScore;
        percentCorrect = score / numOfQuestions;
        language = lang;
    }

    // get score of this game
    public int getScore() { return score; }

    // get percent correct for this game
    public int getPercentCorrect() { return percentCorrect; }

    // get this game's language
    public Language getLanguage() { return language; }
}
