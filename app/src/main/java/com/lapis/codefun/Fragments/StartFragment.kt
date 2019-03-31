package com.lapis.codefun.Fragments

import android.animation.AnimatorSet
import android.animation.ValueAnimator
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AccelerateDecelerateInterpolator
import android.widget.AdapterView
import androidx.fragment.app.Fragment
import com.lapis.codefun.Activities.GamePage
import com.lapis.codefun.Language
import com.lapis.codefun.LanguageAdapter
import com.lapis.codefun.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class StartFragment : Fragment()
{
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        val view = inflater.inflate(R.layout.activity_main, container, false)

        view.startButton.setOnClickListener {
            startActivity(Intent(view.context, GamePage::class.java))
        }

        val picker = view.languagePicker
        picker.adapter = LanguageAdapter(view.context)
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
        return view
    }
}
