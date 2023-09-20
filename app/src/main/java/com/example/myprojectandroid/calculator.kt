package com.example.myprojectandroid

import android.annotation.SuppressLint
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class calculator : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator_kecil)

        var input1: EditText = findViewById(R.id.input1)
        var input2: EditText = findViewById(R.id.input2)
        var hasil: TextView = findViewById(R.id.hasil)
        val tambah:Button = findViewById(R.id.tambah)
        val kurang: Button = findViewById(R.id.kurang)
        val kali: Button = findViewById(R.id.kali)
        val bagi: Button = findViewById(R.id.bagi)
        val clear: Button = findViewById(R.id.clear)

        val builder: AlertDialog.Builder = AlertDialog.Builder(this@calculator)

        tambah.setOnClickListener {

            val hasilTambah = input1.text.toString().toInt()+ input2.text.toString().toInt()
            hasil.text = hasilTambah.toString()

        }

        kurang.setOnClickListener {

            val hasilKurang = input1.text.toString().toInt()- input2.text.toString().toInt()
            hasil.text = hasilKurang.toString()

        }

        kali.setOnClickListener {

            val hasilKali = input1.text.toString().toInt()* input2.text.toString().toInt()
            hasil.text = hasilKali.toString()

        }

        bagi.setOnClickListener {

            val hasilBagi = input1.text.toString().toInt()/ input2.text.toString().toInt()
            hasil.text = hasilBagi.toString()

        }


        clear.setOnClickListener {
            builder.setTitle("Perhatian")
            builder.setMessage("Kamu yakin mau menghapus datanya?")
            builder.setCancelable(false)
            builder.setPositiveButton("Yes",DialogInterface.OnClickListener { dialog, which ->

                hasil.text = "0"

                input1.setText("")

                input2.setText("")

            })
            builder.setNegativeButton("No",DialogInterface.OnClickListener { dialog, which ->  })
            builder.setIcon(R.drawable.baseline_info_24)

            val alertDialog:AlertDialog = builder.create()

            alertDialog.show()

        }

    }

}