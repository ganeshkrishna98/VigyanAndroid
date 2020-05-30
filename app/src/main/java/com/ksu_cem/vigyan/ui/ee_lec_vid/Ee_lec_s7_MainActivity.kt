package com.ksu_cem.vigyan.ui.ee_lec_vid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Ee_lec_s7_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ee_lec_s7__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1jumNJy-btRxXS1BL48v5BHRMd9QsCUhN?usp=sharing")//ec
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1ZhOAZT_yloseb3v8l0sfzJDSObkJNFGD?usp=sharing")//dgs
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1YqS-GbWYFvST0QAyCRW46xZ5GN7vVGZt?usp=sharing")//esd
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1EtylR4dFAJ_C-A4fplSf2smc4INofg1B?usp=sharing")//dsp
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1kvuBYDhiDeyRLy0qMjXYJ31ZVx8mszN1?usp=sharing")//emd
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/folders/16PgxHmtUS0MfhU9xKwFfoDPBj7c0smrf?usp=sharing")//ele

        val btn8 = findViewById<Button>(R.id.button8)//ec btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)//dgs btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10)//esd btn
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris4)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11)//dsp btn
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris5)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12)//emd btn
        btn12.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris6)
            startActivity(intent)
        }
        val btn13 = findViewById<Button>(R.id.button13)//ele btn
        btn13.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris7)
            startActivity(intent)
        }
    }
}
