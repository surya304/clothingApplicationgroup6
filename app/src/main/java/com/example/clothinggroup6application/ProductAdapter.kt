package com.example.clothinggroup6application

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.firebase.ui.database.FirebaseRecyclerAdapter
import com.firebase.ui.database.FirebaseRecyclerOptions
import com.google.firebase.storage.FirebaseStorage
import org.w3c.dom.Text

class ProductAdapter(options: FirebaseRecyclerOptions<Product>)
    : FirebaseRecyclerAdapter<Product, ProductAdapter.MyViewHolder>(options)
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return MyViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int, model: Product) {
        holder.txtName.text = model.name
        holder.txtRating.text = model.rating
        holder.txtPrice.text = model.price
        holder.txtDescription.text = model.description
        var theImage: String = model.image

        if(theImage.indexOf("gs://")>-1) {
            val storageReference = FirebaseStorage.getInstance().getReferenceFromUrl(theImage)
            Glide.with(holder.imgPhoto.context)
                .load(storageReference)
                .into(holder.imgPhoto)
        } else {
            Glide.with(holder.imgPhoto.context)
                .load(theImage)
                .into(holder.imgPhoto)
        }
    }
    // Commit
    class MyViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
        RecyclerView.ViewHolder(inflater.inflate(R.layout.item_product, parent, false)) {
        val txtName: TextView = itemView.findViewById(R.id.txtName)
        val txtRating: TextView = itemView.findViewById(R.id.txtRating)
        val imgPhoto: ImageView = itemView.findViewById(R.id.imgPhoto)
        val txtPrice: TextView = itemView.findViewById(R.id.txtPrice)
        val txtDescription: TextView = itemView.findViewById(R.id.txtDescription)

    }
}