package com.ksu_cem.vigyan.ui.dash_notes

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.ksu_cem.vigyan.R
import com.ksu_cem.vigyan.ui.me_notes.*
import com.ksu_cem.vigyan.ui.notification_act.Comp_not_MainActivity
import com.ksu_cem.vigyan.ui.notification_act.Mech_not_MainActivity

class Mech_notes_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mech__notes)
        supportActionBar?.hide()

        val btn29 = findViewById<Button>(R.id.button29)
        btn29.setOnClickListener{
            val intent = Intent(this, Mech_s12_notes_MainActivity::class.java)
            startActivity(intent)
        }
        val btn30 = findViewById<Button>(R.id.button30)
        btn30.setOnClickListener{
            val intent = Intent(this, Mech_s3_notes_MainActivity::class.java)
            startActivity(intent)
        }
        val btn31 = findViewById<Button>(R.id.button31)
        btn31.setOnClickListener{
            val intent = Intent(this, Mech_s4_notes_MainActivity::class.java)
            startActivity(intent)
        }
        val btn32 = findViewById<Button>(R.id.button32)
        btn32.setOnClickListener{
            val intent = Intent(this, Mech_s5_notes_MainActivity::class.java)
            startActivity(intent)
        }
        val btn33 = findViewById<Button>(R.id.button33)
        btn33.setOnClickListener{
            val intent = Intent(this, Mech_s6_notes_MainActivity::class.java)
            startActivity(intent)
        }
        val btn34 = findViewById<Button>(R.id.button34)
        btn34.setOnClickListener{
            val intent = Intent(this, Mech_s7_notes_MainActivity::class.java)
            startActivity(intent)
        }
        val btn35 = findViewById<Button>(R.id.button35)
        btn35.setOnClickListener{
            val intent = Intent(this, Mech_s8_notes_MainActivity::class.java)
            startActivity(intent)
        }
        val notifbtnme = findViewById<FloatingActionButton>(R.id.notifbtnme)
        notifbtnme.setOnClickListener{
            val intent = Intent(this, Mech_not_MainActivity::class.java)
            startActivity(intent)
        }
    }
}
