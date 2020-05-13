package com.ksu_cem.vigyan.ui.ee_notes

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Elec_ec_s8_notes_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elec_ec_s8_notes__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1whSBRueXPYpMdjJzhD42FqWGnZbllvl4")//sem
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1wfD9SFgOK-3qaI0t9xHI_KYefV0ibzFH")//iia
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1Htc8tc-Xcv10Sz1UtlkE1XAWNwWx2Pj5")//ele

        val btn8 = findViewById<Button>(R.id.button8)//sem btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)//iia btn
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
