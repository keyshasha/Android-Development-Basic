package com.example.myprojectandroid.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myprojectandroid.R
import com.example.myprojectandroid.model.DoaHarian

class DoaHarainAdapter(val data:ArrayList<DoaHarian>)
    :RecyclerView.Adapter<DoaHarainAdapter.DoaHarianViewHolder>(){
    class DoaHarianViewHolder(view: View)
        :RecyclerView.ViewHolder(view)
    {
        val tvJudulDoa:TextView=view.findViewById(R.id.tvJudulDoa)
        val tvDoaArab:TextView=view.findViewById(R.id.tvDoaArab)
        val tvDoaLatin:TextView=view.findViewById(R.id.tvDoaLatin)
        val ibColapse:ImageButton=view.findViewById(R.id.ibColapse)
        val rlIsiDoan: RelativeLayout=view.findViewById(R.id.rlIsiDoa)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoaHarianViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_doa_harian,parent,false)
        return DoaHarianViewHolder(view)
    }

    override fun onBindViewHolder(holder: DoaHarianViewHolder, position: Int) {
        val item = data.get(position)
        holder.tvJudulDoa.text = item.judul
        holder.tvDoaArab.text = item.textArab
        holder.tvDoaLatin.text = item.textLatin
//        disini kita buat colapse sama seperti di latihan visible
        holder.ibColapse.setOnClickListener{
            if(holder.rlIsiDoan.visibility == View.GONE){
                holder.rlIsiDoan.visibility = View.VISIBLE
                holder.ibColapse.setBackgroundResource(R.drawable.baseline_keyboard_arrow_down_24)
            }else{
                holder.rlIsiDoan.visibility = View.GONE
                holder.ibColapse.setBackgroundResource(R.drawable.baseline_keyboard_arrow_right_24)
            }
        }
    }


    override fun getItemCount(): Int = data.size

}
