package com.ksu_cem.vigyan.ui.dash_qstnp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Comp_sci_qstnp_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comp_sci_qstnp__main)
        supportActionBar?.hide()

        val uris1: Uri = Uri.parse("https://drive.google.com/drive/folders/1PsxUsPY79RxIA18VdIBwTpBJvqpgCCQa?usp=sharing")
        val uris3: Uri = Uri.parse("https://drive.google.com/drive/folders/1mITq2uO03eF1O2iOalJcPuBDPUvqdZbR?usp=sharing")
        val uris4: Uri = Uri.parse("https://drive.google.com/drive/folders/1MnN9Wlf6hHKS8Ilp0PIPRRgqUyHbv6LW?usp=sharing")
        val uris5: Uri = Uri.parse("https://drive.google.com/drive/folders/1VjnvIXp5vWwd3pBgcqLJ-aNl8aqtwelr?usp=sharing")
        val uris6: Uri = Uri.parse("https://drive.google.com/drive/folders/1Xl8JSol2pvObYCTUm2F8aFIekqBRcKwh?usp=sharing")
        val uris7: Uri = Uri.parse("https://drive.google.com/drive/folders/1n6y_CFDpCAJrPRVo5ImtgaZ5cApUVs0z?usp=sharing")
        val uris8: Uri = Uri.parse("https://drive.google.com/drive/folders/1Bw6i6OtP6ROpot-pT_E9Kw73zBQ4vCwu?usp=sharing")

        val btn8 = findViewById<Button>(R.id.button8)
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10)
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris4)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11)
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris5)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12)
        btn12.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris6)
            startActivity(intent)
        }
        val btn13 = findViewById<Button>(R.id.button13)
        btn13.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris7)
            startActivity(intent)
        }
        val btn14 = findViewById<Button>(R.id.button14)
        btn14.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris8)
            startActivity(intent)
        }
    }
}
