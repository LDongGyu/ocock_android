package com.example.ocock.example_list

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ocock.R

class ExampleViewHolder(view : View) : RecyclerView.ViewHolder(view){
    val cockImage: ImageView = view.findViewById(R.id.cock_img)
    val cockNameText: TextView = view.findViewById(R.id.cock_name_txt)

    fun bind(data: ExampleItem){
        cockImage.setImageResource(data.cockImg)
        cockNameText.text = data.cockName
    }
}