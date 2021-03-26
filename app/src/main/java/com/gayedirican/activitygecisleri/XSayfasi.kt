package com.gayedirican.activitygecisleri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_x_sayfasi.*

class XSayfasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_x_sayfasi)
        buttonSayfaY.setOnClickListener {
            val intent = Intent(this@XSayfasi,YSayfasi::class.java)
            startActivity(intent)

        }
    }
}