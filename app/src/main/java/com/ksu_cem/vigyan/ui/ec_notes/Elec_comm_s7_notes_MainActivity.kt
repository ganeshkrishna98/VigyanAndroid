package com.ksu_cem.vigyan.ui.ec_notes

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Elec_comm_s7_notes_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elec_comm_s7_notes__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1xQ8HvkgTlvxc_MUyqShEQcR-BctAuk_X?usp=sharing")//itc
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1vvwM3IBDcmsB__KrFIUyHej9quvxS7-9?usp=sharing")//mwr
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1wcClivZ0OV1h4jEDe4Qel6JVfpDE_ojE?usp=sharing")//oc
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1EcyJtJM6eM7j6O1kr0pSOwRcvIO9VyeK?usp=sharing")//com
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1yzDXBna7JBcXOtnG5ImSwwubJT3c6Q-F?usp=sharing")//cs
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1nI4dFmlijJvTiSF_dspis7ksH-qJBfW8?usp=sharing")//ele

        val btn8 = findViewById<Button>(R.id.button8)   //itc btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9) //mwr btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10) //oc btn
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris4)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11) //com btn
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris5)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12) //cs btn
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
