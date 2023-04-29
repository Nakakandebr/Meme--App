package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FourthMeme : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var tvfifth: TextView
        lateinit var tvPrev: TextView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth_meme)
        tvfifth = findViewById(R.id.tvfifth)
        tvPrev = findViewById(R.id.tvPrev)
        tvfifth.setOnClickListener {
            val intent = Intent(this, Fmeme::class.java)
            startActivity(intent)
        }
        tvPrev.setOnClickListener {
            val intent = Intent(this, Thirdmeme::class.java)
            startActivity(intent)
        }
    }
}