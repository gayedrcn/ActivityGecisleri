package com.gayedirican.activitygecisleri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class YSayfasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_y_sayfasi)
    }
    override fun onBackPressed(){
        val intent = Intent(this@YSayfasi,MainActivity::class.java)
        startActivity(intent)

    }
}