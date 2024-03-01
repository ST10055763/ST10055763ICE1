package com.example.st10055763ice1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeScreenJapanese : AppCompatActivity() {

    private lateinit var  englishButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen_japanese)

        englishButton = findViewById(R.id.btnEnglish)

        englishButton.setOnClickListener{
            var koreanIntent = Intent(this, HomeScreenEng::class.java)
            startActivity(koreanIntent)
        }
    }
}