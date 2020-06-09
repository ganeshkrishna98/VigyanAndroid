package com.ksu_cem.vigyan.ui.me_lec_vid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Me_lec_s8_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_me_lec_s8__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1L_tGtRdSKaI2JSivzUvL96ywpdy9h_uI?usp=sharing")//dm2
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1_8-kEbCB3S_NyVA2kiNTkMbH1bcs49bT?usp=sharing")//ie
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/folders/19EHD1DXemfn9EQrEYktYZSx9uL4yRzeX?usp=sharing")//ele
        val uris8: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1Lk2_0Ih9NObCivsyPItjq18fJDBjGz0_?usp=sharing")//com ele

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
        val btn13 = findViewById<Button>(R.id.button11)//ele btn
        btn13.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris7)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12) // com ele
        btn12.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris8)
            startActivity(intent)
        }
    }
}
