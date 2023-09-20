package com.example.myprojectandroid.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myprojectandroid.R
import com.example.myprojectandroid.model.Doa
import com.example.myprojectandroid.model.Language

class DoaAdapter (val data: ArrayList<Doa>)
    : RecyclerView.Adapter<DoaAdapter.DoaViewHolder>(){

        class DoaViewHolder (view: View)
            :RecyclerView.ViewHolder(view){
            val textpicture: TextView = view.findViewById(R.id.textpicture)
            val picture: ImageView = view.findViewById(R.id.picture)

        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoaAdapter.DoaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_doa,parent,false)
        return DoaAdapter.DoaViewHolder(view)
    }

    override fun onBindViewHolder(holder: DoaAdapter.DoaViewHolder, position: Int) {
        val item = data.get(position)
//        isi data dari model language ke masing masing view
        holder.textpicture.text = item.name
        holder.picture.setImageResource(item.Image)
    }

    override fun getItemCount(): Int  = data.size

}




