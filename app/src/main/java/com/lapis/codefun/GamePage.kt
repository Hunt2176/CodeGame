package com.lapis.codefun

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import android.widget.TextView
import android.widget.Toast
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
    val game = GameInstance.createInstance(CodeStore.sizeOf(Language.current) - 1, Language.current)
    var question: Question? = game.question
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_page)

        if (question == null) gameOver()

        questionField.text = question!!.prompt
        val answersAdapter = AnswersAdapter(this, question!!)
        questionRecycler.adapter = answersAdapter
        questionRecycler.layoutManager = GridLayoutManager(this, 1)

        submitButton.setOnClickListener {
            val correct = game.submit(answersAdapter.getAnswers().toIntArray(), question)
            println("$correct of ${question!!.origCode.size}")
            Toast.makeText(this,
                    if (correct == question!!.origCode.size) { "Correct!" }
                    else "Oh no! It was incorrect!",
                    Toast.LENGTH_LONG)
                .show()
            question = game.question

            if (question == null)
            {
                gameOver()
            }
            else
            {
                questionField.text = question!!.prompt
                answersAdapter.setQuestion(question!!)
            }
        }

    }

    fun gameOver()
    {
        this.onBackPressed()
    }

    override fun onBackPressed()
    {
        if (question == null)
        {
            super.onBackPressed()
        }
        else
        {
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
}

class AnswersAdapter(private val context: Context, private var question: Question): RecyclerView.Adapter<AnswerCell>()
{
    val answers = arrayListOf<AnswerCell>()
    override fun getItemCount(): Int = question.origCode.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnswerCell
    {
        return AnswerCell(View.inflate(context, R.layout.answer_view, null))
    }

    override fun onBindViewHolder(answerCell: AnswerCell, position: Int)
    {
        answerCell.setText(question.origCode[position][0])
        answerCell.setAnswers(question.origCode[position])
        answers.add(answerCell)
    }

    fun setQuestion(question: Question)
    {
        this.question = question
        answers.clear()
        this.notifyDataSetChanged()
    }

    fun getAnswers(): Array<Int>
    {
        return answers.map { it.getCurrentAnswer() }.toTypedArray()
    }
}

class AnswerCell(view: View): RecyclerView.ViewHolder(view)
{
    private var answerTextView: TextView? = null
    private var answers = arrayOf<String>()
    private var selectedIndex = 0

    init
    {
        answerTextView = view.findViewById(R.id.answerTextView)
        view.setOnClickListener {
            if (answers.size <= 1) return@setOnClickListener

            val popupMenu = PopupMenu(view.context, view)
            answers.forEachIndexed {index, value -> popupMenu.menu.add(0, index, 0, value) }

            popupMenu.show()

            popupMenu.setOnMenuItemClickListener {
                setText(answers[it.itemId])
                selectedIndex = it.itemId
                return@setOnMenuItemClickListener true
            }
        }
    }

    fun getCurrentAnswer(): Int
    {
        return selectedIndex
    }

    fun setText(text: String)
    {
        answerTextView?.text = " $text "
    }

    fun setAnswers(answers: Array<String>)
    {
        this.answers = answers
        if (answers.size > 1)
        {
            answerTextView?.background = itemView.resources.getDrawable(R.drawable.border, null)
        }
    }
}
