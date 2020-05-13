
package com.ksu_cem.vigyan.ui.ee_notes

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Elec_ec_s7_notes_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elec_ec_s7_notes__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1t9Dcgo5sJAIwARzU-KUsXtBQUEkyCiG1")//ec
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1uRf91brJMQtQ_UYBw76tXaZa4rnBlU2a")//dgs
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1tuJdl3q8v0px8LAWHlrIRTKQ_RdsqvK1")//esd
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1t_cFHgopxYhnXkv0JnTe8fkk1xMeXK4F")//dsp
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1tX4xrvqnW5GtbzdSrAUUoUACTU1BH3Go")//emd
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1PBKTo09oiqzptfRsdor1lLJWkfsFUioH")//ele

        val btn8 = findViewById<Button>(R.id.button8)//ec btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)//dgs btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10)//esd btn
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris4)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11)//dsp btn
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris5)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12)//emd btn
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
