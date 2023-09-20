package com.example.myprojectandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class CountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count)

        val tvNumber: TextView = findViewById(R.id.tvNumber)
        val btnCount: Button = findViewById(R.id.btnCount)
        val btnreset: Button = findViewById(R.id.btnreset)
        val btnminus: Button = findViewById(R.id.btnminus)

//        panggil fungsi
//                setText dan getText
//        setText = merubah/mengisi text cukup panggil fungsi text
//        getText = mengambil text

        tvNumber.text = "100"

        println(tvNumber.text)
        Log.d("Number", "Hasilnya: ${tvNumber.text}")

        btnCount.setOnClickListener {
//            ambil text trus ubah ke string trus ubah lagi ke int
            var countInteger: Int = tvNumber.text.toString().toInt()
            countInteger++

            tvNumber.text = countInteger.toString()
        }
        btnreset.setOnClickListener {
//            ambil text trus ubah ke string trus ubah lagi ke int
            var resetInteger: Int = tvNumber.text.toString().toInt()
            resetInteger=0

            tvNumber.text = resetInteger.toString()
        }
        btnminus.setOnClickListener {
//            ambil text trus ubah ke string trus ubah lagi ke int
            var minusInteger: Int = tvNumber.text.toString().toInt()
           minusInteger--

            tvNumber.text = minusInteger.toString()
        }
    }
}