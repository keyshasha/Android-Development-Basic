package com.example.myprojectandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ListNama_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_nama)
//        define array adapter
        val arrayAdapter:ArrayAdapter<*>
        val users = arrayOf(
            "Steve Smith", "Ross Taylor", "Rohit Sharma"
        )
//        deklarasikan variabel list view

        val mListView: ListView = findViewById(R.id.LvNama)
//        panggil array adpter (this, layout_sample,data)

        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,users)

//        isi adapter
        mListView.adapter = arrayAdapter
    }
}