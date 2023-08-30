package com.example.app2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    private lateinit var closeBtn : Button
        lateinit var t : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        t = findViewById(R.id.textview2)
        val mydata = intent.getStringExtra("data_mobile")
        val mydata2 = intent.getStringExtra("data_massage")
        val msg = "Your Data \n Your Number : $mydata \n Your Massage : $mydata2 "
        t.setText(msg)

        closeBtn = findViewById(R.id.btnClose)
        closeBtn.setOnClickListener {
            finishAffinity()
        }


    }
}