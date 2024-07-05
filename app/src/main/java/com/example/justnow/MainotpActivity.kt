package com.example.justnow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainotpActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainotp)

        val button = findViewById<Button>(R.id.btn1)


        button.setOnClickListener{
            val Intent = Intent (this,Mainscreen::class.java)
            startActivity(Intent)
        }


    }
}