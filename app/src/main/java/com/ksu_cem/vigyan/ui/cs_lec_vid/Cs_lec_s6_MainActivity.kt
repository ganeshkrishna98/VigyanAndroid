package com.ksu_cem.vigyan.ui.cs_lec_vid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Cs_lec_s6_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cs_lec_s6__main)
        supportActionBar?.hide()

        val dsuri: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1fj4AazaynkkkbVUZkehh8oKO4ORkMKOo") //ds lnk
        val cduri: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1fg09SMTyj2WEJJrpckDuJ5tgWXKoACeu")// cd lnk
        val cnuri: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1fZlt6lcyyC301Hs1u18L00URUMa51qgy")// cn lnk
        val seuri: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1fMzSWh1RPLgxl7HyIGyPkwvJqAmJTHKz")// se lnk
        val pmuri: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1fCa-YCskcP2FvocrdZkUaoDByNgyXPGy")// pm lnk
        val eluri: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1SmVgbZ5_ghB3YsRNvDAW7ZueVtom7trW")// el lnk

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
