package com.example.ocock

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ocock.example_list.ExampleAdapter
import com.example.ocock.example_list.ExampleItem
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.etc_img
import kotlinx.android.synthetic.main.activity_main.search_img
import kotlinx.android.synthetic.main.activity_main.star_img
import kotlinx.android.synthetic.main.activity_main.today_cock_lay

class MainActivity : AppCompatActivity() {

    private lateinit var exampleList: RecyclerView
    private lateinit var exampleAdapter: ExampleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        val ab = supportActionBar!!
        ab.setDisplayShowTitleEnabled(false)

        search_img.setOnClickListener {
            val intent = Intent(applicationContext, SearchActivity::class.java)
            startActivity(intent)
        }

        star_img.setOnClickListener {
            Toast.makeText(applicationContext,"star",Toast.LENGTH_SHORT).show()
        }

        etc_img.setOnClickListener {
            Toast.makeText(applicationContext,"etc",Toast.LENGTH_SHORT).show()
        }

        initExample()

        today_cock_lay.setOnClickListener {
            var intent = Intent(applicationContext,DetailActivity::class.java)
            startActivity(intent)
        }

        recom_btn.setOnClickListener{
            var intent = Intent(applicationContext,RecommendActivity::class.java)
            startActivity(intent)
        }
    }

    private fun initExample(){
        exampleList = findViewById(R.id.example_list)
        exampleAdapter = ExampleAdapter(this)
        exampleList.adapter = exampleAdapter
        exampleList.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)

        exampleAdapter.data = listOf(
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
            ),
            ExampleItem(
                cockImg = R.drawable.bluesky,
                cockName = "블루 스카이"
            )
        )

        exampleAdapter.notifyDataSetChanged()
    }
}
