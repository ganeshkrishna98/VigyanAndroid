package com.ksu_cem.vigyan.ui.dash_qstnp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Mech_qstnp_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mech_qstnp__main)
        supportActionBar?.hide()

        val uris1: Uri = Uri.parse("https://drive.google.com/drive/folders/1TulDOGhJlwEgKQ0tfch3ry07ZsWHRolL?usp=sharing")
        val uris3: Uri = Uri.parse("https://drive.google.com/drive/folders/1-3djUOKanOrPjhLd-lhL_164iv-xcq7U?usp=sharing")
        val uris4: Uri = Uri.parse("https://drive.google.com/drive/folders/13ZCqMr2PKPYoJeuxOxwqs7ZD8Jj7Ylj-?usp=sharing")
        val uris5: Uri = Uri.parse("https://drive.google.com/drive/folders/1MO4G5sP9fL3S2836CDgewJrDGtpm3dqm?usp=sharing")
        val uris6: Uri = Uri.parse("https://drive.google.com/drive/folders/19ED7LjU004mBneS-SyulAvkJoOPvwW7p?usp=sharing")
        val uris7: Uri = Uri.parse("https://drive.google.com/drive/folders/1n_k3H7T_VLcBfcR-gwAHMBPAk-MHOgmB?usp=sharing")
        val uris8: Uri = Uri.parse("https://drive.google.com/drive/folders/1FRoe7LK7uYZ-NLX5o4xA7EGBLCyjGk7B?usp=sharing")

        val btn29 = findViewById<Button>(R.id.button29)
        btn29.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, uris1)
            startActivity(intent)
        }
        val btn30 = findViewById<Button>(R.id.button30)
        btn30.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn31 = findViewById<Button>(R.id.button31)
        btn31.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, uris4)
            startActivity(intent)
        }
        val btn32 = findViewById<Button>(R.id.button32)
        btn32.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, uris5)
            startActivity(intent)
        }
        val btn33 = findViewById<Button>(R.id.button33)
        btn33.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, uris6)
            startActivity(intent)
        }
        val btn34 = findViewById<Button>(R.id.button34)
        btn34.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, uris7)
            startActivity(intent)
        }
        val btn35 = findViewById<Button>(R.id.button35)
        btn35.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, uris8)
            startActivity(intent)
        }
    }
}
