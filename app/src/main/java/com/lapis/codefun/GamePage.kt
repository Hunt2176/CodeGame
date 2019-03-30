package com.lapis.codefun

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lapis.codefun.backend.CodeStore
import com.lapis.codefun.backend.GameInstance
import com.lapis.codefun.backend.Games
import com.lapis.codefun.backend.Question
import kotlinx.android.synthetic.main.activity_game_page.*

class GamePage : AppCompatActivity()
{
    val game = GameInstance(1, "python")
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_page)

        submitButton.setOnClickListener {
            //TODO: Add in submit
        }

        val question = game.question

        questionField.text = question.prompt
        questionRecycler.adapter = AnswersAdapter(this, question)
        questionRecycler.layoutManager = GridLayoutManager(this, 1)

    }

    override fun onBackPressed() {
        AlertDialog.Builder(this)
            .setTitle("Quit")
            .setMessage("Would you like to exit to main screen?")
            .setNegativeButton("Quit")
            { _, _ ->
                super.onBackPressed()
            }
            .setPositiveButton("I wanna stay!")
            { _, _ -> }
            .show()
    }
}

class AnswersAdapter(private val context: Context, private val question: Question): RecyclerView.Adapter<AnswerCell>()
{
    override fun getItemCount(): Int = question.origCode.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnswerCell
    {
        return AnswerCell(View.inflate(context, R.layout.answer_view, null))
    }

    override fun onBindViewHolder(answerCell: AnswerCell, position: Int)
    {
        answerCell.setText(question.origCode[position][0])
        answerCell.setAnswers(question.origCode[position])
    }
}

class AnswerCell(view: View): RecyclerView.ViewHolder(view)
{
    private var answerTextView: TextView? = null
    private var answers = arrayOf<String>()

    init
    {
        answerTextView = view.findViewById(R.id.answerTextView)
        view.setOnClickListener {
            if (answers.isEmpty()) return@setOnClickListener

            val popupMenu = PopupMenu(view.context, view)
            answers.forEachIndexed {index, value -> popupMenu.menu.add(value) }

            popupMenu.show()

            popupMenu.setOnMenuItemClickListener {

                return@setOnMenuItemClickListener true
            }
        }
    }

    fun setText(text: String)
    {
        answerTextView?.text = " $text "
    }

    fun setAnswers(answers: Array<String>)
    {
        this.answers = answers
        if (answers.isNotEmpty())
        {
            answerTextView?.background = itemView.resources.getDrawable(R.drawable.border, null)
        }
    }
}
