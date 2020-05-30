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
            Uri.parse("https://drive.google.com/drive/folders/1TaOWWwxoeF6EPoL06okXfTXXCaOwa1-k?usp=sharing") //ds lnk
        val cduri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1aaI-UtdrDlQNwKsUTpxPnhNyjSnix19B?usp=sharing")// cd lnk
        val cnuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/16kYiILEB9ESJr5Jk6MnAHj8Ikp6yRRgU?usp=sharing")// cn lnk
        val seuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1CqHmEZuX05V0h20RUaL89ar2odz0NnC2?usp=sharing")// se lnk
        val pmuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1G9Nxd6ewkm7YZ4WJXyMKdr-NPGbpPvWO?usp=sharing")// pm lnk
        val eluri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1Nqrd_TUk56Rwq4gB5w9kYMFG01jdbWD1?usp=sharing")// el lnk

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
