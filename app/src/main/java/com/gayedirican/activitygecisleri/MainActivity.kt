package com.gayedirican.activitygecisleri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonSayfaA.setOnClickListener {
            val intent = Intent(this@MainActivity,ASayfasi::class.java)
            startActivity(intent)
        }
        buttonSayfaX.setOnClickListener{
            val intent = Intent(this@MainActivity,XSayfasi::class.java)
            startActivity(intent)
        }
    }
}