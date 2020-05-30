package com.ksu_cem.vigyan.ui.me_notes

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Mech_s4_notes_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mech_s4_notes__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1P0Oc9TnKMGY8D4aZLQ3smiLz4EteEhO_?usp=sharing")//prob
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1TBTa0NOurVxh8_1CNsOElqvS5WuajJf6?usp=sharing")//amos
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1GWFffMFxRfLGntsaph6U0fxh_ZbbCXip?usp=sharing")//te
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1MIUfhtEDE04GzKROd7jib2UhVO0kozEo?usp=sharing")//fm
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/folders/11Q_kQ6JLjUuBErZSvLcHMZOMR-JXplMu?usp=sharing")//mt
        val uris8: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1xxgXnFmYpbVv_DJclHH4EZQWG3FTCVKV?usp=sharing")//ls

        val btn8 = findViewById<Button>(R.id.button8)//prob btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)//amos btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10)//te btn
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris4)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11)//fm btn
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris5)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12)//mt btn
        btn12.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris6)
            startActivity(intent)
        }
        val btn14 = findViewById<Button>(R.id.button13)//ls btn
        btn14.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris8)
            startActivity(intent)
        }
    }
}
