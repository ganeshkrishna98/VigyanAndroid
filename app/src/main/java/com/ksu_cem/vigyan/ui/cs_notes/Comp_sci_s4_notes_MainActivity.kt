package com.ksu_cem.vigyan.ui.cs_notes

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Comp_sci_s4_notes_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comp_sci_s4_notes__main)
        supportActionBar?.hide()

        val prburi: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1P0Oc9TnKMGY8D4aZLQ3smiLz4EteEhO_?usp=sharing")//prob link
        val couri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/164hzsdsiqH-08JNIq8Zq883HjZQm1YxS?usp=sharing")// comp org lnk
        val osuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1daaf0rWc1dUqrXQEYyG5Ft7PXezSPw-j?usp=sharing")//os lnk
        val oopuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/169aAo9pFEdR44eJMOL6Gt0nJA8KvS3g0?usp=sharing")//oop lnk
        val pdburi: Uri =
            Uri.parse("https://drive.google.com/drive/folders/169aAo9pFEdR44eJMOL6Gt0nJA8KvS3g0?usp=sharing")//p db lnk
        val beuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1HUFo9pQDSWn9rDKyVw7kcbaE_N220nld?usp=sharing")// be lnk

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
