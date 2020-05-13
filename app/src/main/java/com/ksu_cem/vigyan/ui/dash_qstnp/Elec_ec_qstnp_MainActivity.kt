package com.ksu_cem.vigyan.ui.dash_qstnp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Elec_ec_qstnp_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elec_ec_qstnp__main)
        supportActionBar?.hide()

        val uris1: Uri = Uri.parse("https://drive.google.com/drive/u/2/folders/1Ggb0EmV1CoNT2D-oE7c1kfizyzt98-D9")
        val uris3: Uri = Uri.parse("https://drive.google.com/drive/u/2/folders/1cUPs93BZ8wxSBQNoSPT04nC077ynAfZo")
        val uris4: Uri = Uri.parse("https://drive.google.com/drive/u/2/folders/1YFaw5bG_v4cMokylpoctNzHefR448McB")
        val uris5: Uri = Uri.parse("https://drive.google.com/drive/u/2/folders/1b4y-zd8MlymCiqDU7r2pqEHqNdL0E_T-")
        val uris6: Uri = Uri.parse("https://drive.google.com/drive/u/2/folders/1T_HClci9dMNdtZ9UyzWeuU4vkK2ryVDh")
        val uris7: Uri = Uri.parse("https://drive.google.com/drive/u/2/folders/1eAeeJAxDXNLoBp1EuAl2SV9gmduBoiEc")
        val uris8: Uri = Uri.parse("https://drive.google.com/drive/u/2/folders/1Dtew6ZoRdGOTeLn4GF1o6qOLdm1D4gV5")

        val btn15 = findViewById<Button>(R.id.button15)
        btn15.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, uris1)
            startActivity(intent)
        }
        val btn16 = findViewById<Button>(R.id.button16)
        btn16.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn17 = findViewById<Button>(R.id.button17)
        btn17.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, uris4)
            startActivity(intent)
        }
        val btn18 = findViewById<Button>(R.id.button18)
        btn18.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, uris5)
            startActivity(intent)
        }
        val btn19 = findViewById<Button>(R.id.button19)
        btn19.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, uris6)
            startActivity(intent)
        }
        val btn20 = findViewById<Button>(R.id.button20)
        btn20.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, uris7)
            startActivity(intent)
        }
        val btn21 = findViewById<Button>(R.id.button21)
        btn21.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, uris8)
            startActivity(intent)
        }
    }
}
