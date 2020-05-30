package com.ksu_cem.vigyan.ui.cs_notes

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Comp_sci_s6_notes_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comp_sci_s6_notes__main)
        supportActionBar?.hide()

        val dsuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1Tyxp29xkHe3VjLUIVElLCaj9WHJMsu_f?usp=sharing") //ds lnk
        val cduri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/12R19zYGOEewsTRSmUDsuNnmec1nQQC4y?usp=sharing")// cd lnk
        val cnuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1NS-ahE5hZuVxAHNVl7bbxpU2e6HKCNhK?usp=sharing")// cn lnk
        val seuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/17z4BanXxmHsj6YFzB9JItIl_GqevCzwK?usp=sharing")// se lnk
        val pmuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/14O1TtlO8Lbdh0ePaE4hOZ0gA8hceMZdz?usp=sharing")// pm lnk
        val eluri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1qV48gW0mcDL0xodLd0JTWMieooKfj9tS?usp=sharing")// el lnk

        val btn8 = findViewById<Button>(R.id.button8)   //design algo btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, dsuri)
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9) //comp dsn btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, cduri)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10) // comp net btn
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, cnuri)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11) //sw engg btn
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, seuri)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12) // prin mang btn
        btn12.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, pmuri)
            startActivity(intent)
        }
        val btn13 = findViewById<Button>(R.id.button13) // elective
        btn13.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, eluri)
            startActivity(intent)
        }
    }
}
