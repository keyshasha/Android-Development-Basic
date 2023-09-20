package com.example.myprojectandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class LatihanListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_list)
        val arrayAdapter: ArrayAdapter<*>
        val users = arrayOf(
            "Pyton", "C#", "C++" , "JavaScript" , "PHP" , "Swift", "Java", "Go","SQL","Ruby"
        )
//        deklarasikan variabel list view

        val mListView: ListView = findViewById(R.id.rvlatihan)
//        panggil array adpter (this, layout_sample,data)

        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,users)

//        isi adapter
        mListView.adapter = arrayAdapter
    }
}