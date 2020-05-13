package com.ksu_cem.vigyan.ui.ee_notes

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Elec_ec_s3_notes_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elec_ec_s3_notes__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1an72X5F0VAIwXr7rrqOTedfsuLz9kBzS")  //laca
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1opeuMpTj3mUut0PqSYlHe_rBb6oIpFd6")   //cnt
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1pJH4JOMO4bEwoSYB34Jc0MCf4xH3ZUvH")   //aec
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1pBHWKYUVLX8ijIeNjJ4tQIe_QznPvCeU")   //dmt
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1p7zjDFVAPfmIRKs60wDdRIEgDCW9-RyY")   //cp
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1acaL1xaIw2TUWJ08l5kZCqDTiG6frg-E")   //be

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
