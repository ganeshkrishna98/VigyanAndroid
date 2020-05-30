package com.ksu_cem.vigyan.ui.ec_lec_vid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Ec_lec_s3_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ec_lec_s3__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1abIViJK9LEZHVEbW_YN5BXI40SBUD28O?usp=sharing")//laca
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1uBrWjjDeb2G5f-XOIPIovybzEecK-JOy?usp=sharing")//nt
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1VJzAnQhG6iWpX7-fZ78g-YRIdK96UN0y?usp=sharing")//ssd
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1Z_Ux2yovLc5A-c5u7Vm0bjrHBbHmWfaE?usp=sharing")//ec
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1cCNbhy0pkKKEVcqUADUnRt7MyhYzFKT7?usp=sharing")//lcd
        val uris8: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1yUXwWOLTUZtYH_khmnj8FvISgrYboQ4S?usp=sharing")//ls

        val btn8 = findViewById<Button>(R.id.button8)   //laca btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)   //nt btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10) // ssd btn
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris4)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11)//ec btn
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris5)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12) //lcd btn
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
