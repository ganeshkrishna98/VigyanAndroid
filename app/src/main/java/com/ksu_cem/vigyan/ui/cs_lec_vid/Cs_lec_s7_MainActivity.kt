package com.ksu_cem.vigyan.ui.cs_lec_vid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Cs_lec_s7_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cs_lec_s7__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1nbcNkcHKanqU9FTXzvg86Oz8lG0DP3ye?usp=sharing")//cg lnk
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1DuaF3bHyJkIIDeMeLHoIgXRXgwsxOwLd?usp=sharing")//pplnk
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1Wm4--YTxP1tn9QpRugwqq8rU1fq8V3Ky?usp=sharing")//cs lnk
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/folders/15oaoIXD-FFTApEauxB7swSZYq8zaeI5X?usp=sharing")//dc lnk
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1iODfc8-2m3kYxvJNNkbzBclDd8XUFR7p?usp=sharing")//cr lnk
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1-r5eY1s2BHaIGyaLU0MTa6yuyAMR1D3Q?usp=sharing")// el lnk

        val btn8 = findViewById<Button>(R.id.button8) //comp gra btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9) // prog parad btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10) //comp sys arch btn
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris4)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11) //dist comp btn
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris5)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12) //crypt btn
        btn12.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris6)
            startActivity(intent)
        }
        val btn13 = findViewById<Button>(R.id.button13) //elect btn
        btn13.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris7)
            startActivity(intent)
        }
    }
}
