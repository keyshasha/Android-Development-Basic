package com.example.myprojectandroid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class TravelActivity : AppCompatActivity() {
    var ibCall : ImageButton? = null
    var ibNavigate : ImageButton? = null
    var ibShare : ImageButton? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_travel)

        ibCall = findViewById(R.id.ibCall)
        ibNavigate = findViewById(R.id.ibNavigate)
        ibShare = findViewById(R.id.ibShare)

        ibCall!!.setOnClickListener{
            val phonenumber = "123456789"
            val phoneintent = Intent(Intent.ACTION_DIAL,
                Uri.parse("tel:$phonenumber"))

            startActivity(phoneintent)
        }

        ibNavigate!!.setOnClickListener{
            val mapIntent = Intent(Intent.ACTION_VIEW,
                Uri.parse("geo: 33.49864790464753, 126.53092666727174")
            )

            startActivity(mapIntent)
        }
    }
}