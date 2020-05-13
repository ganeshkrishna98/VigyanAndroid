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
            Uri.parse("https://drive.google.com/drive/u/2/folders/1cFGupDXeMT-kKO_WA_Qstw_43OdMuumf")//prob
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1491oYoxHYcCjZ_lCRj_IvAlzw3fI6YSq")//sas
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/13uoTeOG1EWsGmT6nGtTquPi4jQRt2Vmi")//aic
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/13cS23Whb9Pzn-12X8gq9f86vVJbejydX")//co
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/13Mgmy-fzPfz-DQa-veFTFQxHLG2hkIoC")//ac
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1acaL1xaIw2TUWJ08l5kZCqDTiG6frg-E")//be

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
