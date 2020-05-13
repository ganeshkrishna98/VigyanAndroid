package com.ksu_cem.vigyan.ui.dash_notes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.ksu_cem.vigyan.R
import com.ksu_cem.vigyan.ui.ee_notes.*
import com.ksu_cem.vigyan.ui.notification_act.Comp_not_MainActivity
import com.ksu_cem.vigyan.ui.notification_act.Elec_ec_not_MainActivity

class Elec_ec_notes_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elec_ec__notes)
        supportActionBar?.hide()
        
        val btn15 = findViewById<Button>(R.id.button15)
        btn15.setOnClickListener{
            val intent = Intent(this, Elec_ec_s12_notes_MainActivity::class.java)
            startActivity(intent)
        }
        val btn16 = findViewById<Button>(R.id.button16)
        btn16.setOnClickListener{
            val intent = Intent(this, Elec_ec_s3_notes_MainActivity::class.java)
            startActivity(intent)
        }
        val btn17 = findViewById<Button>(R.id.button17)
        btn17.setOnClickListener{
            val intent = Intent(this, Elec_ec_s4_notes_MainActivity::class.java)
            startActivity(intent)
        }
        val btn18 = findViewById<Button>(R.id.button18)
        btn18.setOnClickListener{
            val intent = Intent(this, Elec_ec_s5_notes_MainActivity::class.java)
            startActivity(intent)
        }
        val btn19 = findViewById<Button>(R.id.button19)
        btn19.setOnClickListener{
            val intent = Intent(this, Elec_ec_s6_notes_MainActivity::class.java)
            startActivity(intent)
        }
        val btn20 = findViewById<Button>(R.id.button20)
        btn20.setOnClickListener{
            val intent = Intent(this, Elec_ec_s7_notes_MainActivity::class.java)
            startActivity(intent)
        }
        val btn21 = findViewById<Button>(R.id.button21)
        btn21.setOnClickListener{
            val intent = Intent(this, Elec_ec_s8_notes_MainActivity::class.java)
            startActivity(intent)
        }
        val notifbtnee = findViewById<FloatingActionButton>(R.id.notifbtnee)
        notifbtnee.setOnClickListener{
            val intent = Intent(this, Elec_ec_not_MainActivity::class.java)
            startActivity(intent)
        }
    }
}
