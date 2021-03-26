package com.gayedirican.activitygecisleri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_b_sayfasi.*

class BSayfasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b_sayfasi)
        buttonSayfaBtoY.setOnClickListener {
            val intent = Intent(this@BSayfasi,YSayfasi::class.java)
            startActivity(intent)


        }
    }

}
