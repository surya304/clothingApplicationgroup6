package com.example.clothinggroup6application

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.firebase.ui.database.FirebaseRecyclerOptions
import com.google.firebase.database.FirebaseDatabase

class ProductActivity : AppCompatActivity() {

    private lateinit var productsGridView: RecyclerView
    private lateinit var adapter: ProductAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clothing)
        productsGridView = findViewById(R.id.productsGridView)
        val query = FirebaseDatabase.getInstance().reference.child("product")

        val options = FirebaseRecyclerOptions.Builder<Product>()
            .setQuery(query, Product::class.java)
            .build()

        adapter = ProductAdapter(options)
        productsGridView.layoutManager = GridLayoutManager(this, 2)
        productsGridView.adapter = adapter



    }

    override fun onStart() {
        super.onStart()
        adapter.startListening()
    }

    override fun onStop() {
        super.onStop()
        adapter.stopListening()
    }
}

