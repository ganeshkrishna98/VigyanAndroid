package com.ksu_cem.vigyan.ui.ee_notes

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Elec_ec_s5_notes_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elec_ec_s5_notes__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1qPVfRIkvgqdYQU2wVEqHCbb0xpShesqP")//pgt
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1rC8d-MWbRDWaXGoj_cPJig-COxJPhBN-")//lcs
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1r5uicqPOdINwmO6rocLVbuqZXmN0FutG")//pe
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1qgIT5TyS87nGZ81XWRd-bbgLxrPLDhex")//sas
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1q_PwhWAQh5RnCuuq4NcjiTg2VCS-Cwra")//mp
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1e2pb82iSJ8poSYgnMmcsIYUn5Kafdhls")//ele

        val btn8 = findViewById<Button>(R.id.button8)   //pgt btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)   //lcs btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10) //pe btn
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris4)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11)//sas btn
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris5)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12) //mp btn
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
