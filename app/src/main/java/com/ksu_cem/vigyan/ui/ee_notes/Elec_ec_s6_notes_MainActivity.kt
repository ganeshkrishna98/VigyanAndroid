package com.ksu_cem.vigyan.ui.ee_notes

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Elec_ec_s6_notes_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elec_ec_s6_notes__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1mgDXg-LDYUsQSOS-s7e_7txhsnWg2osj")//em
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1M3h6SkFu_2rFORBBA4JrFDSVd5XiV_6i")//act
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1xypTGFc2ksiKdK4w9ENHJJu_SU5BRmKv")//psa
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/13LbBfRScL6TIxCXOXmBdZHWzsHnMlM4U")//ed
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1aQIh5fzzSXo1QL0fdhZ9u6Hveda-d83G")//pm
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1ciGSp07NsT7TL2fGYhfZhsaPYeQttBjb")//ele

        val btn8 = findViewById<Button>(R.id.button8)//em btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)//act btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10)//psa btn
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris4)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11)//ed btn
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris5)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12)//pm btn
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
