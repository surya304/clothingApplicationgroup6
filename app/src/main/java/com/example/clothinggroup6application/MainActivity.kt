package com.example.clothinggroup6application

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.firebase.ui.database.FirebaseRecyclerOptions
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val signUpButton: Button = findViewById(R.id.homeButton)
        signUpButton.setOnClickListener {

            val intent = Intent(this, ProductActivity::class.java)
            startActivity(intent)

            finish()
        }

    }



}
