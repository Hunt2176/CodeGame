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
            case CPP: return cpp;
            case CSHARP: return csharp;
            default: return null;
        }
    }

    //Python
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


    //Java
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

        java.add("{\n" +
                "  \"origCode\": [\n" +
                "    [\n" +
                "      \"Scanner reader = new Scanner(System.in);\",\n" +
                "      \"Scanner reader = new Scanner();\",\n" +
                "      \"Scanner reader;\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"System.out.print(\\\"Enter a number: \\\");\",\n" +
                "      \"print(\\\"Enter a number\\\");\",\n" +
                "      \"reader = new Scanner(\\\"Enter a number: \\\");\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"int number = reader.nextInt();\"\n" +
                "    ]\n" +
                "  ],\n" +
                "  \"prompt\": \"Get an integer from the user and store in a variable\",\n" +
                "  \"correctCode\": [\n" +
                "    0,\n" +
                "    0,\n" +
                "    0\n" +
                "  ]\n" +
                "}");

        java.add("{\n" +
                "  \"prompt\": \"take the cube of a number and print it\",\n" +
                "  \"origCode\": [\n" +
                "    [\n" +
                "      \"Cube cube = (x) -> x * x * x;\",\n" +
                "      \"Cube cube = (x) => x * x * x;\",\n" +
                "      \"(define cube (lambda (x) (x*x*x)))\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"(write (cube 3))\",\n" +
                "      \"Console.WriteLine(square(3));\",\n" +
                "      \"System.out.println(square(3));\"\n" +
                "    ]\n" +
                "  ],\n" +
                "  \"correctCode\": [\n" +
                "    0,\n" +
                "    2\n" +
                "  ]\n" +
                "}");
        java.add("{\n" +
                "  \"prompt\": \"Add the integers 2 and 8\",\n" +
                "  \"origCode\": [\n" +
                "    [\n" +
                "      \"float a = 2F\",\n" +
                "      \"int a = 8;\",\n" +
                "      \"int a = 6;\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"int b = 8;\",\n" +
                "      \"int b = 2;\",\n" +
                "      \"static Main {\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"int c = a + b\"\n" +
                "    ]\n" +
                "  ],\n" +
                "  \"correctCode\": [\n" +
                "    1,\n" +
                "    1,\n" +
                "    0\n" +
                "  ]\n" +
                "}");
    }



    //C++
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

        cpp.add("{\n" +
                "  \"origCode\": [\n" +
                "    [\n" +
                "      \"int main()\",\n" +
                "      \"void main():\",\n" +
                "      \"void hello();\\nvoid main()\",\n" +
                "      \"void hello();\\nint main()\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"{\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"\\t\\thello();\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"}\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"void hello()\",\n" +
                "      \"int hello()\",\n" +
                "      \"char* hello()\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"{\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"\\t\\tcout << \\\"hello world\\\";\",\n" +
                "      \"\\t\\tcout >> \\\"hello world\\\";\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"}\"\n" +
                "    ]\n" +
                "  ],\n" +
                "  \"prompt\": \"Call a function from main to print \\\"hello world\\\"\",\n" +
                "  \"correctCode\": [\n" +
                "    3,\n" +
                "    0,\n" +
                "    0,\n" +
                "    0,\n" +
                "    0,\n" +
                "    0,\n" +
                "    0,\n" +
                "    0\n" +
                "  ]\n" +
                "}");

        cpp.add("{\n" +
                "  \"origCode\": [\n" +
                "    [\n" +
                "      \"int array[10] = {1,2,3,4,5,6,7,8,9,10};\",\n" +
                "      \"int array[10];\",\n" +
                "      \"int array = {1,2,3,4,5,6,7,8,9,10};\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"for (int x = 1; x <= 10; x++)\",\n" +
                "      \"for (int x = 1; x < 10; x++)\",\n" +
                "      \"for (int x = 1; x => 10; x++)\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"\\t\\tcout << array[x];\",\n" +
                "      \"\\t\\tcout << x;\"\n" +
                "    ]\n" +
                "  ],\n" +
                "  \"prompt\": \"Get an integer from the user and store in a variable\",\n" +
                "  \"correctCode\": [\n" +
                "    0,\n" +
                "    1,\n" +
                "    0\n" +
                "  ]\n" +
                "}");
    }



    //C#
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

        csharp.add("{\n" +
                "  \"origCode\": [\n" +
                "    [\n" +
                "      \"static Pen pen1;\",\n" +
                "      \"static Point point1;\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"Main() {\",\n" +
                "      \"static void Main(string[] args) {\",\n" +
                "      \"static Main {\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"if (point == (0,0)) {\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"return 0;\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"{\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"return 1;\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"}\"\n" +
                "    ]\n" +
                "  ],\n" +
                "  \"prompt\": \"make a point and complete run without error\",\n" +
                "  \"correctCode\": [\n" +
                "    1,\n" +
                "    1,\n" +
                "    0,\n" +
                "    0,\n" +
                "    0,\n" +
                "    0,\n" +
                "    0\n" +
                "  ]\n" +
                "}");

        csharp.add("{\n" +
                "  \"prompt\": \"Add the integers 2 and 8\",\n" +
                "  \"origCode\": [\n" +
                "    [\n" +
                "      \"float a = 2F\",\n" +
                "      \"int a = 8;\",\n" +
                "      \"int a = 6;\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"int b = 8;\",\n" +
                "      \"int b = 2;\",\n" +
                "      \"static Main {\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"int c = a + b\"\n" +
                "    ]\n" +
                "  ],\n" +
                "  \"correctCode\": [\n" +
                "    1,\n" +
                "    1,\n" +
                "    0\n" +
                "  ]\n" +
                "}");

        csharp.add("{\n" +
                "  \"prompt\": \"take the cube of a number and print it\",\n" +
                "  \"origCode\": [\n" +
                "    [\n" +
                "      \"Func<int, int> cube = x -> x * x * x;\",\n" +
                "      \"Func<int, int> cube = x => x * x * x;\",\n" +
                "      \"Func<int, int> cube = x => x * x;\"\n" +
                "    ],\n" +
                "    [\n" +
                "      \"Console.WriteLine(cube(3));\",\n" +
                "      \"System.out.println(square(3));\",\n" +
                "      \"Console.WriteLine(square(3));\"\n" +
                "    ]\n" +
                "  ],\n" +
                "  \"correctCode\": [\n" +
                "    1,\n" +
                "    0\n" +
                "  ]\n" +
                "}");
    }
}
