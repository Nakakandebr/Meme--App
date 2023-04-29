package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Thirdmeme : AppCompatActivity() {
    lateinit var tvNexts:TextView
    lateinit var tvPrvs:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thirdmeme)
        tvNexts = findViewById(R.id.tvNexts)
        tvPrvs = findViewById(R.id.tvPrvs)
        tvNexts.setOnClickListener {
            val intent = Intent(this,FourthMeme::class.java)
            startActivity(intent)
        }
        tvPrvs.setOnClickListener {
            val intent =Intent(this,SecondMeme::class.java)
            startActivity(intent)
        }
    }
}