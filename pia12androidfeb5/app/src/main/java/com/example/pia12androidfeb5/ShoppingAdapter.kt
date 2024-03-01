package com.example.pia12androidfeb5

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ShoppingAdapter : RecyclerView.Adapter<ShoppingAdapter.ViewHolder>(){

    var startfrag : StartFragment? = null

    var shoppingList =  mutableListOf<shopitem>()
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var shoptext = view.findViewById<TextView>(R.id.shoprowText)
        var shopamount = view.findViewById<TextView>(R.id.shoprowAmount)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // skapa rad
        var view = LayoutInflater.from(parent.context).inflate(R.layout.shoppingrow, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        // antal rad
        return shoppingList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // rita rad
        holder.shoptext.text = shoppingList[position].shopname
        holder.shopamount.text = shoppingList[position].shopamount.toString()

        holder.itemView.setOnClickListener {
            Log.i("Pia12debug", "Klick på raden")

            startfrag?.let {
                it.godetail(shoppingList[position])
            }
        }
    }
}

class shopitem {
    var shopname = ""
    var shopamount = 0
}