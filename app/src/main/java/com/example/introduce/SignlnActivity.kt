package com.example.introduce

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignlnActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn_1 = findViewById<Button>(R.id.button1)
        btn_1.setOnClickListener{

            val userId = findViewById<EditText>(R.id.editText1).text.toString()
            val password = findViewById<EditText>(R.id.editText2).text.toString()

            if (userId.isNotEmpty() && password.isNotEmpty()){
                val intent = Intent(this, homeActivity::class.java)
                intent.putExtra("UswerId",userId)
                intent.putExtra("Password",password)
                startActivity(intent)
            } else{

                Toast.makeText(
                    this,"아이디/비밀번호를 확인해주세요",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }


            val intent = Intent(this, homeActivity::class.java)

            intent.putExtra("PassWord",password)

            startActivity(intent)

        }

        val btn_2 = findViewById<Button>(R.id.button2)
        btn_2.setOnClickListener{
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)

        }

    }
}



