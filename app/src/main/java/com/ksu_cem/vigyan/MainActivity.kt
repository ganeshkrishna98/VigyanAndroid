package com.ksu_cem.vigyan

import android.content.Intent
import android.net.Uri
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
        val openURL = Intent(android.content.Intent.ACTION_VIEW)
        btn1.setOnClickListener{
            openURL.data = Uri.parse("https://vigyanportal.web.app/")
            startActivity(openURL)
        }
    }
}
