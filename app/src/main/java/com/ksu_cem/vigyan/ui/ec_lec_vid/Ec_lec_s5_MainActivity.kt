package com.ksu_cem.vigyan.ui.ec_lec_vid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Ec_lec_s5_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ec_lec_s5__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/14YlQf7ibO5lvnYPdLyYodqWwx30wC9E5") //dsp
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/15SVWt2LF-xsTxZ1z2MikouYItmydg_ct")//aet
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/154vgIDK4H1Rcdv1Vp_iaoWvepoHuplgZ")//mp
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/14nzwk2Yv2jU1j9Zsm4TDRaKencczoFgp")//pm
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/14x_G19kgfZAeqE9K203rJLAvDRSATDhW")//pe
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1RNu2Ilx99fr8iN-zDVok7UicJTeCp-Fj")//ele

        val btn8 = findViewById<Button>(R.id.button8)   //dsp btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)   //aet btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10) //mp btn
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris4)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11) //pm btn
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris5)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12) //pe btn
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
