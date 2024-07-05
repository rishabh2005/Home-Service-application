package com.example.justnow


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main2)

        val button = findViewById<Button>(R.id.btn)


        button.setOnClickListener{
            val Intent = Intent (this,MainotpActivity::class.java)
            startActivity(Intent)
        }


    }
}