package com.example.justnow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Mainscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainscreen)



        val Button=findViewById<ImageButton>(R.id.ACbtn)


        Button.setOnClickListener{
            val Intent =Intent (this,Acrepair::class.java)
            startActivity(Intent)
        }
    }
}