package com.example.ocock.search_list

import androidx.recyclerview.widget.RecyclerView
import com.example.ocock.example_list.ExampleItem

data class SearchItem(
    val category: String,
    val list: List<ExampleItem>
)