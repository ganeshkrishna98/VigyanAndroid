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
            Uri.parse("https://drive.google.com/drive/u/2/folders/1hgqkrsRujKRi3RI2Tp1ueOp8nxVNRm4Z")//cg lnk
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1iTVPKcJxPP9nhg5jCoIAGRGDTHyCJ30W")//pplnk
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1iICuxB_Tdt1zf_wh3TmQZINT_L3YnnSp")//cs lnk
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1i6GWzW6yc4iPs5g_zBG-SgktEADk5xIp")//dc lnk
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1i23Y9FLbO1hE4b7o_VrfoE-OSHQNwZKM")//cr lnk
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1Al8lQE9zyTmo168m-py6gqUiLlCDYSbI")// el lnk

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
