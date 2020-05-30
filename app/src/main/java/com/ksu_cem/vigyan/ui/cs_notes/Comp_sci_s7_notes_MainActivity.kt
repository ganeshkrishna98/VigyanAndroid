package com.ksu_cem.vigyan.ui.cs_notes

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Comp_sci_s7_notes_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comp_sci_s7_notes__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1Fm8NH6-W8PxZYJtgA4PcXyzwFwsb09ow?usp=sharing")//cg lnk
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1wCEyVjwdbm27tIowUAQkQrRvv9XXj_2t?usp=sharing")//pplnk
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/folders/16htgEtZTYDaSocySRAaUAbAUI1oNaiEm?usp=sharing")//cs lnk
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1pqXlUhmqvr143OGhEnbidcM1z9TGwxt3?usp=sharing")//dc lnk
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1hgP55kcpCXLXANbod2n0SZhlevJDZbMA?usp=sharing")//cr lnk
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1H-EyVH9yWqfZGJwe0BcXKGTGKVH5bZXk?usp=sharing")// el lnk

        val btn8 = findViewById<Button>(R.id.button8) //comp gra btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9) // prog parad btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10) //comp sys arch btn
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris4)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11) //dist comp btn
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris5)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12) //crypt btn
        btn12.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris6)
            startActivity(intent)
        }
        val btn13 = findViewById<Button>(R.id.button13) //elect btn
        btn13.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris7)
            startActivity(intent)
        }
    }
}
