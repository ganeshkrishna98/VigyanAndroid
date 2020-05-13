package com.ksu_cem.vigyan.ui.dash_qstnp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Elec_comm_qstnp_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elec_comm_qstnp__main)
        supportActionBar?.hide()

        val uris1: Uri = Uri.parse("https://drive.google.com/drive/u/2/folders/1-Vm2HxgTMgfCSbFdiUujxOxVgtc78WiX")
        val uris3: Uri = Uri.parse("https://drive.google.com/drive/u/2/folders/15J7UP-p2AI7mZDT9t3Tc7h-PlkigX4qx")
        val uris4: Uri = Uri.parse("https://drive.google.com/drive/u/2/folders/1kwSOY4IvDpSHA0Zj3dTL1FOFP2wg3mqT")
        val uris5: Uri = Uri.parse("https://drive.google.com/drive/u/2/folders/1FMvylAjS4JfAmPxZ2PB6w8VdEZNTdqLs")
        val uris6: Uri = Uri.parse("https://drive.google.com/drive/u/2/folders/1RBfo1zGSjXNo5hpoqEQ3NSBvZ8aSF6go")
        val uris7: Uri = Uri.parse("https://drive.google.com/drive/u/2/folders/19Ueal9yVDd4iyFpXZUSfQXX9NiSq6Bun")
        val uris8: Uri = Uri.parse("https://drive.google.com/drive/u/2/folders/1Q2QTX3XiW-LzrSEneJE_Mm8tCLoE0Kv3")

        val btn22 = findViewById<Button>(R.id.button22)
        btn22.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, uris1)
            startActivity(intent)
        }

        val btn23 = findViewById<Button>(R.id.button23)
        btn23.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn24 = findViewById<Button>(R.id.button24)
        btn24.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, uris4)
            startActivity(intent)
        }
        val btn25 = findViewById<Button>(R.id.button25)
        btn25.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, uris5)
            startActivity(intent)
        }
        val btn26 = findViewById<Button>(R.id.button26)
        btn26.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, uris6)
            startActivity(intent)
        }
        val btn27 = findViewById<Button>(R.id.button27)
        btn27.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, uris7)
            startActivity(intent)
        }
        val btn28 = findViewById<Button>(R.id.button28)
        btn28.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, uris8)
            startActivity(intent)
        }

    }
}
