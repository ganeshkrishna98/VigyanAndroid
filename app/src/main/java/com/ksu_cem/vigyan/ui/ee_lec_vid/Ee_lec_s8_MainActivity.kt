package com.ksu_cem.vigyan.ui.ee_lec_vid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Ee_lec_s8_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ee_lec_s8__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1wgHF8quiUw-V42svaFd6zNOjz8uWU7rz")//sem
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1wdqiQJ0DNHxnj01MqWdE1HXhNvxxDPXl")//iia
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1Htc8tc-Xcv10Sz1UtlkE1XAWNwWx2Pj5")//ele

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
        val btn13 = findViewById<Button>(R.id.button13)//ele btn
        btn13.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris7)
            startActivity(intent)
        }

    }
}
