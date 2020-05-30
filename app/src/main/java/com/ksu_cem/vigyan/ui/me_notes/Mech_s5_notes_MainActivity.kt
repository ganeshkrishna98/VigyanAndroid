package com.ksu_cem.vigyan.ui.me_notes

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Mech_s5_notes_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mech_s5_notes__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/folders/12GDXj4_IggZU0-YcP_BzKcXXHcUsRd6D?usp=sharing")//mom
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1Vmvf805sWGdy8OaqXMTqKnDHq8qgraJ3?usp=sharing")//mtdm
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1OpWr-D7696CM734ohZ-4K1veD_WSnXQh?usp=sharing")//cpnm
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1CjVclH3NeB5FILniAdHx9bUt76FsA8py?usp=sharing")//edc
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1L1kdfF14UcH7cnvlqtnsjnuAI-bIba1j?usp=sharing")//pm
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1duMGKnsEbxq6gemyRQpAWVYj3QaYd00Y?usp=sharing")//ele

        val btn8 = findViewById<Button>(R.id.button8)//mom btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)//mtdm btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10)//cpnm btn
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris4)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11)//edc btn
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
