package com.example.myprojectandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myprojectandroid.adapter.LanguageAdapter
import com.example.myprojectandroid.model.Language

class ListPemrogramanActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_pemrograman2)
        val RvBhsPemograman: RecyclerView =
            findViewById(R.id.RvBhsPemograman)
        val data = arrayListOf<Language>(
            Language("Golang",R.drawable.golang),
            Language("C++",R.drawable.cplus),
            Language("Pyton",R.drawable.python),
            Language("Golang",R.drawable.golang),
            Language("C++",R.drawable.cplus),
            Language("Pyton",R.drawable.python),
        )

        val adapter = LanguageAdapter(data)
        RvBhsPemograman.adapter = adapter
        RvBhsPemograman.layoutManager =
            LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false)
    }
}