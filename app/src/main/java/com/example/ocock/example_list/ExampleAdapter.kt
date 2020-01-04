package com.example.ocock.example_list

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ocock.R

class ExampleAdapter(private val context: Context) : RecyclerView.Adapter<ExampleViewHolder>(){

    var data = listOf<ExampleItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.example_item,parent,false)
        return ExampleViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
        holder.bind(data[position])
    }

}