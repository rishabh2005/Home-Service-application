package com.example.justnow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Acrepair : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acrepair)

        val Button=findViewById<ImageButton>(R.id.acbtn2)


        Button.setOnClickListener{
            val Intent = Intent (this,Regulerac::class.java)
            startActivity(Intent)
        }

        val Button1=findViewById<ImageButton>(R.id.acbtn1)


        Button1.setOnClickListener{
            val Intent = Intent (this,AcCheckUp::class.java)
            startActivity(Intent)
        }
    }
}