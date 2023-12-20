package com.example.introduce

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView


class homeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homeactivity)

        // Intent로부터 UserID 받아오기
        val userId = intent.getStringExtra("UserId")

        // UserID를 TextView에 설정
        val textView = findViewById<TextView>(R.id.textView3)
        textView.text = "UserID: $userId"

        startActivity(intent)

        val buttonfinish = findViewById<Button>(R.id.button3)
        buttonfinish.setOnClickListener{
            finish()
        }


        }
    }
