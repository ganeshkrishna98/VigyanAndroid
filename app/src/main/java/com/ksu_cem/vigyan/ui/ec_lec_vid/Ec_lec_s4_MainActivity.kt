package com.ksu_cem.vigyan.ui.ec_lec_vid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Ec_lec_s4_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ec_lec_s4__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1c8slJf6y-8jVk3in65mhCdycKeaOMJhI")//prob
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/145T7UmqwE7fe0-HcFz0Tdss-MY8ovOVY")//sas
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/13mS_6VixLvfh2hRQ_OROUOAENtUWz6hE")//aic
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/13Tzps6-ZpG1b7fKAmI231lcBH6j9m36w")//co
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/13CyGKy8rvC2W6I4c458a0rXGrNfswkQj")//ac
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1acLvTJYBL-pyF3vgkBtErIMEjvnkOWw-")//be

        val btn8 = findViewById<Button>(R.id.button8)   //prob btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9) // sas btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10) //aic btn
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris4)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11) //co btn
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris5)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12) //ac btn
        btn12.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris6)
            startActivity(intent)
        }
        val btn13 = findViewById<Button>(R.id.button13) // be btn
        btn13.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris7)
            startActivity(intent)
        }
    }
}
