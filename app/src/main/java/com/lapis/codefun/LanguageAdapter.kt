package com.lapis.codefun

import android.content.Context
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

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