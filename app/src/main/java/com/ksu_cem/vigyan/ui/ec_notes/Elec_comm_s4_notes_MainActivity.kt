package com.ksu_cem.vigyan.ui.ec_notes

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Elec_comm_s4_notes_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elec_comm_s4_notes__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1P0Oc9TnKMGY8D4aZLQ3smiLz4EteEhO_?usp=sharing")//prob
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1HtjxMc16fz9YjpKRJtWjC8UiBR-Fj8Fi?usp=sharing")//sas
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1f9jFr0zYayGQlJstli5Tiy8hjml5fyMs?usp=sharing")//aic
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/folders/15gwh_i5QQRrz0NiGPIzLe8o6CZot5ihY?usp=sharing")//co
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1xAvvyaZoCAlUKE1jDKOVrBl9bHQQhkxP?usp=sharing")//ac
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1HUFo9pQDSWn9rDKyVw7kcbaE_N220nld?usp=sharing")//be

        val btn8 = findViewById<Button>(R.id.button8)   //prob btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9) // sas btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10) //aic btn
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris4)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11) //co btn
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris5)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12) //ac btn
        btn12.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris6)
            startActivity(intent)
        }
        val btn13 = findViewById<Button>(R.id.button13) // be btn
        btn13.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris7)
            startActivity(intent)
        }
    }
}
