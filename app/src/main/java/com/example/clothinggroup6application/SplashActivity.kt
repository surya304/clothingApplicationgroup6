package com.example.clothinggroup6application

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.util.logging.Handler

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Delaying for a few seconds before navigating to the next screen
        val handler = android.os.Handler()
        handler.postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_DELAY)


    }

    companion object {
        const val SPLASH_DELAY: Long = 1200 // 1.2 seconds
    }
}