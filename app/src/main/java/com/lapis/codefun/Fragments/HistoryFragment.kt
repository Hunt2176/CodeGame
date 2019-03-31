package com.lapis.codefun.Fragments

import android.content.Context
import android.os.Bundle
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lapis.codefun.R
import com.lapis.codefun.backend.Tracker
import kotlinx.android.synthetic.main.cell_history.view.*
import kotlinx.android.synthetic.main.fragment_history.view.*

class HistoryFragment(): Fragment()
{
    var adapter: HistoryAdapter? = null
    var tracker: Tracker? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        val view = inflater.inflate(R.layout.fragment_history, container, false)
        adapter = HistoryAdapter(view.context, tracker ?: Tracker())
        view.historyRecycler.adapter = adapter
        view.historyRecycler.layoutManager = GridLayoutManager(view.context, 1)
        view.historyRecycler.addItemDecoration(DividerItemDecoration(view.context, DividerItemDecoration.HORIZONTAL))
        return view
    }

    fun updateTracker(tracker: Tracker)
    {
        this.tracker = tracker
        adapter?.setNewTracker(tracker)
    }
}

class HistoryAdapter(private val context: Context, private var tracker: Tracker): RecyclerView.Adapter<HistoryCell>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryCell
    {
        return  HistoryCell(View.inflate(context, R.layout.cell_history, null))
    }
    override fun getItemCount(): Int = tracker.gameHistory.size

    override fun onBindViewHolder(cell: HistoryCell, position: Int)
    {
        val game = tracker.gameHistory[position]
        cell.setScore(game.score.toString())
        cell.setPercent(game.percentCorrect.toString())
        cell.setLang(game.language.toString())
    }

    fun setNewTracker(tracker: Tracker)
    {
        this.tracker = tracker
        this.notifyDataSetChanged()
    }
}

class HistoryCell(view: View): RecyclerView.ViewHolder(view)
{
    private var scoreView: TextView? = null
    private var percentView: TextView? = null
    private var langView: TextView? = null

    init
    {
        scoreView = view.scoreView
        percentView = view.percentView
        langView = view.langView
    }

    fun setScore(score: String)
    {
        scoreView?.text = Html.fromHtml(score, Html.FROM_HTML_MODE_LEGACY)
    }

    fun setPercent(percent: String)
    {
        percentView?.text = Html.fromHtml(percent, Html.FROM_HTML_MODE_LEGACY)
    }

    fun setLang(lang: String)
    {
        langView?.text = Html.fromHtml(lang, Html.FROM_HTML_MODE_LEGACY)
    }
}