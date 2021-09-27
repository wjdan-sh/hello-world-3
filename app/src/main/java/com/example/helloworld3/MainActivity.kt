package com.example.helloworld3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val add = findViewById<Button>(R.id.add)
        val sub = findViewById<Button>(R.id.sub)
        val num1 =findViewById<EditText>(R.id.Number1)
        val num2 = findViewById<EditText>(R.id.Number2)
        val answer= findViewById<TextView>(R.id.answer)

        add.setOnClickListener {
            val sum = num1.text.toString().toInt() + num2.text.toString().toInt()
            answer.text = " $sum "
        }
        sub.setOnClickListener {
            val sum = num1.text.toString().toInt() - num2.text.toString().toInt()
            answer.text = " $sum "
        }
    }
}