package com.ksu_cem.vigyan.ui.me_lec_vid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Me_lec_s6_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_me_lec_s6__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/10yap8oviU1IHOb2n2wsXCUSYBtDIfRZR")//hmt
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1Ppxxg-ex4R7BbnwgyPOaG0yDCikNsILq")//dm
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1RGapGNFMQhFW5sX7553pHEwbPGfbyKDa")//amt
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1R0XPk2x8u-mQftJDdVH79fktCwB5bUWV")//mi
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1Qfb0IccPqtwYZG2s9KU_-8UrQSSCxIzG")//cad
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1cAqwNyjYUTFDwDXwFN1CEmiq5K1xBZc-")//ele

        val btn8 = findViewById<Button>(R.id.button8)//hmt btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)//dm btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10)//amt btn
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris4)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11)//mi btn
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris5)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12)//cad btn
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
