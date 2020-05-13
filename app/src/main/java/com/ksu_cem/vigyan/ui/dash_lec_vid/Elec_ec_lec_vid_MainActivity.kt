package com.ksu_cem.vigyan.ui.dash_lec_vid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R
import com.ksu_cem.vigyan.ui.ee_lec_vid.*

class Elec_ec_lec_vid_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elec_ec_lec_vid__main)
        supportActionBar?.hide()

        val btn15 = findViewById<Button>(R.id.button15)
        btn15.setOnClickListener{
            val intent = Intent(this, Ee_lec_s12_MainActivity::class.java)
            startActivity(intent)
        }
        val btn16 = findViewById<Button>(R.id.button16)
        btn16.setOnClickListener{
            val intent = Intent(this, Ee_lec_s3_MainActivity::class.java)
            startActivity(intent)
        }
        val btn17 = findViewById<Button>(R.id.button17)
        btn17.setOnClickListener{
            val intent = Intent(this, Ee_lec_s4_MainActivity::class.java)
            startActivity(intent)
        }
        val btn18 = findViewById<Button>(R.id.button18)
        btn18.setOnClickListener{
            val intent = Intent(this, Ee_lec_s5_MainActivity::class.java)
            startActivity(intent)
        }
        val btn19 = findViewById<Button>(R.id.button19)
        btn19.setOnClickListener{
            val intent = Intent(this, Ee_lec_s6_MainActivity::class.java)
            startActivity(intent)
        }
        val btn20 = findViewById<Button>(R.id.button20)
        btn20.setOnClickListener{
            val intent = Intent(this, Ee_lec_s7_MainActivity::class.java)
            startActivity(intent)
        }
        val btn21 = findViewById<Button>(R.id.button21)
        btn21.setOnClickListener{
            val intent = Intent(this, Ee_lec_s8_MainActivity::class.java)
            startActivity(intent)
        }
    }
}
