package com.ksu_cem.vigyan.ui.me_lec_vid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Me_lec_s8_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_me_lec_s8__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1ZO1wlvleJ0VK9D8_7VDmPlmiTUMiVNOK")//dm2
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1Z9xVrySQy7sTlpIKTJqWxohMMV2W1bre")//ie
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1R7HL18xYVwUxtaa6SVcIr23GFFVG7dTk")//ele

        val btn8 = findViewById<Button>(R.id.button8)//dm2 btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)//ie btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn13 = findViewById<Button>(R.id.button13)//ele btn
        btn13.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris7)
            startActivity(intent)
        }
    }
}
