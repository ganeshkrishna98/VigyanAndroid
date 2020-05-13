package com.ksu_cem.vigyan.ui.ee_lec_vid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Ee_lec_s12_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ee_lec_s12__main)
        supportActionBar?.hide()

        val epuri: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1MeFAG3x2JQKa-RRY2tTOG7Cm7_4i3nWg")
        val pcuri: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/10GStu9LTY56Tgv_n1f9k1XuuVwBUwTK0")
        val ecuri: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1-gmqH8HvG5MI-wCRbpT3gOCOTCWoWWjt")
        val emuri: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/107UgrhxCs8hSF6zSUzsr9IoEJdukaIdv")
        val eguri: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1170_uGIBtfhMWVN1b-PyUR2--kIeUAkB")
        val beeuri: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1-Dz5YeTKi7y0hndbsf-UoWQr3cx5WRvE")
        val lsuri: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1-8m-nPEKUFWRPwbCacrqCZE7M1uDMf3G")
        val bmeuri: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1-KxgUjKLsJXifjZN0az7yGbop4VTKQgU")
        val deuri: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/10ZBU0mOL8doccdmfxhbvvKII8HGuggBX")
        val lacuri: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/10iwYxCfHS-rjwKAwCENyapHbFYNvHokN")

        val btn8 = findViewById<Button>(R.id.button8)
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,lacuri )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, epuri)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10)
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, ecuri)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11)
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, eguri)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12)
        btn12.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, lsuri)
            startActivity(intent)
        }
        val btn13 = findViewById<Button>(R.id.button13)
        btn13.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, deuri)
            startActivity(intent)
        }
        val btn14 = findViewById<Button>(R.id.button14)
        btn14.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, pcuri)
            startActivity(intent)
        }
        val btn15 = findViewById<Button>(R.id.button15)
        btn15.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, emuri)
            startActivity(intent)
        }
        val btn16 = findViewById<Button>(R.id.button16)
        btn16.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, beeuri)
            startActivity(intent)
        }
        val btn17 = findViewById<Button>(R.id.button17)
        btn17.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, bmeuri)
            startActivity(intent)
        }
    }
}
