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

        val uris1: Uri = Uri.parse("https://drive.google.com/drive/folders/1z6sCTyTUDVIM9cDxlDr1klrXMrw5fCvK?usp=sharing")
        val uris3: Uri = Uri.parse("https://drive.google.com/drive/folders/1EyQu8YkZtZnv1bs2wc4vry2iU_D9Yh-1?usp=sharing")
        val uris4: Uri = Uri.parse("https://drive.google.com/drive/folders/1OaHcp0j8xQXw0Zup4dY3qtUGKI716Itb?usp=sharing")
        val uris5: Uri = Uri.parse("https://drive.google.com/drive/folders/1Ug6hJ6KDB-cctJLmg25g0_P7h23w_khR?usp=sharing")
        val uris6: Uri = Uri.parse("https://drive.google.com/drive/folders/1FDEMFJQDx13hp6hUYBn77TRPeX5LeGXR?usp=sharing")
        val uris7: Uri = Uri.parse("https://drive.google.com/drive/folders/1PaDv9zp3UVnrGaEXH-2uRtLAWM3bUksa?usp=sharing")
        val uris8: Uri = Uri.parse("https://drive.google.com/drive/folders/1nxL3N4pmkjRDnZBlFtlIa-NS4IiIctJw?usp=sharing")

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
