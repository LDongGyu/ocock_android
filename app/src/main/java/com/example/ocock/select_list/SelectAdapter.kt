package com.example.ocock.select_list

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ocock.R

class SelectAdapter(private val context: Context) : RecyclerView.Adapter<SelectViewHolder>(){

    var data = listOf<SelectItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SelectViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.select_item,parent,false)
        return SelectViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: SelectViewHolder, position: Int) {
        holder.bind(data[position])
    }

}