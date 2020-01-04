package com.example.ocock

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        val ab = supportActionBar!!
        ab.setDisplayShowTitleEnabled(false)

        search_img.setOnClickListener {
            Toast.makeText(applicationContext,"search",Toast.LENGTH_SHORT).show()
        }

        star_img.setOnClickListener {
            Toast.makeText(applicationContext,"star",Toast.LENGTH_SHORT).show()
        }

        etc_img.setOnClickListener {
            Toast.makeText(applicationContext,"etc",Toast.LENGTH_SHORT).show()
        }
    }
}
