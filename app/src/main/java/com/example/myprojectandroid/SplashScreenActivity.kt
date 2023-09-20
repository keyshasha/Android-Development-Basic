package com.example.myprojectandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

//         panggil objek namanya handle dari package os
//        fungdsi podtdelayed untuk menjalankan action ketika waktu
//        yang ditentukan telah selesai
        Handler().postDelayed({
            val intent = Intent(this,
                DasboardDoaActivity::class.java)
            startActivity(intent)
        },5000)
    }
}