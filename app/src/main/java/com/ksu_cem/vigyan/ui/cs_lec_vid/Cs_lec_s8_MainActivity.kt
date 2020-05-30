package com.ksu_cem.vigyan.ui.cs_lec_vid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Cs_lec_s8_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cs_lec_s8__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1ctdhxKMeewPDqaQIMne1oE60IEL-y_Pw?usp=sharing")//data min
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1coW5JwgAXxd3xlnuMxa8NvLzSwsIquRT?usp=sharing")//embed sys
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1i-70e6_y9iYyrrSxgobyuBQxytkP_3dB?usp=sharing")//ele1

        val btn8 = findViewById<Button>(R.id.button8)
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )  //data min btn
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)   // embed sys btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11) // ele 1
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris5)
            startActivity(intent)
        }
    }
}
