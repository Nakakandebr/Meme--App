package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondMeme : AppCompatActivity() {
    lateinit var tvNxt:TextView
    lateinit var tvPrevious:TextView
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_meme)
        tvNxt=findViewById(R.id.tvNxt)
        tvPrevious = findViewById(R.id.tvPrevious)
        tvNxt.setOnClickListener {
        val intent = Intent(this,Thirdmeme::class.java)
            startActivity(intent)
    }
        tvPrevious.setOnClickListener {
            val intent = Intent(this,FirstMeme::class.java)
            startActivity(intent)
        }
}
}
