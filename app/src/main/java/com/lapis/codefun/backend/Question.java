package com.lapis.codefun.backend;

public class Question {
    String[][] origCode;
    String prompt;
    int[] correctCode;

    public String[][] getOrigCode() {
        return origCode;
    }

    public String getPrompt() {
        return prompt;
    }

    public int[] getCorrectCode() {
        return correctCode;
    }
}
