package com.example.clothinggroup6application

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.google.firebase.storage.FirebaseStorage

class ProductDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productdetails)

        val name = intent.getStringExtra("name")
        val rating = intent.getFloatExtra("rating", 0.0f)
        val price = intent.getDoubleExtra("price", 0.0)
        val description = intent.getStringExtra("description")
        val image = intent.getStringExtra("image")

        val nameTextView: TextView = findViewById<TextView>(R.id.txtName_details)
        val ratingBar: TextView = findViewById<TextView>(R.id.txtRating_details)
        val priceTextView: TextView = findViewById<TextView>(R.id.txtPrice_details)
        val descriptionTextView: TextView = findViewById<TextView>(R.id.txtDescription_details)
        val imgPhoto: ImageView = findViewById<ImageView>(R.id.imgPhoto_details)




        nameTextView.text = name
        ratingBar.text = rating.toString()
        priceTextView.text = price.toString()
        descriptionTextView.text = description

        val cartButton_details: Button = findViewById<Button>(R.id.cartButton_details)
        cartButton_details.setOnClickListener {

            val intent = Intent(this, CartActivity::class.java)
            startActivity(intent)

            finish()
        }


    }


}



