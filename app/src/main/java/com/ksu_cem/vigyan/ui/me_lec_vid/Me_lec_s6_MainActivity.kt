package com.ksu_cem.vigyan.ui.me_lec_vid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Me_lec_s6_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_me_lec_s6__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1ECNZm_kuoOy8gIVoJ9WrVHtt35k0-XGR?usp=sharing")//hmt
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1JWgqVpXQi-W7rNKLmWFMzpkVqpnPP-x_?usp=sharing")//dm
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1W6NTnP35OP2a5bKgUHD5r6aU_st4aMeY?usp=sharing")//amt
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1kUKvvahk1Z_EYa4USwog-gFP4g-ZHvXW?usp=sharing")//mi
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1NL02N0I0YNTc2m_e9MNmFPnj5fTP2BAs?usp=sharing")//cad
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1ohrcsPVYBJ0ulwiUNadDshitbWGhzDKM?usp=sharing")//ele

        val btn8 = findViewById<Button>(R.id.button8)//hmt btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)//dm btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10)//amt btn
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris4)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11)//mi btn
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris5)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12)//cad btn
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
