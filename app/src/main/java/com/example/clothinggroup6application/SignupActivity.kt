package com.example.clothinggroup6application

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SignupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val signUpButton: Button = findViewById(R.id.signUpButton)
        signUpButton.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

            finish()
        }
    }
}
