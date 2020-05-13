package com.ksu_cem.vigyan.ui.ee_lec_vid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Ee_lec_s7_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ee_lec_s7__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1t7kTzIEJm6d3frAoEDGDbvGSTs3lal-e")//ec
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1u66oim6PTz1ZZ86LLBsh_c52Qn8awslX")//dgs
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1tnSvAG0rltJOUz9x5IpxphjRC4ti_ZnQ")//esd
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1tZCObMvpheIzRkHRBWnV1POM5f-daO5G")//dsp
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1tUSM3sxcqz3biEhWQOEAKocJIn1amCmZ")//emd
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1PBKTo09oiqzptfRsdor1lLJWkfsFUioH")//ele

        val btn8 = findViewById<Button>(R.id.button8)//ec btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)//dgs btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10)//esd btn
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris4)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11)//dsp btn
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris5)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12)//emd btn
        btn12.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris6)
            startActivity(intent)
        }
        val btn13 = findViewById<Button>(R.id.button13)//ele btn
        btn13.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris7)
            startActivity(intent)
        }
    }
}
