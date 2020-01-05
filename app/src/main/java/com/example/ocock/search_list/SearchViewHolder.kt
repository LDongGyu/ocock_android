package com.example.ocock.search_list

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ocock.R
import com.example.ocock.example_list.ExampleAdapter
import kotlinx.android.synthetic.main.search_item.view.*

class SearchViewHolder (view: View) : RecyclerView.ViewHolder(view){
    var categoryTxt: TextView = view.findViewById(R.id.category_txt)
    var cockList: RecyclerView = view.findViewById(R.id.cock_list)
    var cockAdapter = ExampleAdapter(view.context)

    fun bind(data: SearchItem){
        categoryTxt.text = data.category
        cockList.adapter = cockAdapter
        cockList.layoutManager = LinearLayoutManager(itemView.context,LinearLayoutManager.HORIZONTAL,false)
        cockAdapter.data  = data.list
    }
}