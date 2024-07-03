package com.example.shurkovda_02_06

import android.annotation.SuppressLint
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var login: EditText
    lateinit var password: EditText
    lateinit var shared: SharedPreferences
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        login = findViewById(R.id.login)
        password = findViewById(R.id.password)
        shared = getSharedPreferences("data", MODE_PRIVATE)
    }

    fun next(view: View) {
        var log = login.text.toString()
        var pass = password.text.toString()

        if (log.isEmpty() || pass.isEmpty())
        {
            Toast.makeText(this, "Введите логин и пароль", Toast.LENGTH_SHORT)
        }
        else if (pass.length<6)
        {
            Toast.makeText(this, "Для ввода пароля необходимо минимум 6 символов", Toast.LENGTH_SHORT)
        }
        else
        {
            shared = getSharedPreferences("data", MODE_PRIVATE)
            var correctLogin = shared.getString("login", null)
            var correctPassword = shared.getString("password", null)
            if (correctLogin != null && correctPassword != null)
            {
                if (correctLogin == log && correctPassword == pass)
                {
                    var intent = Intent(this, ChatsActivity::class.java)
                    startActivity(intent)
                }
                else
                {
                    Toast.makeText(this, "Логин или пароль введен неверно", Toast.LENGTH_SHORT)
                }
            }
            else
            {
                var edit = shared.edit()
                edit.putString("login", log)
                edit.putString("password", pass)
                edit.apply()
            }

        }
    }
}