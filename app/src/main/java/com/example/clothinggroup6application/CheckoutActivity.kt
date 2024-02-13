package com.example.clothinggroup6application

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class CheckoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout)

        val backButtonCart: ImageView = findViewById(R.id.backButtonCheckout)
        backButtonCart.setOnClickListener {
            val intent = Intent(this, CartActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
