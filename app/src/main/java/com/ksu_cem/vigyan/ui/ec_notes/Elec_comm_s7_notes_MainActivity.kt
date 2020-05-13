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
            Uri.parse("https://drive.google.com/drive/u/2/folders/18Pq9jEDOviVPTLVHzfN8BGSO9NcbFXg_")//itc
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/185z2CIDxXrTiuQE3-bRGYrqYasRNGDN9")//mwr
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/17kEJfOJCs6GZ9yugOehyjC1XRRdcMC2I")//oc
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/18d8CQs5jNLPudrpzwaZk9WjMLJFAJX1h")//com
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/17h7FRg2tTbF0IpkLOQkrkjjnfDYcu9OU")//cs
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1T5mqTsp3PjEkFiTOnkK2PEnk65lnzZ5-")//ele

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
