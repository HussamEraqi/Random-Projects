package com.example.fragments_v2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    val f_fragment = FirstFragment()
    val s_fragment = SecondFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initSubView()
        initButton()
    }

    private fun initButton() {
        findViewById<Button>(R.id.button_change).setOnClickListener{
            showSecondScreen()
        }
    }

    private fun showSecondScreen() {
        addFragment(s_fragment)
    }

    private fun initSubView() {
       addFragment(f_fragment)
    }
    private fun addFragment(fragment : Fragment){
        val transaction =  supportFragmentManager.beginTransaction()
        transaction.add(R.id.fragment_container_one,fragment)
        transaction.commit()
    }

}