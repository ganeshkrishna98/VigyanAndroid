package com.ksu_cem.vigyan.ui.ec_lec_vid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Ec_lec_s7_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ec_lec_s7__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1lkTcfp_vD0Xm-XyDHZUJEwg1QDvhw0cM?usp=sharing")//itc
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1RFFy8UjrBM49mr8DcVh87OKHs9-J-tYb?usp=sharing")//mwr
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1Vqt0d0yAbuqmSr7yiT73vFUkzpn4heET?usp=sharing")//oc
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1LdDsRrTV2vNhvukS6FCeteC614D4eGd4?usp=sharing")//com
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1HIgPJhoZQrBQVpVwySGDn3uOanYXmTZ_?usp=sharing")//cs
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/folders/16_6phSBlkZtTER-4biOKwo3K3myWOoYj?usp=sharing")//ele

        val btn8 = findViewById<Button>(R.id.button8)   //itc btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9) //mwr btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10) //oc btn
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris4)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11) //com btn
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris5)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12) //cs btn
        btn12.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris6)
            startActivity(intent)
        }
        val btn13 = findViewById<Button>(R.id.button13) //ele btn
        btn13.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris7)
            startActivity(intent)
        }
    }
}
