package com.example.fjr_20191114

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView


class RecyclerAdapter(private val userList: ArrayList<User>, private val recycleInterface: RecylerInterface ) :
    RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.txtName.text = userList[position].name
        holder.txtTitle.text = userList[position].title
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        v.setOnClickListener {
            recycleInterface.onClickShowToast()
            recycleInterface.addUser()
        }
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtName = itemView.findViewById<TextView>(R.id.txtName)!!
        val txtTitle = itemView.findViewById<TextView>(R.id.txtTitle)!!

    }

    interface RecylerInterface {
        fun onClickShowToast()
        fun addUser()
    }

}