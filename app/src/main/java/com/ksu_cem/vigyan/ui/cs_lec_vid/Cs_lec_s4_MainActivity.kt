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
            Uri.parse("https://drive.google.com/drive/folders/1bOro5Rg56theWRR9FsQGLhXJehtXTz6a?usp=sharing")//prob link
        val couri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1ZU2Hy8_m9Sa96zv_WyvedVN0sefbgHyM?usp=sharing")// comp org lnk
        val osuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1JcF2mMSKB3EWiBTFm0wwQWprb4EbArPQ?usp=sharing")//os lnk
        val oopuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1pWwSS_rcCukh3NDTJHrHh2u11EuxjXi-?usp=sharing")//oop lnk
        val pdburi: Uri =
            Uri.parse("https://drive.google.com/drive/folders/15ql4A8V5l_WPgGicDVEUeNCKhMM2J4OH?usp=sharing")//p db lnk
        val beuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1R0x8w4crUro5gDkxIEQ9B1b6YYQsZonv?usp=sharing")// be lnk

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
