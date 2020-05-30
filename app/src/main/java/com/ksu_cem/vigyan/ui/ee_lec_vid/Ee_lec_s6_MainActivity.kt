package com.ksu_cem.vigyan.ui.ee_lec_vid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Ee_lec_s6_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ee_lec_s6__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1Nxk8RqjL50-YW1qufxPJSGY13cZhLmr0?usp=sharing")//em
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1mMTNCk10jkeJ6C2h4N46CmUaIjTKjAzB?usp=sharing")//act
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1KWtwMDWJsO7qzy5BfYXvTuC9NeoQUHc4?usp=sharing")//psa
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1Ec5jOcoxF1cxrGsQY5OoGWf6QYUFIHxI?usp=sharing")//ed
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1fJpsiDphP1nR-OgyP7rgBqGr81fMrOE-?usp=sharing")//pm
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1Pnn_mgR5Zk0rMuEOCcu8yYE0QeagHO7E?usp=sharing")//ele

        val btn8 = findViewById<Button>(R.id.button8)//em btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)//act btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10)//psa btn
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris4)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11)//ed btn
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris5)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12)//pm btn
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
