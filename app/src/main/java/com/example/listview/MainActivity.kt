package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)

        val listViewOptions = listOf("Three Days Grace", "Shinedown", "Five Finger Death Punch",
                                    "Godsmack", "Linkin Park", "Bad Wolves", "Evanescence")

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listViewOptions)
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_1)
        listView.adapter = adapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, listViewOptions[position], Toast.LENGTH_SHORT).show()
        }
    }
}