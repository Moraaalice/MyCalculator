package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var etEnterNumber:EditText
    lateinit var etNumberTwo:EditText
    lateinit var btButtonMinus:Button
    lateinit var btButtonDivide:Button
    lateinit var btButtonMultiply:Button
    lateinit var btButtonAdd:Button
    lateinit var tAnswer:TextView
    lateinit var txTextHead:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etEnterNumber = findViewById(R.id.etEnterNumber)
        etNumberTwo = findViewById(R.id.etNumberTwo)
        btButtonMinus = findViewById(R.id.btButtonMinus)
        btButtonDivide = findViewById(R.id.btButtonDivide)
        btButtonMultiply = findViewById(R.id.btButtonMultiply)
        btButtonAdd = findViewById(R.id.btButtonAdd)
        txTextHead = findViewById(R.id.txTextHead)
        tAnswer = findViewById(R.id.tAnswer)


        btButtonAdd.setOnClickListener {
            val enterTwo = etNumberTwo.text.toString().toInt()
            val enterOne = etEnterNumber.text.toString().toInt()
            val answer  = enterOne +enterTwo
            tAnswer.text = "answer: $answer"
        }
        btButtonMinus.setOnClickListener {
            val enterTwo = etNumberTwo.text.toString().toInt()
            val enterOne = etEnterNumber.text.toString().toInt()
            val answer  = enterOne  -enterTwo
            tAnswer.text = "answer: $answer"


        }
        btButtonMultiply.setOnClickListener {
            val enterTwo = etNumberTwo.text.toString().toInt()
            val enterOne = etEnterNumber.text.toString().toInt()
            val answer  = enterOne *enterTwo
            tAnswer.text = "answer: $answer"
        }
        btButtonDivide.setOnClickListener {
            val enterTwo = etNumberTwo.text.toString().toInt()
            val enterOne = etEnterNumber.text.toString().toInt()
            val answer  = enterOne /enterTwo
            tAnswer.text = "answer: $answer"
        }
//
//
    }
}

