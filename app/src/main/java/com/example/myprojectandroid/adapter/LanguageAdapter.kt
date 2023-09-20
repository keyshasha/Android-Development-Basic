package com.example.myprojectandroid.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myprojectandroid.R
import com.example.myprojectandroid.model.Language

class LanguageAdapter(val data: ArrayList<Language>)
    :RecyclerView.Adapter<LanguageAdapter.LanguageViewHolder>()
{
    class LanguageViewHolder (view: View):
    RecyclerView.ViewHolder(view){
        val tvBhsPemogramna: TextView = view.findViewById(R.id.tvBhsPemogramna)
        val ivBhsPemograman: ImageView = view.findViewById(R.id.ivBhsPemograman)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_bahasa_pemograman2,parent,false)
        return LanguageViewHolder(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int) {
       val item = data.get(position)
//        isi data dari model language ke masing masing view
        holder.tvBhsPemogramna.text = item.name
        holder.ivBhsPemograman.setImageResource(item.image)
    }
}