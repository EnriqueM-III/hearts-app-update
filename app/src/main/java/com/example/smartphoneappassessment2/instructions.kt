package com.example.smartphoneappassessment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_instructions.*

class instructions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instructions)

        supportActionBar?.hide()
        beginButton.setOnClickListener {
            val intent= Intent(this, calc::class.java)
            startActivity(intent)
        }
    }
}