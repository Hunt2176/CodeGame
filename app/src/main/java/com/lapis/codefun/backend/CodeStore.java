package com.lapis.codefun.backend;

import com.lapis.codefun.Language;

import java.util.ArrayList;
import java.util.HashMap;

public class CodeStore {
    private HashMap<String, ArrayList<String>> LangList;
    private ArrayList<String> python;
    private ArrayList<String> java;
    private ArrayList<String> cpp;
    private ArrayList<String> csharp;

    CodeStore(){
        setPythonQuestions();
        setJavaQuestions();
        setCppQuestions();
        setCsharpQuestions();
        LangList.put("Python", python);
        LangList.put("Java", java);
        LangList.put("C++", cpp);
        LangList.put("C#", csharp);
    }

    public ArrayList<String> getLangList(Language newLang) {
        switch (newLang) {
            case PYTHON: return python;
            case JAVA: return java;
            default: return null;
        }
    }

    private void setPythonQuestions(){
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
                "  \"c orrectCode\": [\n" +
                "    0,\n" +
                "    1,\n" +
                "    0,\n" +
                "    0,\n" +
                "    0\n" +
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
            "      \"while var = 5:\"\n" +
            "    ],\n" +
            "    [\n" +
            "      \"\\t\\tprint('var is set to ' + var)\",\n" +
            "      \"\\t\\tprint('var is set to ', var)\"\n" +
            "    ],\n" +
            "    [\n" +
            "      \"else:\",\n" +
            "      \"(remove else)\"\n" +
            "    ],\n" +
            "    [\n" +
            "      \"\\t\\tprint('var is set to something else')\"\n" +
            "    ]\n" +
            "  ],\n" +
            "  \"prompt\": \"Set var to 5 and print \\\"var is set to 5\\\"\",\n" +
            "  \"correctCode\": [\n" +
            "    \"var = 5\",\n" +
            "    \"if var == 5:\",\n" +
            "    \"\\t\\tprint('var is set to ' + var)\",\n" +
            "    \"else:\",\n" +
            "    \"\\t\\tprint('var is set to something else')\"\n" +
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
                "      \"\\t\\tprint('var is set to ' + var)\",\n" +
                "      \"\\t\\tprint('var is set to ', var)\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"else:\",\n" +
                "      \"(remove else)\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"\\t\\tprint('var is set to something else')\"\n" +
                "    ]\n" +
                "  ],\n" +
                "  \"prompt\": \"Set var to 5 and print \\\"var is set to 5\\\"\",\n" +
                "  \"correctCode\": [\n" +
                "    \"var = 5\",\n" +
                "    \"if var == 5:\",\n" +
                "    \"\\t\\tprint('var is set to ' + var)\",\n" +
                "    \"else:\",\n" +
                "    \"\\t\\tprint('var is set to something else')\"\n" +
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
                "      \"\\t\\tSystem.out.print(i);\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"\\t\\ti += 1;\",\n" +
                "      \"\\t\\ti += 2;\",\n" +
                "      \"\\t\\treturn i;\",\n" +
                "      \"\\t\\ti = i - 1;\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"}\"\n" +
                "    ]\n" +
                "  ],\n" +
                "  \"prompt\": \"Print the numbers 1 through 5\",\n" +
                "  \"correctCode\": [\n" +
                "    \"int i = 1;\",\n" +
                "    \"while (i <= 5){\",\n" +
                "    \"\\t\\tSystem.out.print(i);\",\n" +
                "    \"\\t\\ti += 1;\",\n" +
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
                "    \"\\t\\tSystem.out.print(\\\"var is set to \\\" + var);\",\n" +
                "    \"else\",\n" +
                "    \"\\t\\tSystem.out.print(\\\"var is set to something else\\\");\"\n" +
                "  ]\n" +
                "}");
    }

    private void setCppQuestions(){
        cpp.add("{\n" +
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
                "      \"\\t\\tSystem.out.print(i);\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"\\t\\ti += 1;\",\n" +
                "      \"\\t\\ti += 2;\",\n" +
                "      \"\\t\\treturn i;\",\n" +
                "      \"\\t\\ti = i - 1;\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"}\"\n" +
                "    ]\n" +
                "  ],\n" +
                "  \"prompt\": \"Print the numbers 1 through 5\",\n" +
                "  \"correctCode\": [\n" +
                "    \"int i = 1;\",\n" +
                "    \"while (i <= 5){\",\n" +
                "    \"\\t\\tSystem.out.print(i);\",\n" +
                "    \"\\t\\ti += 1;\",\n" +
                "    \"}\"\n" +
                "  ]\n" +
                "}");

        cpp.add("{\n" +
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
                "    \"\\t\\tSystem.out.print(\\\"var is set to \\\" + var);\",\n" +
                "    \"else\",\n" +
                "    \"\\t\\tSystem.out.print(\\\"var is set to something else\\\");\"\n" +
                "  ]\n" +
                "}");
    }

    private void setCsharpQuestions(){
        csharp.add("{\n" +
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
                "      \"\\t\\tSystem.out.print(i);\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"\\t\\ti += 1;\",\n" +
                "      \"\\t\\ti += 2;\",\n" +
                "      \"\\t\\treturn i;\",\n" +
                "      \"\\t\\ti = i - 1;\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"}\"\n" +
                "    ]\n" +
                "  ],\n" +
                "  \"prompt\": \"Print the numbers 1 through 5\",\n" +
                "  \"correctCode\": [\n" +
                "    \"int i = 1;\",\n" +
                "    \"while (i <= 5){\",\n" +
                "    \"\\t\\tSystem.out.print(i);\",\n" +
                "    \"\\t\\ti += 1;\",\n" +
                "    \"}\"\n" +
                "  ]\n" +
                "}");

        csharp.add("{\n" +
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
                "    \"\\t\\tSystem.out.print(\\\"var is set to \\\" + var);\",\n" +
                "    \"else\",\n" +
                "    \"\\t\\tSystem.out.print(\\\"var is set to something else\\\");\"\n" +
                "  ]\n" +
                "}");
    }
}
