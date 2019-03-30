package com.lapis.codefun.backend;

import com.lapis.codefun.Language;

import java.util.ArrayList;

public class CodeStore {
    private ArrayList<String> python = new ArrayList<>();
    private ArrayList<String> java = new ArrayList<>();
    private ArrayList<String> cpp = new ArrayList<>();
    private ArrayList<String> csharp = new ArrayList<>();

    public static int sizeOf(Language language)
    {
        CodeStore store = new CodeStore();
        switch (language)
        {
            case PYTHON: return store.python.size();
            case CPP: return store.cpp.size();
            case JAVA: return store.java.size();
            case CSHARP: return store.csharp.size();
            default: return 0;
        }
    }

    CodeStore(){
        setPythonQuestions();
        setJavaQuestions();
        setCppQuestions();
        setCsharpQuestions();
    }

    public ArrayList<String> getLangList(Language newLang) {
        switch (newLang) {
            case PYTHON: return python;
            case JAVA: return java;
            default: return null;
        }
    }

    private void setPythonQuestions() {
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
                "      \"\\t\\tprint(i)\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"\\t\\ti += 1\",\n" +
                "      \"\\t\\ti += 2\",\n" +
                "      \"\\t\\treturn i\",\n" +
                "      \"\\t\\ti = i - 1\"\n" +
                "    ]\n" +
                "  ],\n" +
                "  \"prompt\": \"Print the numbers 1 through 5\",\n" +
                "  \"correctCode\": [\n" +
                "    1,\n" +
                "    1,\n" +
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
                "    0,\n" +
                "    1,\n" +
                "    1,\n" +
                "    0,\n" +
                "    0\n" +
                "  ]\n" +
                "}");
        python.add("{\n" +
                "  \"origCode\": [\n" +
                "    [\n" +
                "      \"for i in range(20,10,2):\",\n" +
                "      \"for i in range(20,10,-2):\",\n" +
                "      \"for i in range(20,8,-2):\",\n" +
                "      \"for i in range(10,20,2):\",\n" +
                "      \"for i in range(20,2):\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"\\t\\tprint(i)\",\n" +
                "      \"\\t\\tprint(2*i)\",\n" +
                "      \"\\t\\tprint('i')\"\n" +
                "    ]\n" +
                "  ],\n" +
                "  \"prompt\": \"Print the even numbers from 20 down to 10\",\n" +
                "  \"correctCode\": [\n" +
                "    2,\n" +
                "    0\n" +
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
                "    1,\n" +
                "    1,\n" +
                "    0,\n" +
                "    0,\n" +
                "    0\n" +
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
                "    0,\n" +
                "    1,\n" +
                "    0,\n" +
                "    0,\n" +
                "    0\n" +
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
                "      \"\\t\\tcout<<i;\"\n" +
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
                "    1,\n" +
                "    1,\n" +
                "    0,\n" +
                "    0,\n" +
                "    0\n" +
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
                "      \"cout << \\\"var is set to \\\" << var;\",\n" +
                "      \"cout >> \\\"var is set to \\\" >> var;\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"else\",\n" +
                "      \"(remove else)\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"cout << \\\"var is set to something else\\\";\"\n" +
                "    ]\n" +
                "  ],\n" +
                "  \"prompt\": \"Set var to 5 and print \\\"var is set to 5\\\"\",\n" +
                "  \"correctCode\": [\n" +
                "    0,\n" +
                "    1,\n" +
                "    0,\n" +
                "    0,\n" +
                "    0\n" +
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
                "      \"\\t\\tConsole.WriteLine(i);\"\n" +
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
                "    1,\n" +
                "    1,\n" +
                "    0,\n" +
                "    0,\n" +
                "    0\n" +
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
                "      \"Console.WriteLine(\\\"var is set to \\\" + var);\",\n" +
                "      \"Console.WriteLine(\\\"var is set to \\\", var);\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"else\",\n" +
                "      \"(remove else)\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"Console.WriteLine(\\\"var is set to something else\\\");\"\n" +
                "    ]\n" +
                "  ],\n" +
                "  \"prompt\": \"Set var to 5 and print \\\"var is set to 5\\\"\",\n" +
                "  \"correctCode\": [\n" +
                "    0,\n" +
                "    1,\n" +
                "    0,\n" +
                "    0,\n" +
                "    0\n" +
                "  ]\n" +
                "}");
    }
}
