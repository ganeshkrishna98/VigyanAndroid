package com.ksu_cem.vigyan.ui.dash_lec_vid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R
import com.ksu_cem.vigyan.ui.ec_lec_vid.*

class Elec_comm_lec_vid_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elec_comm_lec_vid__main)
        supportActionBar?.hide()

        val btn22 = findViewById<Button>(R.id.button22)
        btn22.setOnClickListener{
            val intent = Intent(this, Ec_lec_s12_MainActivity::class.java)
            startActivity(intent)
        }
        val btn23 = findViewById<Button>(R.id.button23)
        btn23.setOnClickListener{
            val intent = Intent(this, Ec_lec_s3_MainActivity::class.java)
            startActivity(intent)
        }
        val btn24 = findViewById<Button>(R.id.button24)
        btn24.setOnClickListener{
            val intent = Intent(this, Ec_lec_s4_MainActivity::class.java)
            startActivity(intent)
        }
        val btn25 = findViewById<Button>(R.id.button25)
        btn25.setOnClickListener{
            val intent = Intent(this, Ec_lec_s5_MainActivity::class.java)
            startActivity(intent)
        }
        val btn26 = findViewById<Button>(R.id.button26)
        btn26.setOnClickListener{
            val intent = Intent(this, Ec_lec_s6_MainActivity::class.java)
            startActivity(intent)
        }
        val btn27 = findViewById<Button>(R.id.button27)
        btn27.setOnClickListener{
            val intent = Intent(this, Ec_lec_s7_MainActivity::class.java)
            startActivity(intent)
        }
        val btn28 = findViewById<Button>(R.id.button28)
        btn28.setOnClickListener{
            val intent = Intent(this, Ec_lec_s8_MainActivity::class.java)
            startActivity(intent)
        }
    }
}
