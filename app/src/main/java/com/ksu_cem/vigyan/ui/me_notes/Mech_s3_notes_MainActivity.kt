package com.ksu_cem.vigyan.ui.me_notes

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Mech_s3_notes_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mech_s3_notes__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/folders/11gQmfXP24Pv04nTuBRGLuARXAnXaXRqy?usp=sharing")//laca
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/folders/18mksxE05xCTE67cxrQHhdupZ95KNW__a?usp=sharing")//mos
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1jaX8-ZiSf17jY0agSziPWIqjLWu06b7j?usp=sharing")//mof
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/folders/17KHK49zCCyNcYPP_Uf7H_bKC70l7KXE3?usp=sharing")//tdm
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1p4AQJMy1fokDc8c-Ys8hMXnT7JqGHVDd?usp=sharing")//mam
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1HUFo9pQDSWn9rDKyVw7kcbaE_N220nld?usp=sharing")//be

        val btn8 = findViewById<Button>(R.id.button8)//laca btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)//mos btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10)//mof btn
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris4)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11)//tdm btn
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris5)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12)//mam btn
        btn12.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris6)
            startActivity(intent)
        }
        val btn13 = findViewById<Button>(R.id.button13)//be btn
        btn13.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris7)
            startActivity(intent)
        }
    }
}
