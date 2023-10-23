package com.example.chatbotui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.chatbotui.R
import com.example.chatbotui.model.User

class UserAdapter(private val context: Context, private val dataset: List<User>):RecyclerView.Adapter<UserAdapter.ViewHolder>() {

    inner class ViewHolder(val itemView: View):RecyclerView.ViewHolder(itemView){
        val imageView = itemView?.findViewById<ImageView>(R.id.imageView)
        val txtView = itemView?.findViewById<TextView>(R.id.vertiTV_Name)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.item_horizontals, parent, false)

        return ViewHolder(adapterLayout)
    }

    override fun getItemCount() = dataset.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataset[position]
        holder.txtView?.text = context.resources.getString(item.userName)
        holder.imageView?.setImageResource(item.image)
    }


}