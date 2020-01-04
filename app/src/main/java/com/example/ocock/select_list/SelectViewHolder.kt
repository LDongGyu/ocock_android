package com.example.ocock.select_list

import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ocock.R


class SelectViewHolder(view : View) : RecyclerView.ViewHolder(view){
    val selectCheck: CheckBox = view.findViewById(R.id.select_check)
    val itemText: TextView = view.findViewById(R.id.item_txt)

    fun bind(data: SelectItem){
        selectCheck.isChecked = data.select
        itemText.text = data.item
    }
}