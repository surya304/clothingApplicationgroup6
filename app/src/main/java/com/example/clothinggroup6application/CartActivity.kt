package com.example.clothinggroup6application

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class CartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)


        val productImageView = findViewById<ImageView>(R.id.productImageView)
        val productNameTextView = findViewById<TextView>(R.id.productNameTextView)
        val productDescriptionTextView = findViewById<TextView>(R.id.productDescriptionTextView)
        val productPriceTextView = findViewById<TextView>(R.id.productPriceTextView)
        val increaseQuantityButton = findViewById<Button>(R.id.increaseQuantityButton)
        val decreaseQuantityButton = findViewById<Button>(R.id.decreaseQuantityButton)
        val quantityTextView = findViewById<TextView>(R.id.quantityTextView)
        val deleteButton = findViewById<ImageButton>(R.id.deleteButton)


        var quantity = 1

        increaseQuantityButton.setOnClickListener {
            quantity++
            quantityTextView.text = quantity.toString()
        }

        decreaseQuantityButton.setOnClickListener {
            if (quantity > 1) {
                quantity--
                quantityTextView.text = quantity.toString()
            }
        }

        deleteButton.setOnClickListener {

        }
        val signUpButton: Button = findViewById(R.id.checkoutButton)
        signUpButton.setOnClickListener {

            val intent = Intent(this, CheckoutActivity::class.java)
            startActivity(intent)

            finish()
        }


        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.action_home -> {

                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    finish()

                    true

                }
                R.id.action_products -> {
                    val intent = Intent(this, ProductActivity::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                R.id.action_cart -> {
                    val intent = Intent(this, CartActivity::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                R.id.action_login -> {
                    val intent = Intent(this, LoginActivity::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                else -> false
            }
        }






    }
}
