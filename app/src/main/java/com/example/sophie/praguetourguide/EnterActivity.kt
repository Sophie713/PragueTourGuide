package com.example.sophie.praguetourguide

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_enter.*

class EnterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enter)

        monuments.setOnClickListener({
            val intent = Intent(this, Monuments::class.java)
            startActivity(intent)
        })
    }
}
