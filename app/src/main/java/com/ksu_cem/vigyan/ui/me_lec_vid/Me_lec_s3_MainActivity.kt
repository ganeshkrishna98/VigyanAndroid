package com.ksu_cem.vigyan.ui.me_lec_vid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Me_lec_s3_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_me_lec_s3__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1abIViJK9LEZHVEbW_YN5BXI40SBUD28O?usp=sharing")//laca
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1b7iVNl8rJbAiIqFCcWWCKjmAFMzCFxrN?usp=sharing")//mos
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1I5fjTC-TrG6YKsvohbBIuL-pEuzTHxlP?usp=sharing")//mof
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1Kgol8IlhGnq-VZcgXOfMfRWka5rce5OZ?usp=sharing")//tdm
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1uFsrw0cdCWTzWVPSKw2G9kF5i7clGuKu?usp=sharing")//mam
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1R0x8w4crUro5gDkxIEQ9B1b6YYQsZonv?usp=sharing")//be

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
