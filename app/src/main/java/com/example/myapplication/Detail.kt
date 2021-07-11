package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity



class Detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        back.setOnClickListener(View.OnClickListener { finish() })
//        maytinh.setOnClickListener {
//            val i: Intent = Intent(this, maytinh::class.java)
//            startActivity(i)
//        }
    }
}