package com.ksu_cem.vigyan.ui.ee_notes

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Elec_ec_s4_notes_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elec_ec_s4_notes__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1P0Oc9TnKMGY8D4aZLQ3smiLz4EteEhO_?usp=sharing")   //prob
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/folders/11uG-GbZuSs3ZV74Bhisslq6tiK-WbLtL?usp=sharing")   //sim
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1hstztQv3ITjvd1GBubzHk5kn_WvARq6J?usp=sharing")   //del
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1WtCJLqOOZRlfZRbgdnYfAzmdgWSEJv_m?usp=sharing")   //ms
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1vOZefSL_R4WTbRfm2Fs37uB11cS3qN70?usp=sharing")   //mai
        val uris8: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1xxgXnFmYpbVv_DJclHH4EZQWG3FTCVKV?usp=sharing")   //ls

        val btn8 = findViewById<Button>(R.id.button8)   //prob btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)   //sim btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10) //del btn
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris4)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11) //ms btn
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris5)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12) //mai btn
        btn12.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris6)
            startActivity(intent)
        }
        val btn14 = findViewById<Button>(R.id.button13) //ls btn
        btn14.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris8)
            startActivity(intent)
        }
    }
}
