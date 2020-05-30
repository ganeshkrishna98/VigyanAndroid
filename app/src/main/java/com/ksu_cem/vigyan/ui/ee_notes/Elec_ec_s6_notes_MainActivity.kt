package com.ksu_cem.vigyan.ui.ee_notes

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Elec_ec_s6_notes_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elec_ec_s6_notes__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1fJrxD8qtho1MF16ucPJqOLH0M3aIFrc2?usp=sharing")//em
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1QT5iu3JTlr4tj_ZI_ID-7TUOH2qU9gbH?usp=sharing")//act
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1XLjvZ1V-1nOITs4x2AkuL8sNSs6VmFj5?usp=sharing")//psa
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1MEoQA_dlJdB1n6WP5cNYuRAnGMop2nsH?usp=sharing")//ed
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1SPnJxzMwpwQ5ZXZUBPx8ToUOdxDp-o7W?usp=sharing")//pm
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/folders/15_W_O0vklKnm7MXS5VTAa41Cg_s8DyPM?usp=sharing")//ele

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
