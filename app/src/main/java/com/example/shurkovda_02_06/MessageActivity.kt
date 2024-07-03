package com.example.shurkovda_02_06

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MessageActivity : AppCompatActivity() {
    lateinit var name:TextView
    lateinit var message:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)
        name = findViewById(R.id.name)
        message = findViewById(R.id.mess)
        name.text = intent.getStringExtra("name").toString()
        message.text = intent.getStringExtra("mess").toString()

    }
}