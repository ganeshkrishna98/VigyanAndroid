package com.ksu_cem.vigyan.ui.dash_qstnp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Mech_qstnp_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mech_qstnp__main)
        supportActionBar?.hide()

        val uris1: Uri = Uri.parse("https://drive.google.com/drive/u/2/folders/1qtbyr-fteAqUoKoiSkdbLvN4ydXIFWkw")
        val uris3: Uri = Uri.parse("https://drive.google.com/drive/u/2/folders/1-5HQpPpDaIsE89xiVQa5407s8iyo5Is6")
        val uris4: Uri = Uri.parse("https://drive.google.com/drive/u/2/folders/1qKhrtRuykr10A4sZVDv5RMxXRtAjaXYL")
        val uris5: Uri = Uri.parse("https://drive.google.com/drive/u/2/folders/1woK-0plw6l3b_foScF97yOu-WF8vJQ-W")
        val uris6: Uri = Uri.parse("https://drive.google.com/drive/u/2/folders/1gfxfIteHHQA96KCsGes1uy8uVaxbCykm")
        val uris7: Uri = Uri.parse("https://drive.google.com/drive/u/2/folders/1m4iy-VA9-xiqcQSmAiWfFMzX5tj63gM_")
        val uris8: Uri = Uri.parse("https://drive.google.com/drive/u/2/folders/1TLtP0Q7G6Qi0cbH0Z3M_daFJg1vP5pNk")

        val btn29 = findViewById<Button>(R.id.button29)
        btn29.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, uris1)
            startActivity(intent)
        }
        val btn30 = findViewById<Button>(R.id.button30)
        btn30.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn31 = findViewById<Button>(R.id.button31)
        btn31.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, uris4)
            startActivity(intent)
        }
        val btn32 = findViewById<Button>(R.id.button32)
        btn32.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, uris5)
            startActivity(intent)
        }
        val btn33 = findViewById<Button>(R.id.button33)
        btn33.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, uris6)
            startActivity(intent)
        }
        val btn34 = findViewById<Button>(R.id.button34)
        btn34.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, uris7)
            startActivity(intent)
        }
        val btn35 = findViewById<Button>(R.id.button35)
        btn35.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, uris8)
            startActivity(intent)
        }
    }
}
