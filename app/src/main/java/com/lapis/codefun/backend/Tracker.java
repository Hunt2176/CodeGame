package com.lapis.codefun.backend;

import java.util.ArrayList;

public class Tracker {
    private int highScore;
    private ArrayList<Games> gameHistory;

    // add new game data
    public void setNewScore(int score, int numOfQuestions,  String lang) {
        Games newGame = new Games(score, numOfQuestions, lang);
        gameHistory.add(newGame);
    }

    // method for returning games history
    public ArrayList<Games> getGameHistory() { return gameHistory; }

    // method for getting high score
    public int getHighScore() { return highScore; }
}