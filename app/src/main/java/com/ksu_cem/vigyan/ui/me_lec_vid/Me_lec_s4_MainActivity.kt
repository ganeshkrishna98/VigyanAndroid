package com.ksu_cem.vigyan.ui.me_lec_vid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Me_lec_s4_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_me_lec_s4__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1c8slJf6y-8jVk3in65mhCdycKeaOMJhI")//prob
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1EgHSDnRFoR7mHl4U1yoAolObXquM8MKa")//amos
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1Fii-NlGPJEICMyNi6zZXUKSULanchF3e")//te
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1FMQpJ5_xPSetVjDmCUfeOSkA7uwpkiCj")//fm
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1FAvPas2k_V4Y9vXtj7a7syeIJN3J-WuQ")//mt
        val uris8: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1aY9aD4dKa8BpPfDz4TW2P_D8LwBdfs0w")//ls

        val btn8 = findViewById<Button>(R.id.button8)//prob btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)//amos btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10)//te btn
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris4)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11)//fm btn
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris5)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12)//mt btn
        btn12.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris6)
            startActivity(intent)
        }
        val btn14 = findViewById<Button>(R.id.button13)//ls btn
        btn14.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris8)
            startActivity(intent)
        }
    }
}
