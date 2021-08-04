package com.example.imageslider.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.imageslider.R
import com.makeramen.roundedimageview.RoundedImageView

class Adapters(var context: Context):RecyclerView.Adapter<Adapters.MyViewHolder>() {
    lateinit var list: List<Int>
    fun setContentList(list: List<Int>) {
        this.list = list
        notifyDataSetChanged()
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var image = itemView.findViewById<RoundedImageView>(R.id.list_item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapters.MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_image, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: Adapters.MyViewHolder, position: Int) {
        holder.image.setImageResource(list[position])
    }

    override fun getItemCount(): Int = list.size
}