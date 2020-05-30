package com.ksu_cem.vigyan.ui.dash_notes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R
import com.ksu_cem.vigyan.ui.ec_notes.*

class Elec_comm_notes_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elec_comm__notes)
        supportActionBar?.hide()

        val btn22 = findViewById<Button>(R.id.button22)
        btn22.setOnClickListener{
            val intent = Intent(this, Elec_comm_s12_notes_MainActivity::class.java)
            startActivity(intent)
        }
        val btn23 = findViewById<Button>(R.id.button23)
        btn23.setOnClickListener{
            val intent = Intent(this, Elec_comm_s3_notes_MainActivity::class.java)
            startActivity(intent)
        }
        val btn24 = findViewById<Button>(R.id.button24)
        btn24.setOnClickListener{
            val intent = Intent(this, Elec_comm_s4_notes_MainActivity::class.java)
            startActivity(intent)
        }
        val btn25 = findViewById<Button>(R.id.button25)
        btn25.setOnClickListener{
            val intent = Intent(this, Elec_comm_s5_notes_MainActivity::class.java)
            startActivity(intent)
        }
        val btn26 = findViewById<Button>(R.id.button26)
        btn26.setOnClickListener{
            val intent = Intent(this, Elec_comm_s6_notes_MainActivity::class.java)
            startActivity(intent)
        }
        val btn27 = findViewById<Button>(R.id.button27)
        btn27.setOnClickListener{
            val intent = Intent(this, Elec_comm_s7_notes_MainActivity::class.java)
            startActivity(intent)
        }
        val btn28 = findViewById<Button>(R.id.button28)
        btn28.setOnClickListener{
            val intent = Intent(this, Elec_comm_s8_notes_MainActivity::class.java)
            startActivity(intent)
        }
    }
}
