package com.ksu_cem.vigyan.ui.ee_lec_vid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Ee_lec_s3_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ee_lec_s3__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1aidhd8PsBclJp_YQ7ZRmuTK7pIdXzXVd")  //laca
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1onTRn71rPr2qM4iVtZRhXftJhpzwQ6lH")   //cnt
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1pI9P1oyjVJsTwRTE_FPsjg0itEbEa_yT")   //aec
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1pAT_XaapRDLa2aUGE_cZpJ8YBXu1197C")   //dmt
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1p--_X5KEH-RcTfjhiKHESDarE1C9x3ps")   //cp
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1acLvTJYBL-pyF3vgkBtErIMEjvnkOWw-")   //be

        val btn8 = findViewById<Button>(R.id.button8)   //laca btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)   //cnt btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10) //aec btn
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris4)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11) //dmt btn
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris5)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12) //cp btn
        btn12.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris6)
            startActivity(intent)
        }
        val btn13 = findViewById<Button>(R.id.button13) //be btn
        btn13.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris7)
            startActivity(intent)
        }
    }
}
