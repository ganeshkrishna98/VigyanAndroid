package com.ksu_cem.vigyan.ui.cs_notes

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Comp_sci_s5_notes_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comp_sci_s5_notes__main)
        supportActionBar?.hide()

        val tcuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1N5W7GN-W0YbvUbCKJCdu3T_QLt9u7-sL?usp=sharing")//theo comp lnk
        val ssuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1m04i_2157LRPmBbXJ7Yc4OIVghX_eMzw?usp=sharing")// sys sw lnk
        val mpuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1plzB9jQQ1jbJUREass5q-j4bRPN2vNdF?usp=sharing")// micropro lnk
        val dcuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1yAw01WjfCnyKCwhXUS-rrBjSYH8JZVqS?usp=sharing")//data comm lnk
        val gturi: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1APJbGyeps115X0m6a7f2qpJuP8DdPWnP?usp=sharing")// graph theo lnk
        val eluri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1bXyqXGHg9gm6xAYKXLYhhl9RrgksyRd2?usp=sharing")//elective

        val btn8 = findViewById<Button>(R.id.button8) //theory of comp btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, tcuri )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9) //sys sw btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, ssuri)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10) // micro pro btn
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, mpuri)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11)// data comm btn
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, dcuri)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12)// graph tho btn
        btn12.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, gturi)
            startActivity(intent)
        }
        val btn13 = findViewById<Button>(R.id.button13)//elective 1
        btn13.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, eluri)
            startActivity(intent)
        }
    }
}
