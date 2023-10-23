package com.example.chatbotui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.chatbotui.R
import com.example.chatbotui.model.Texts

class DMsAdapter(private val context: Context, private val dataset: List<Texts>):RecyclerView.Adapter<DMsAdapter.ViewHolder>() {

    inner class ViewHolder(val itemView: View):RecyclerView.ViewHolder(itemView){
        val imageView = itemView?.findViewById<ImageView>(R.id.hori_IV)
        val name = itemView?.findViewById<TextView>(R.id.horiTV_Name)
        val txtView = itemView?.findViewById<TextView>(R.id.horiTV_txt)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.item_verticals, parent, false)
        return ViewHolder(adapterLayout)
    }

    override fun getItemCount() = dataset.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataset[position]
        holder.txtView?.text = item.text
        holder.imageView?.setImageResource(item.image)
        holder.name?.text = context.getString(item.userName)
    }


}