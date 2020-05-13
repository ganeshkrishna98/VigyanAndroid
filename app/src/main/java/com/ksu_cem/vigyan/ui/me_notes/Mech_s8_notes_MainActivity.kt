package com.ksu_cem.vigyan.ui.me_notes

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Mech_s8_notes_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mech_s8_notes__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1ZR2N0lzkZwT3R3LL-t5XRjySjzdl60fl")//dm2
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1ZGM4upncGCeOYGlyjQr8Hf7zSCg7dVRJ")//ie
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1R7HL18xYVwUxtaa6SVcIr23GFFVG7dTk")//ele

        val btn8 = findViewById<Button>(R.id.button8)//dm2 btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)//ie btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn13 = findViewById<Button>(R.id.button13)//ele btn
        btn13.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris7)
            startActivity(intent)
        }
    }
}
