package com.ksu_cem.vigyan.ui.ec_lec_vid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Ec_lec_s6_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ec_lec_s6__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/170iISlUvQDy3tmVsgD5FxUQup6x07FRo")//dc
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/16ym-lRK365W-pO3J3xW69O7wNdjCrlp4")//vlsi
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/16cLNYEAbTwMeJL26FDb277JGeVq92srU")//awp
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/16QmFj8fQteKwvo74yugR0nbzi1w2BX4b")//es
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/16E2DJ_IbBm2RcnXg5V_iBd20wToic4L5")//oop
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1nvMa8N4JCR4uh7BGKTjDlnsZXYmXYHKD")//ele

        val btn8 = findViewById<Button>(R.id.button8)   //dc btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)   //vlsi btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10) //awp btn
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris4)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11) //es btn
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris5)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12) //oop btn
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