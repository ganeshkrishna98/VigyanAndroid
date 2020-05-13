package com.ksu_cem.vigyan.ui.ec_notes

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Elec_comm_s8_notes_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elec_comm_s8_notes__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/19C6_zxaWMkeePUOoptBgIkmJcDUg0W2q")//ne
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/19dtNJjOLn2gBBa05VPF3MvJwiOSpGblm")//acs
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1UrxNtjtC6c_n0GJGz1wX3RglOzdyE0AL")//ele

        val btn8 = findViewById<Button>(R.id.button8) //ne btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)   //acs btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn13 = findViewById<Button>(R.id.button13) //ele btn
        btn13.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris7)
            startActivity(intent)
        }

    }
}
