package com.gayedirican.activitygecisleri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_a_sayfasi.*

class ASayfasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a_sayfasi)
        buttonSayfaB.setOnClickListener {
            val intent = Intent(this@ASayfasi,BSayfasi::class.java)
            startActivity(intent)
        }
    }
}