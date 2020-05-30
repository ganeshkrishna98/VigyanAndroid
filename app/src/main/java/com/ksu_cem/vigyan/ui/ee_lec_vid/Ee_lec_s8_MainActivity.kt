package com.ksu_cem.vigyan.ui.ee_lec_vid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Ee_lec_s8_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ee_lec_s8__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1z0iMj-EwvN1h5DnP0Q0uNVC_cJZm9QO0?usp=sharing")//sem
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/folders/18EGgEeZQPR1HIhbljYA4ZDcAGwKdN8Lu?usp=sharing")//iia
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1U05Rl3BfVKybc4_zoPXMreYsB_fg0WgU?usp=sharing")//ele

        val btn8 = findViewById<Button>(R.id.button8)//sem btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)//iia btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn13 = findViewById<Button>(R.id.button11)//ele btn
        btn13.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris7)
            startActivity(intent)
        }

    }
}
