package com.ksu_cem.vigyan.ui.dash_lec_vid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R
import com.ksu_cem.vigyan.ui.me_lec_vid.*

class Mech_lec_vid_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mech_lec_vid__main)
        supportActionBar?.hide()

        val btn29 = findViewById<Button>(R.id.button29)
        btn29.setOnClickListener{
            val intent = Intent(this, Me_lec_s12_MainActivity::class.java)
            startActivity(intent)
        }
        val btn30 = findViewById<Button>(R.id.button30)
        btn30.setOnClickListener{
            val intent = Intent(this, Me_lec_s3_MainActivity::class.java)
            startActivity(intent)
        }
        val btn31 = findViewById<Button>(R.id.button31)
        btn31.setOnClickListener{
            val intent = Intent(this, Me_lec_s4_MainActivity::class.java)
            startActivity(intent)
        }
        val btn32 = findViewById<Button>(R.id.button32)
        btn32.setOnClickListener{
            val intent = Intent(this, Me_lec_s5_MainActivity::class.java)
            startActivity(intent)
        }
        val btn33 = findViewById<Button>(R.id.button33)
        btn33.setOnClickListener{
            val intent = Intent(this, Me_lec_s6_MainActivity::class.java)
            startActivity(intent)
        }
        val btn34 = findViewById<Button>(R.id.button34)
        btn34.setOnClickListener{
            val intent = Intent(this, Me_lec_s7_MainActivity::class.java)
            startActivity(intent)
        }
        val btn35 = findViewById<Button>(R.id.button35)
        btn35.setOnClickListener{
            val intent = Intent(this, Me_lec_s8_MainActivity::class.java)
            startActivity(intent)
        }
    }
}
