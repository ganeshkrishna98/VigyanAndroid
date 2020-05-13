package com.ksu_cem.vigyan.ui.dash_lec_vid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R
import com.ksu_cem.vigyan.ui.cs_lec_vid.*

class Comp_sci_lec_vid_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comp_sci_lec_vid__main)
        supportActionBar?.hide()

        val btn8 = findViewById<Button>(R.id.button8)
        btn8.setOnClickListener{

            val intent = Intent(this, Cs_lec_s12_MainActivity::class.java)
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)
        btn9.setOnClickListener {
            val intent = Intent(this, Cs_lec_s3_MainActivity::class.java)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10)
        btn10.setOnClickListener {
            val intent = Intent(this, Cs_lec_s4_MainActivity::class.java)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11)
        btn11.setOnClickListener {
            val intent = Intent(this, Cs_lec_s5_MainActivity::class.java)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12)
        btn12.setOnClickListener {
            val intent = Intent(this, Cs_lec_s6_MainActivity::class.java)
            startActivity(intent)
        }
        val btn13 = findViewById<Button>(R.id.button13)
        btn13.setOnClickListener {
            val intent = Intent(this, Cs_lec_s7_MainActivity::class.java)
            startActivity(intent)
        }
        val btn14 = findViewById<Button>(R.id.button14)
        btn14.setOnClickListener {
            val intent = Intent(this, Cs_lec_s8_MainActivity::class.java)
            startActivity(intent)
        }
    }
}
