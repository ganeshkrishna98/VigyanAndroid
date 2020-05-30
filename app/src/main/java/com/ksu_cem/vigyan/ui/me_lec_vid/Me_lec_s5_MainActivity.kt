package com.ksu_cem.vigyan.ui.me_lec_vid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Me_lec_s5_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_me_lec_s5__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1UYq0NSvlpKkUWO3aShkMyD4lr5sSCCZR?usp=sharing")//mom
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1igIN1yGmvmDSwip7Tyc8RKOv9bVAfzZi?usp=sharing")//mtdm
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1uxxt0zHK8dXJNTaY4JcYouKcaXauhere?usp=sharing")//cpnm
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/folders/16HyfWmey4LAGxzcONFJ_Cm9l3AbmBnvH?usp=sharing")//edc
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1PZ8Al9r_G7JGKYXvIa-2jbW40Icoi7_E?usp=sharing")//pm
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1r3o01mJoXjJmv7SPv3Mn7pjVMgzZjW6s?usp=sharing")//ele

        val btn8 = findViewById<Button>(R.id.button8)//mom btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)//mtdm btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10)//cpnm btn
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris4)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11)//edc btn
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
