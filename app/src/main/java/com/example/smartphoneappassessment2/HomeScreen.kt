package com.example.smartphoneappassessment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home_screen.*

class HomeScreen : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView (R.layout.activity_home_screen)

        supportActionBar?.hide()

        okbutton.setOnClickListener {
            val intent= Intent(this, instructions::class.java)
            startActivity(intent)
        }

    }
}