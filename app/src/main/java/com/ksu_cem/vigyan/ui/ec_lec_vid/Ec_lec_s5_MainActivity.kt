package com.ksu_cem.vigyan.ui.ec_lec_vid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Ec_lec_s5_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ec_lec_s5__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1wpLwRo5tJwV65QrWj9UWUMEwL6duoIap?usp=sharing") //dsp
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1ogIs8wi-Nm2I1IaLAlOYofk42m_k2mv_?usp=sharing")//aet
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/folders/16w4OebdD7cbGY8hD3n5XR81sgQ13YVPh?usp=sharing")//mp
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1BYprRPRsRcx_fqI_V9wQyhUAlFxiXi3u?usp=sharing")//pm
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1Foql1kOfy8z03rI1bUzHInTZYp9h9leC?usp=sharing")//pe
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/folders/10qU8tdv4ZSK6fWnPVGXaV1kMyYHCcXQj?usp=sharing")//ele

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
