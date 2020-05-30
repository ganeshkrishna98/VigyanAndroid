package com.ksu_cem.vigyan.ui.me_lec_vid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Me_lec_s7_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_me_lec_s7__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/folders/194FY-OlSSfv33cECvHnchrFLklHBxopH?usp=sharing")//dm1
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1NSu3h-Eobt6X8StrPc6jjKa8sggSMOPr?usp=sharing")//aee
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1K64F8mcR7ctgQxJslv83ZTLHmTgjwHly?usp=sharing")//rf
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1FY3nu0HuIeLzG2sp8Kxk7mb4opVmTO12?usp=sharing")//met
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1QUU46eAkXoJjDq0SWm2SKQY_9k1GReVl?usp=sharing")//cff
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1XI8zjm0UveMh8UT8RqRqIjeSDT1q9LVJ?usp=sharing")//ele

        val btn8 = findViewById<Button>(R.id.button8)//dm1 btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)//aee btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10)//rf btn
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris4)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11)//met btn
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris5)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12)//cff btn
        btn12.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris6)
            startActivity(intent)
        }
        val btn13 = findViewById<Button>(R.id.button13)//ele btn
        btn13.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris7)
            startActivity(intent)
        }
    }
}
