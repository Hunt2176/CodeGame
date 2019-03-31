package com.lapis.codefun

enum class Language
{
    JAVA, PYTHON, CPP, CSHARP;

    companion object
    {
        var current = JAVA
    }

    override fun toString(): String
    {
        return when(this)
        {
            JAVA -> "Java"
            PYTHON -> "Python"
            CPP -> "C++"
            CSHARP -> "C#"
        }
    }
}