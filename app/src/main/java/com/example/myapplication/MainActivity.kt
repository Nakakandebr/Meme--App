package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import javax.security.auth.login.LoginException

class MainActivity : AppCompatActivity() {
    lateinit var tvLogin:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvLogin=findViewById(R.id.tvLogin)
        tvLogin.setOnClickListener {
            val intent=Intent(this,FirstMeme::class.java)
            startActivity(intent)
        }
    }
}