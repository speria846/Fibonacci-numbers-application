package com.speria.fibonacci_series_activity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NumberRecyclerViewAdapter (var namesList:List<Int>):
    RecyclerView.Adapter<NumberViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        var itemView= LayoutInflater.from(parent.context)
            .inflate(R.layout.names_list_item,parent,false)
        return NumberViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.tvNames.text= namesList[position].toString()
    }

    override fun getItemCount(): Int {
        return namesList.size
    }
}
class NumberViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvNames=itemView.findViewById<TextView>(R.id.tvNames)
}
