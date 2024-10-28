package com.fadhlur.klinikmi2c.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.fadhlur.klinikmi2c.R
import com.fadhlur.klinikmi2c.model.ModelMenuIcon
import com.fadhlur.klinikmi2c.screen.HomeDoctorsActivity

class MenuIconAdapter (

    val itemMenuList : List<ModelMenuIcon>
) : RecyclerView.Adapter<MenuIconAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgMenuIcon: ImageView = itemView.findViewById(R.id.imgMenuIcon)
        var txtMenuIcon: TextView = itemView.findViewById(R.id.txtMenuIcon)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_menu_home, parent, false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemMenuList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = itemMenuList[position]
        holder.txtMenuIcon.text = currentItem.NamaMenu
        holder.imgMenuIcon.setImageResource(currentItem.IconMenu)
    }
}