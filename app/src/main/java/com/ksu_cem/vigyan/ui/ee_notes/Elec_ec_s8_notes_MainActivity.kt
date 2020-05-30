package com.ksu_cem.vigyan.ui.ee_notes

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Elec_ec_s8_notes_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elec_ec_s8_notes__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1F4dfMRcsrDOgP6dJfuYMi4yCxVb0Ian3?usp=sharing")//sem
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1BWKGdfera_h1vmI9bO-z67uyTXH2DSrj?usp=sharing")//iia
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1KMhTw-vDK-xCmhMff7SccUp1W-P5Vd_1?usp=sharing")//ele

        val btn8 = findViewById<Button>(R.id.button8)//sem btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)//iia btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn13 = findViewById<Button>(R.id.button11)//ele btn
        btn13.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris7)
            startActivity(intent)
        }

    }
}
