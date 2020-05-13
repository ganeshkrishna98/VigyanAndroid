package com.ksu_cem.vigyan.ui.ec_notes

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Elec_comm_s6_notes_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elec_comm_s6_notes__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/171xvMentA8AWY0mFHA4kyiX4GobYrctS")//dc
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/16ysKdlekYHiLI4Rylt4SdIuH_8v9-GLc")//vlsi
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/16lYtOv31JQFRvZRRm0kaIi8trmXxu2Y-")//awp
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/16UvmzAJEfco_3aYcJXNkr5sFEwxT-Mzw")//es
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/16KJm9ZfMszLIOBkpIrYcHUZwnUMv7FD6")//oop
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
