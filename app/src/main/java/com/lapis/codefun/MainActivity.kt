package com.lapis.codefun

import android.animation.AnimatorSet
import android.animation.ValueAnimator
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.view.animation.AccelerateDecelerateInterpolator
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.TextView
import com.lapis.codefun.backend.GameInstance
import com.lapis.codefun.backend.Tracker
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startButton.setOnClickListener {
            startActivity(Intent(this, GamePage::class.java))
        }

        val picker = languagePicker
        picker.adapter = LanguageAdapter(this)
        picker.onItemSelectedListener = object: AdapterView.OnItemSelectedListener
        {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long)
            {
                val icon = when (position) {
                    0 ->
                    {
                        Language.current = Language.values()[position]
                        resources.getDrawable(R.drawable.java_icon, null)
                    }
                    1 ->
                    {
                        Language.current = Language.values()[position]
                        resources.getDrawable(R.drawable.python_icon, null)
                    }
                    2 ->
                    {
                        Language.current = Language.values()[position]
                        resources.getDrawable(R.drawable.cpp_icon, null)
                    }
                    3 ->
                    {
                        Language.current = Language.values()[position]
                        resources.getDrawable(R.drawable.csharp_icon, null)
                    }
                    else -> null
                } ?: return
                val valueAnimator = ValueAnimator.ofInt(0, 100)
                valueAnimator.addUpdateListener { animation ->
                    iconView.alpha = animation.animatedFraction
                    if ((animation.animatedValue as Int) == 0)
                    {
                        iconView.setImageDrawable(icon)
                    }
                }
                val set = AnimatorSet()
                set.interpolator = AccelerateDecelerateInterpolator()
                set.play(valueAnimator)
                set.start()
            }
        }
    }

    override fun onPostResume() {
        super.onPostResume()
        println("HAS RESUMED")
        val instance = GameInstance.getInstance() ?: return

    }
}

class LanguageAdapter(context: Context):
    ArrayAdapter<String>(context, android.R.layout.simple_spinner_item, Language.values().map { it.toString() })
{
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View
    {
        val view = super.getView(position, convertView, parent)
        (view as TextView).gravity = Gravity.CENTER
        return view
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View
    {
        val view = super.getDropDownView(position, convertView, parent)
        (view as TextView).gravity = Gravity.CENTER
        return view
    }
}

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