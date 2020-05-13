package com.ksu_cem.vigyan.ui.dash_notes

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.ksu_cem.vigyan.R
import com.ksu_cem.vigyan.ui.cs_notes.*
import com.ksu_cem.vigyan.ui.notification_act.Comp_not_MainActivity

class Comp_sci_notes_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comp_sci__notes)
        supportActionBar?.hide()

       val btn8 = findViewById<Button>(R.id.button8)
        btn8.setOnClickListener{

            val intent = Intent(this, Comp_sci_s12_notes_MainActivity::class.java)
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)
        btn9.setOnClickListener {
            val intent = Intent(this, Comp_sci_s3_notes_MainActivity::class.java)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10)
        btn10.setOnClickListener {
            val intent = Intent(this, Comp_sci_s4_notes_MainActivity::class.java)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11)
        btn11.setOnClickListener {
            val intent = Intent(this, Comp_sci_s5_notes_MainActivity::class.java)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12)
        btn12.setOnClickListener {
            val intent = Intent(this, Comp_sci_s6_notes_MainActivity::class.java)
            startActivity(intent)
        }
        val btn13 = findViewById<Button>(R.id.button13)
        btn13.setOnClickListener {
            val intent = Intent(this, Comp_sci_s7_notes_MainActivity::class.java)
            startActivity(intent)
        }
        val btn14 = findViewById<Button>(R.id.button14)
        btn14.setOnClickListener {
            val intent = Intent(this, Comp_sci_s8_notes_MainActivity::class.java)
            startActivity(intent)
        }
        val notifbtncs = findViewById<FloatingActionButton>(R.id.notifbtncs)
        notifbtncs.setOnClickListener{
            val intent = Intent(this,Comp_not_MainActivity::class.java)
            startActivity(intent)
        }
    }
}
