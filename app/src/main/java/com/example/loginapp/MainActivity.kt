package com.example.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
         var loginBtn: Button?=null
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


         loginBtn = findViewById(R.id.button)

        loginBtn!!.setOnClickListener { goToNext() }

    }
    private fun goToNext(){
        var intent = Intent(this@MainActivity,SecondActivity::class.java)
        startActivity(intent)
    }
}
