package com.ksu_cem.vigyan.ui.ec_lec_vid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Ec_lec_s8_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ec_lec_s8__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/folders/19FzqmnHowcuEz71nGnGWdc0sXfUnZ0p5?usp=sharing")//ne
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1m_6cCRism1pLNYBvwQLuZ5A4uJ0VbyNF?usp=sharing")//acs
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1-vdzw3Mi34PEttcuR_G9ZYxsr3l6OwPH?usp=sharing")//ele

        val btn8 = findViewById<Button>(R.id.button8) //ne btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)   //acs btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn13 = findViewById<Button>(R.id.button11) //ele btn
        btn13.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris7)
            startActivity(intent)
        }

    }
}
