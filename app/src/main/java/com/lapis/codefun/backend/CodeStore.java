package com.lapis.codefun.backend;

import java.util.ArrayList;
import java.util.HashMap;

public class CodeStore {
    private HashMap<String, ArrayList<String>> LangList;
    private ArrayList<String> python;
    private ArrayList<String> java;

    CodeStore(){
        setPythonQuestions();
        setJavaQuestions();
    }

    public HashMap<String, ArrayList<String>> getLangList() {
        return LangList;
    }

    private void setPythonQuestions(){
        python.add("{\n" +
            "  \"origCode\": [\n" +
            "    [\n" +
            "      \"i = 0\",\n" +
            "      \"i = 1\",\n" +
            "      \"i = -1\",\n" +
            "      \"i = 2\"\n" +
            "    ],\n" +
            "    [\n" +
            "      \"while i < 5:\",\n" +
            "      \"while i <= 5:\",\n" +
            "      \"while i > 5:\"\n" +
            "    ],\n" +
            "    [\n" +
            "      \"\\tprint(i)\"\n" +
            "    ],\n" +
            "    [\n" +
            "      \"\\ti += 1\",\n" +
            "      \"\\ti += 2\",\n" +
            "      \"\\treturn i\",\n" +
            "      \"\\ti = i - 1\"\n" +
            "    ]\n" +
            "  ],\n" +
            "  \"prompt\": \"Print the numbers 1 through 5\",\n" +
            "  \"correctCode\": [\n" +
            "    \"i = 1\",\n" +
            "    \"while i <= 5:\",\n" +
            "    \"print(i)\",\n" +
            "    \"i += 1\"\n" +
            "  ]\n" +
            "}");

        python.add("{\n" +
            "  \"origCode\": [\n" +
            "    [\n" +
            "      \"var = 5\",\n" +
            "      \"var = 4\"\n" +
            "    ],\n" +
            "    [\n" +
            "      \"if var = 5:\",\n" +
            "      \"if var == 5:\",\n" +
            "      \"if var = 5+1:\",\n" +
            "      \"while var = 5\"\n" +
            "    ],\n" +
            "    [\n" +
            "      \"\\tprint('var is set to ' + var)\",\n" +
            "      \"\\tprint('var is set to ', var)\"\n" +
            "    ],\n" +
            "    [\n" +
            "      \"else:\",\n" +
            "      \"(remove else)\"\n" +
            "    ],\n" +
            "    [\n" +
            "      \"\\tprint('var is set to something else')\"\n" +
            "    ]\n" +
            "  ],\n" +
            "  \"prompt\": \"Set var to 5 and print \\\"var is set to 5\\\"\",\n" +
            "  \"correctCode\": [\n" +
            "    \"var = 5\",\n" +
            "    \"if var == 5:\",\n" +
            "    \"\\tprint('var is set to ' + var)\",\n" +
            "    \"else:\",\n" +
            "    \"\\tprint('var is set to something else')\"\n" +
            "  ]\n" +
            "}");

        python.add("{\n" +
                "  \"origCode\": [\n" +
                "    [\n" +
                "      \"var = 5\",\n" +
                "      \"var = 4\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"if var = 5:\",\n" +
                "      \"if var == 5:\",\n" +
                "      \"if var = 5+1:\",\n" +
                "      \"while var = 5\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"\\tprint('var is set to ' + var)\",\n" +
                "      \"\\tprint('var is set to ', var)\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"else:\",\n" +
                "      \"(remove else)\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"\\tprint('var is set to something else')\"\n" +
                "    ]\n" +
                "  ],\n" +
                "  \"prompt\": \"Set var to 5 and print \\\"var is set to 5\\\"\",\n" +
                "  \"correctCode\": [\n" +
                "    \"var = 5\",\n" +
                "    \"if var == 5:\",\n" +
                "    \"\\tprint('var is set to ' + var)\",\n" +
                "    \"else:\",\n" +
                "    \"\\tprint('var is set to something else')\"\n" +
                "  ]\n" +
                "}");
    }

    private void setJavaQuestions(){
        java.add("{\n" +
                "  \"origCode\": [\n" +
                "    [\n" +
                "      \"int i = 0;\",\n" +
                "      \"int i = 1;\",\n" +
                "      \"int i = -1;\",\n" +
                "      \"int i = 2;\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"while (i < 5){\",\n" +
                "      \"while (i <= 5){\",\n" +
                "      \"while (i > 5){\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"\\tSystem.out.print(i);\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"\\ti += 1;\",\n" +
                "      \"\\ti += 2;\",\n" +
                "      \"\\treturn i;\",\n" +
                "      \"\\ti = i - 1;\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"}\"\n" +
                "    ]\n" +
                "  ],\n" +
                "  \"prompt\": \"Print the numbers 1 through 5\",\n" +
                "  \"correctCode\": [\n" +
                "    \"int i = 1;\",\n" +
                "    \"while (i <= 5){\",\n" +
                "    \"\\tSystem.out.print(i);\",\n" +
                "    \"\\ti += 1;\",\n" +
                "    \"}\"\n" +
                "  ]\n" +
                "}");

        java.add("{\n" +
                "  \"origCode\": [\n" +
                "    [\n" +
                "      \"int var = 5;\",\n" +
                "      \"int var = 4;\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"if(var = 5)\",\n" +
                "      \"if(var == 5)\",\n" +
                "      \"if(var = 5+1)\",\n" +
                "      \"while(var = 5)\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"System.out.print(\\\"var is set to \\\" + var);\",\n" +
                "      \"System.out.print(\\\"var is set to \\\", var);\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"else\",\n" +
                "      \"(remove else)\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"System.out.print(\\\"var is set to something else\\\");\"\n" +
                "    ]\n" +
                "  ],\n" +
                "  \"prompt\": \"Set var to 5 and print \\\"var is set to 5\\\"\",\n" +
                "  \"correctCode\": [\n" +
                "    \"int var = 5;\",\n" +
                "    \"if(var == 5)\",\n" +
                "    \"\\tSystem.out.print(\\\"var is set to \\\" + var);\",\n" +
                "    \"else\",\n" +
                "    \"\\tSystem.out.print(\\\"var is set to something else\\\");\"\n" +
                "  ]\n" +
                "}");
    }

}
