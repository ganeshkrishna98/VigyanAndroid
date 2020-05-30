package com.ksu_cem.vigyan.ui.me_lec_vid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Me_lec_s12_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_me_lec_s12__main)
        supportActionBar?.hide()

        val epuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1J0e1iJ8EVxiu26ryEliZgkC4Is_G0fgZ?usp=sharing")
        val pcuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1dbBxkAfEUIfHT3FTiHAZtXoWxI-qstCo?usp=sharing")
        val ecuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1QnHlJ9H8xZkqYm9dV0hXMWVCI8l2whvj?usp=sharing")
        val emuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1Ki41Zs0G2HMgG42sx1yvlV0t2Th24DBT?usp=sharing")
        val eguri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/16nZiND3SFkxKbbwk4XBwtCJT96fNPAAx?usp=sharing")
        val beeuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1KBjBmi29RVzX_HRspM54Tk_kpREcJfVN?usp=sharing")
        val lsuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1NI3KfJGM4sc8iStDwNwH46DIajfK9wCA?usp=sharing")
        val bmeuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1o6xn2zmz-SxQPSOAd8PTGvYJXHQINCJJ?usp=sharing")
        val deuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1q-g0xc7UK0VjMQVEZXUN3kdo0nRwdOVa?usp=sharing")
        val lacuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1p33birokcTucpZSL9szRXZsI0wKP28_n?usp=sharing")

        val btn8 = findViewById<Button>(R.id.button8)
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,lacuri )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, epuri)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10)
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, ecuri)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11)
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, eguri)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12)
        btn12.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, lsuri)
            startActivity(intent)
        }
        val btn13 = findViewById<Button>(R.id.button13)
        btn13.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, deuri)
            startActivity(intent)
        }
        val btn14 = findViewById<Button>(R.id.button14)
        btn14.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, pcuri)
            startActivity(intent)
        }
        val btn15 = findViewById<Button>(R.id.button15)
        btn15.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, emuri)
            startActivity(intent)
        }
        val btn16 = findViewById<Button>(R.id.button16)
        btn16.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, beeuri)
            startActivity(intent)
        }
        val btn17 = findViewById<Button>(R.id.button17)
        btn17.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, bmeuri)
            startActivity(intent)
        }
    }
}
