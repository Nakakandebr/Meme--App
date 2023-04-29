package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FourthMeme : AppCompatActivity() {
    lateinit var tvNextpagefive:TextView
    lateinit var tvprev:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth_meme)
        tvNextpagefive = findViewById(R.id.tvNextpagefive)
        tvprev = findViewById(R.id.tvPrev)
        tvNextpagefive.setOnClickListener {
            val intent = Intent(this, FifthPage::class.java)
            startActivity(intent)

        }
        tvprev.setOnClickListener {
            val intent = Intent(this, SecondMeme::class.java)
            startActivity(intent)
        }
    }
}