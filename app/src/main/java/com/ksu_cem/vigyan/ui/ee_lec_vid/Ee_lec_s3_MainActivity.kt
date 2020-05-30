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
            Uri.parse("https://drive.google.com/drive/folders/1abIViJK9LEZHVEbW_YN5BXI40SBUD28O?usp=sharing")  //laca
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1NjxJLs2KzL8M68Ed8ZHeti8T1R7RAqad?usp=sharing")   //cnt
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1IN47bCGl6KoWc0GrAJjOHW-WcL1zN890?usp=sharing")   //aec
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1C-OFDnVT8TyjpgK5XaTmdvTLmxGTt0x7?usp=sharing")   //dmt
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1rr1Y0rczRwMn-0zmKQoZltTFn1J1ry7I?usp=sharing")   //cp
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1R0x8w4crUro5gDkxIEQ9B1b6YYQsZonv?usp=sharing")   //be

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
