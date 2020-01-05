package com.example.ocock

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ocock.example_list.ExampleItem
import com.example.ocock.search_list.SearchAdapter
import com.example.ocock.search_list.SearchItem

class SearchActivity : AppCompatActivity() {

    private lateinit var searchList: RecyclerView
    private lateinit var searchAdapter: SearchAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        val ab = supportActionBar!!
        ab.setDisplayShowTitleEnabled(false)

        initSearch()
    }

    private fun initSearch(){
        searchList = findViewById(R.id.cock_list)
        searchAdapter = SearchAdapter(this)
        searchList.adapter = searchAdapter
        searchList.layoutManager = LinearLayoutManager(this)

        searchAdapter.data = listOf(
            SearchItem(
                category = "ㄱ",
                list = listOf(
                    ExampleItem(
                        cockImg = R.drawable.bluesky,
                        cockName = "블루 스카이"
                    ),
                    ExampleItem(
                        cockImg = R.drawable.bluesky,
                        cockName = "블루 스카이"
                    ),
                    ExampleItem(
                        cockImg = R.drawable.bluesky,
                        cockName = "블루 스카이"
                    ),
                    ExampleItem(
                        cockImg = R.drawable.bluesky,
                        cockName = "블루 스카이"
                    )
                )
            ),
            SearchItem(
                category = "ㄴ",
                list = listOf(
                    ExampleItem(
                        cockImg = R.drawable.bluesky,
                        cockName = "블루 스카이"
                    ),
                    ExampleItem(
                        cockImg = R.drawable.bluesky,
                        cockName = "블루 스카이"
                    ),
                    ExampleItem(
                        cockImg = R.drawable.bluesky,
                        cockName = "블루 스카이"
                    ),
                    ExampleItem(
                        cockImg = R.drawable.bluesky,
                        cockName = "블루 스카이"
                    )
                )
            ),
            SearchItem(
                category = "ㄷ",
                list = listOf(
                    ExampleItem(
                        cockImg = R.drawable.bluesky,
                        cockName = "블루 스카이"
                    ),
                    ExampleItem(
                        cockImg = R.drawable.bluesky,
                        cockName = "블루 스카이"
                    ),
                    ExampleItem(
                        cockImg = R.drawable.bluesky,
                        cockName = "블루 스카이"
                    ),
                    ExampleItem(
                        cockImg = R.drawable.bluesky,
                        cockName = "블루 스카이"
                    )
                )
            ),
            SearchItem(
                category = "ㄹ",
                list = listOf(
                    ExampleItem(
                        cockImg = R.drawable.bluesky,
                        cockName = "블루 스카이"
                    ),
                    ExampleItem(
                        cockImg = R.drawable.bluesky,
                        cockName = "블루 스카이"
                    ),
                    ExampleItem(
                        cockImg = R.drawable.bluesky,
                        cockName = "블루 스카이"
                    ),
                    ExampleItem(
                        cockImg = R.drawable.bluesky,
                        cockName = "블루 스카이"
                    )
                )
            )
        )
    }
}
