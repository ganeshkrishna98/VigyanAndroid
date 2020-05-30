package com.ksu_cem.vigyan.ui.ec_notes

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Elec_comm_s5_notes_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elec_comm_s5_notes__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/folders/13zB-auE6arIiiYUPqsyYUwM0WNSt4VVZ?usp=sharing") //dsp
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1oL50i-nGL9bGxPNWHyFZHcJWyv_li2Br?usp=sharing")//aet
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/folders/15bqlG6mXkK7xiKYOp_ENoh-WG_TkBMCP?usp=sharing")//mp
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1pPbXk0tfnh-SLMCj1WFmRHd7ON6ReXqv?usp=sharing")//pm
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/folders/18A5grtfW0HpasUwqijoTJDlPyeK-vpNq?usp=sharing")//pe
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1GCJ-s-vin2IP3g9A9jLtJxVVlBf5x2B2?usp=sharing")//ele

        val btn8 = findViewById<Button>(R.id.button8)   //dsp btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)   //aet btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10) //mp btn
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris4)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11) //pm btn
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris5)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12) //pe btn
        btn12.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris6)
            startActivity(intent)
        }
        val btn13 = findViewById<Button>(R.id.button13) //ele btn
        btn13.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris7)
            startActivity(intent)
        }
    }
}
