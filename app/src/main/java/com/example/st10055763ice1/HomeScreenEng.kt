package com.example.st10055763ice1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeScreenEng : AppCompatActivity() {

    private lateinit var  koreanButton: Button
    private lateinit var  japaneseButton: Button
    private lateinit var  chineseButton: Button
    private lateinit var  arabicButton: Button
    private lateinit var  vietnameseButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen_eng)

        koreanButton = findViewById(R.id.btnKorean)
        japaneseButton = findViewById(R.id.btnJapanese)
        chineseButton = findViewById(R.id.btnChinese)
        arabicButton = findViewById(R.id.btnArabic)
        vietnameseButton = findViewById(R.id.btnVietnamese)

        koreanButton.setOnClickListener{
            var koreanIntent = Intent(this, HomeScreenKorean::class.java)
            startActivity(koreanIntent)
        }

        japaneseButton.setOnClickListener{
            var koreanIntent = Intent(this, HomeScreenJapanese::class.java)
            startActivity(koreanIntent)
        }

        chineseButton.setOnClickListener{
            var koreanIntent = Intent(this, HomeScreenChinese::class.java)
            startActivity(koreanIntent)
        }

        arabicButton.setOnClickListener{
            var koreanIntent = Intent(this, HomeScreenArabic::class.java)
            startActivity(koreanIntent)
        }

        vietnameseButton.setOnClickListener{
            var koreanIntent = Intent(this, HomeScreenVietnamese::class.java)
            startActivity(koreanIntent)
        }

    }
}