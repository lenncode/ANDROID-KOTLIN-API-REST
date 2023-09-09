package com.lenncode.kotlin_api_rest

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DogAdapter(val image: List<String>) : RecyclerView.Adapter<DogViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        return DogViewHolder(layoutInflater.inflate(R.layout.item_dog, parent, false))
    }


    override fun getItemCount(): Int = image.size

    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        val item = image[position]
        holder.bind(item)

    }
}