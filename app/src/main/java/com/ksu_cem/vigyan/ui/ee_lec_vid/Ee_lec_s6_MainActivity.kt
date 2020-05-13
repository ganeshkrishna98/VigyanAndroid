package com.ksu_cem.vigyan.ui.ee_lec_vid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Ee_lec_s6_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ee_lec_s6__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1OcA7SOH4hJS8sTiTB2YYefYnWdntYf1k")//em
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1beVQipTt_yzp72TMZ8HDNN8oDkUWj_Yl")//act
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1QGvoQ8a4FAvQTFuDG0aCeXLVOUUrYC9g")//psa
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1wbnabFtm3vzMwlZWliBNy93JdsjnusI7")//ed
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1niCsjyJEgQatXZ2riuq_dZG7_xuSCGFi")//pm
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1ciGSp07NsT7TL2fGYhfZhsaPYeQttBjb")//ele

        val btn8 = findViewById<Button>(R.id.button8)//em btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)//act btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10)//psa btn
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris4)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11)//ed btn
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris5)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12)//pm btn
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
