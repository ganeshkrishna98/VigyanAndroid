package com.ksu_cem.vigyan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val button = findViewById<Button>(R.id.button2)
            button.setOnClickListener{
                val intent = Intent(this, Dashboard::class.java)
                startActivity(intent)
            }

        val btn1 = findViewById<Button>(R.id.button)
        btn1.setOnClickListener{
            val intent = Intent(this, Teacher_Webview_MainActivity::class.java)
            startActivity(intent)
        }
    }
}
