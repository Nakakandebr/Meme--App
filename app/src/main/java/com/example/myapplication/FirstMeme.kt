package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FirstMeme : AppCompatActivity() {
    lateinit var tvNext:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_meme)
        tvNext=findViewById(R.id.tvNext)
        tvNext.setOnClickListener {
            val intent=Intent(this,SecondMeme::class.java)
            startActivity(intent)
        }
    }
}