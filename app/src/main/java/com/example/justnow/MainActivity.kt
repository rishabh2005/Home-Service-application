package com.example.justnow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button=findViewById<Button>(R.id.signbutton)


        button.setOnClickListener{
            val Intent =Intent (this,Main2::class.java)
            startActivity(Intent)
        }



        }


    }
