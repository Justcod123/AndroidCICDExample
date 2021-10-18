package com.example.androidcicdexample

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_login_main_activity.setOnClickListener {
            startActivity(Intent(this, DashBoardActivity::class.java))
            finish()
        }

        btn_next_screen_activity.setOnClickListener {
            startActivity(Intent(this, NextScreenActivity::class.java))
            finish()
        }
    }
}