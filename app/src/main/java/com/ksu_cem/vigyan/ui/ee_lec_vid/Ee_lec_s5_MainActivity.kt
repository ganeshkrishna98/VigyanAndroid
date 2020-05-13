package com.ksu_cem.vigyan.ui.ee_lec_vid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Ee_lec_s5_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ee_lec_s5__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1qKhGXhDVHGavfrcXKxTNdfXc1r_tjJzE")//pgt
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1rC1N0XegEqLlOktcCXca-i3oj9rwCYz_")//lcs
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1r3xo3Fp23MyszGSnbS-ODazXXrQEqiUM")//pe
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1qfhV0wHwv60na18tlGn6VmC5nDbuQ4r1")//sas
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1qZFHeyIXjU9SY4G2S6L0LwVn7W0Ped_W")//mp
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1e2pb82iSJ8poSYgnMmcsIYUn5Kafdhls")//ele

        val btn8 = findViewById<Button>(R.id.button8)   //pgt btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)   //lcs btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10) //pe btn
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris4)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11)//sas btn
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris5)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12) //mp btn
        btn12.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris6)
            startActivity(intent)
        }
        val btn13 = findViewById<Button>(R.id.button13) //ele btn
        btn13.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris7)
            startActivity(intent)
        }
    }
}
