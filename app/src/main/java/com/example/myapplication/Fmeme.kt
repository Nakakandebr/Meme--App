package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Fmeme : AppCompatActivity() {
    lateinit var tvpr:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fmeme)
        tvpr=findViewById(R.id.tvpr)
        tvpr.setOnClickListener {
            val intent=Intent(this,FourthMeme::class.java)
            startActivity(intent)
        }
    }
}