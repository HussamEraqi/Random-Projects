package com.example.fragmentpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("life","MainActivity : lifeCycle")


    }

    override fun onStart() {
        super.onStart()
        Log.i("life","MainActivity : onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("life","MainActivity : onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("life","MainActivity : onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("life","MainActivity : onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("life","MainActivity : onDestroy")
    }
}