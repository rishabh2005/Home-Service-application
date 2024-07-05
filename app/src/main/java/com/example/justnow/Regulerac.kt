package com.example.justnow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import org.w3c.dom.Text

class Regulerac : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regulerac)


            val Button = findViewById<ImageButton>(R.id.imgbtn1)
            val Button1 = findViewById<ImageButton>(R.id.imgbtn2)
            val textColumn = findViewById<TextView>(R.id.textid)
            var number = 0;

            Button.setOnClickListener {

                number++

                textColumn.text = number.toString()
            }


            Button1.setOnClickListener {

                if (number > 0) {

                    number--

                    textColumn.text = number.toString()
                }
            }
        }
    }
