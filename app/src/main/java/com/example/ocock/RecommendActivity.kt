package com.example.ocock

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ocock.select_list.SelectAdapter
import com.example.ocock.select_list.SelectItem
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_recommend.*

class RecommendActivity : AppCompatActivity() {

    private lateinit var selectList: RecyclerView
    private lateinit var selectAdapter: SelectAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recommend)

        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        val ab = supportActionBar!!
        ab.setDisplayShowTitleEnabled(false)

        initSelect()
        next_btn.setOnClickListener {
            var intent = Intent(this, ResultActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun initSelect(){
        selectList = findViewById(R.id.select_list)
        selectAdapter = SelectAdapter(this)
        selectList.adapter = selectAdapter
        selectList.layoutManager = LinearLayoutManager(this)

        selectAdapter.data = listOf(
            SelectItem(
                select = true,
                item = "민트"
            ),
            SelectItem(
                select = false,
                item = "커피"
            ),
            SelectItem(
                select = false,
                item = "메론"
            ),
            SelectItem(
                select = false,
                item = "탄산"
            ),
            SelectItem(
                select = true,
                item = "에너지드링크"
            ),
            SelectItem(
                select = false,
                item = "초코"
            ),
            SelectItem(
                select = false,
                item = "우유"
            )
        )
    }
}
