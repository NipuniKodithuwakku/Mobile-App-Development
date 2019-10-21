package com.example.loginapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button

import androidx.appcompat.app.AppCompatActivity

class SecondActivity:AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        var signBtn:Button?=null
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        signBtn=findViewById(R.id.btnLogin)
        signBtn!!.setOnClickListener { goToNext() }

    }
    private fun goToNext(){
        var intent = Intent(this@SecondActivity,ThirdActivity::class.java)
        startActivity(intent)
    }
}

