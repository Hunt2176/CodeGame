package com.lapis.codefun.backend;

public class Question {
    String[][] origCode;
    String prompt;
    String[] correctCode;

    public String[][] getOrigCode() {
        return origCode;
    }

    public String getPrompt() {
        return prompt;
    }

    public String[] getCorrectCode() {
        return correctCode;
    }
}
