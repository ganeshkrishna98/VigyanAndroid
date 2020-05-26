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
            Uri.parse("https://drive.google.com/drive/u/2/folders/1aidhd8PsBclJp_YQ7ZRmuTK7pIdXzXVd")//laca
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/11gT7B86ZW1y8LG1A_iLy1ys3wmnaxsOB")//nt
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/11Sruxy6JAGJ8aKib6MQbkcp0C4qw_XQ_")//ssd
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/11H-muxH6lYvSBEOvCjMpnEqQCZwRP6FQ")//ec
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/11DxECGj5_jEVHrIFJs0L0PFiNNAXiZmW")//lcd
        val uris8: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1aY9aD4dKa8BpPfDz4TW2P_D8LwBdfs0w")//ls

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
