package com.ksu_cem.vigyan.ui.cs_notes

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Comp_sci_s4_notes_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comp_sci_s4_notes__main)
        supportActionBar?.hide()

        val prburi: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1cFGupDXeMT-kKO_WA_Qstw_43OdMuumf")//prob link
        val couri: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1b7EpqFlQr9N9Mb5bJykIlWZ7OTUJWLMa")// comp org lnk
        val osuri: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1blNRFR0yPgE-kvjh-5yQLO0cl0o4KkRZ")//os lnk
        val oopuri: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1bh0x9j9FmCwhRAJDNlvDsAexbhd_5FIN")//oop lnk
        val pdburi: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1bUjc3kdqBFbM7TUo9cHkoycN82pwPHrR")//p db lnk
        val beuri: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1acaL1xaIw2TUWJ08l5kZCqDTiG6frg-E")// be lnk

        val btn8 = findViewById<Button>(R.id.button8)   //prob btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,prburi )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)// comp org btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, couri)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10)//os btn
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, osuri)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11)//oop btn
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, oopuri)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12)// p db btn
        btn12.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, pdburi)
            startActivity(intent)
        }
        val btn13 = findViewById<Button>(R.id.button13)// business economics
        btn13.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, beuri)
            startActivity(intent)
        }
    }
}
