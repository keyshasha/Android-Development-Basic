package com.example.myprojectandroid

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myprojectandroid.adapter.DoaAdapter
import com.example.myprojectandroid.adapter.LanguageAdapter
import com.example.myprojectandroid.model.Doa
import com.example.myprojectandroid.model.Language

class DasboardDoaActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dasboard_doa)
        val listdoa: RecyclerView =
            findViewById(R.id.listdoa)
        val data = arrayListOf<Doa>(
            Doa("Dzikir dan Doa Sunnah Setelah Shalat",R.drawable.doa_harian2),
            Doa("Dzikir Harian",R.drawable.doa_harian2),
            Doa("Dzikir dan Doa Sunnah Setelah Shalat",R.drawable.doa_harian2),
            Doa("Dzikir Harian",R.drawable.doa_harian2),
            Doa("Dzikir dan Doa Sunnah Setelah Shalat",R.drawable.doa_harian2),
            Doa("Dzikir Harian",R.drawable.doa_harian2)
        )

        val adapter = DoaAdapter(data)
        listdoa.adapter = adapter
        listdoa.layoutManager =
            LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false)

        val cvSelengkapnya:CardView = findViewById(R.id.cvSelengkapnya)

//        action
//        pindah activity pake intent

        cvSelengkapnya.setOnClickListener{
            val intent = Intent( this,DoaHarianActivity::class.java)
            startActivity(intent)
        }

    }
}