package com.example.app2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText


class MainActivity : AppCompatActivity() {
    private lateinit var closebtn : Button
    private lateinit var nextbtn : Button
    private lateinit var mobText : EditText
    private lateinit var masgText : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        closebtn = findViewById(R.id.close)
        closebtn.setOnClickListener{
            finishAffinity()
        }
        mobText = findViewById(R.id.mobile_edit)
        masgText = findViewById(R.id.massage_edit)
        nextbtn = findViewById(R.id.next)

        nextbtn.setOnClickListener{
            val mobile = mobText.text.toString()
            val massage = masgText.text.toString()
            val myIntent = Intent(this,MainActivity2::class.java)
            myIntent.putExtra("data_mobile",mobile)
            myIntent.putExtra("data_massage",massage)
            startActivity(myIntent)
        }


    }
}