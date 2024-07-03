package com.example.shurkovda_02_06

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Spinner

class ChatsActivity : AppCompatActivity() {
    lateinit var spinner: Spinner

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chats)
        spinner = findViewById(R.id.spinner)
        if (spinner.selectedItemPosition == 1)
        {
            var intent = Intent(this, MessageActivity::class.java)
            intent.putExtra("name", "John Joshua")
            intent.putExtra("mess", "Thanks for your service")
            startActivity(intent)
        }
        else if (spinner.selectedItemPosition == 2)
        {
            var intent = Intent(this, MessageActivity::class.java)
            intent.putExtra("name", "Chinonso James")
            intent.putExtra("mess", "Alright, I wll be waiting")
            startActivity(intent)
        }
        else if (spinner.selectedItemPosition == 3)
        {
            var intent = Intent(this, MessageActivity::class.java)
            intent.putExtra("name", "Raph Ron")
            intent.putExtra("mess", "Thanks for your service")
            startActivity(intent)
        }
        else if (spinner.selectedItemPosition == 4 || spinner.selectedItemPosition == 5)
        {
            var intent = Intent(this, MessageActivity::class.java)
            intent.putExtra("name", "Joy Ezekiel")
            intent.putExtra("mess", "Thanks for your service")
            startActivity(intent)
        }
    }
}