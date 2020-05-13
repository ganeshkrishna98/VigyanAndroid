package com.ksu_cem.vigyan.ui.cs_lec_vid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Cs_lec_s4_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cs_lec_s4__main)
        supportActionBar?.hide()

        val prburi: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1c8slJf6y-8jVk3in65mhCdycKeaOMJhI")//prob link
        val couri: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1b0kBOV-EXKTYIwbOuGGr52_UScYrZXSc")// comp org lnk
        val osuri: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1bkHvWVLH0AYaCIFg_P_sI1v64REXd3i5")//os lnk
        val oopuri: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1bgZFHJkpaan-2ZLl5-kycjFjYfqnl11b")//oop lnk
        val pdburi: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1bLU-H98-JJ3ZytAS_Y4a65oxyRoa3JJs")//p db lnk
        val beuri: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1acLvTJYBL-pyF3vgkBtErIMEjvnkOWw-")// be lnk

        val btn8 = findViewById<Button>(R.id.button8)   //prob btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,prburi )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)// comp org btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, couri)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10)//os btn
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, osuri)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11)//oop btn
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, oopuri)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12)// p db btn
        btn12.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, pdburi)
            startActivity(intent)
        }
        val btn13 = findViewById<Button>(R.id.button13)// business economics
        btn13.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, beuri)
            startActivity(intent)
        }
    }
}
