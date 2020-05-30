package com.ksu_cem.vigyan.ui.me_notes

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Mech_s12_notes_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mech_s12_notes__main)
        supportActionBar?.hide()

        val epuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1SZ2Z246odJMqenU8p65983SuHcsxhh1h?usp=sharing")
        val pcuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1NjHCJGKWdL1jDepxSxFtyp6syhRHl53r?usp=sharing")
        val ecuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/15ya14znIXiOOq-necMhUyg4xmkcSr7wV?usp=sharing")
        val emuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1G7ER8FFUHO3wdt8RT5Mf3gnBOCNEoFNh?usp=sharing")
        val eguri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1Jzd2TBCv0wq2T9V32-HjNBobAOIcU-rk?usp=sharing")
        val beeuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1CgKoG1tJLLj_H9lymDj6dCBdQkikISuH?usp=sharing")
        val lsuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1JoDxBEkLWpYqImh48nmzax1N_br3QbMH?usp=sharing")
        val bmeuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1R_HxkVLRUZonK8hkVjeUJL_q91DvBjl0?usp=sharing")
        val deuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1OmzeiWRQ8VmmETOcWOTRepy5EZMkQmGp?usp=sharing")
        val lacuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1gE41KWO4XzeFXP4OyCqbVL8-kPLngCSf?usp=sharing")


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
