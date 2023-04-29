package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FifthPage : AppCompatActivity() {
        lateinit var tvgoback: TextView
        @SuppressLint("MissingInflatedId")
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            tvgoback=findViewById(R.id.tvgoback)
            tvgoback.setOnClickListener {
                val intent= Intent(this,FirstMeme::class.java)
                startActivity(intent)
            }
        }
    }