package com.ksu_cem.vigyan.ui.cs_notes

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Comp_sci_s12_notes_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comp_sci_s12_notes__main)
        supportActionBar?.hide()

        val epuri: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1-uWDZ9XsKIu0cp8UjjwKhU5NVI8FoBAn")
        val pcuri: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/10De73G5w3_EXjOFdlAshTs77pxEGO3ee")
        val ecuri: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1-cEf55zPxm50F3szGiel4ACh6xNTaqNg")
        val emuri: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/103MFWYbQs7KRAa2UOkL47C0C9PRT9mGj")
        val eguri: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/113wBCEiSeXGwKifORkzuZkgTjdeVxamu")
        val beeuri: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1-BSy-NLf6ovhcRUjGL_HVjM1EywavibM")
        val lsuri: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/11Fr92fHYq8BOPgySdU44oYy_Fb-PdRgP")
        val progcuri: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1-SFjKrqzXX6BoL45-kthsVUHh24H3pl7")
        val deuri: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/10Lz8ESbADKOTEPoDf-By-MtDhhnUCh6m")
        val lacuri: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/10essjIf3K6fDoef9_-F4CxzBzATqL1vF")

        val btn8 = findViewById<Button>(R.id.button8)
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,lacuri )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, epuri)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10)
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, ecuri)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11)
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, eguri)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12)
        btn12.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, lsuri)
            startActivity(intent)
        }
        val btn13 = findViewById<Button>(R.id.button13)
        btn13.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, deuri)
            startActivity(intent)
        }
        val btn14 = findViewById<Button>(R.id.button14)
        btn14.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, pcuri)
            startActivity(intent)
        }
        val btn15 = findViewById<Button>(R.id.button15)
        btn15.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, emuri)
            startActivity(intent)
        }
        val btn16 = findViewById<Button>(R.id.button16)
        btn16.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, beeuri)
            startActivity(intent)
        }
        val btn17 = findViewById<Button>(R.id.button17)
        btn17.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, progcuri)
            startActivity(intent)
        }
    }
}
