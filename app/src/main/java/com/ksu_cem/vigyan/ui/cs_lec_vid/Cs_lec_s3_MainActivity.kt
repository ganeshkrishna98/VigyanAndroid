package com.ksu_cem.vigyan.ui.cs_lec_vid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Cs_lec_s3_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cs_lec_s3__main)
        supportActionBar?.hide()

        val lacauri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1abIViJK9LEZHVEbW_YN5BXI40SBUD28O?usp=sharing")// laca lnk
        val dcuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1nVFgCLVQZq3-oQG0yxpeLb-x-XQZznom?usp=sharing") // discrete comp link
        val sturi: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1sQ5ZejOiTKPsqFRLFhesEaS5IUeM2TDq?usp=sharing") // switching theory lnk
        val dsuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1GDseKMiytulaJ96Z8JGM0aIn4mc9peut?usp=sharing") //data structure link
        val edcuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1irXo_MoqOC2GNTwzafska0ka64i10vVF?usp=sharing")// electronic device lnk
        val lsuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1yUXwWOLTUZtYH_khmnj8FvISgrYboQ4S?usp=sharing")//lifeskil lnk

        val btn8 = findViewById<Button>(R.id.button8)       //laca btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,lacauri )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)   // discrete comp btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, dcuri)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10) //switching theory button
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, sturi)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11) //data structure button
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, dsuri)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12) // electronic device btn
        btn12.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, edcuri)
            startActivity(intent)
        }
        val btn14 = findViewById<Button>(R.id.button13)// life skills btn
        btn14.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, lsuri)
            startActivity(intent)
        }
    }
}
