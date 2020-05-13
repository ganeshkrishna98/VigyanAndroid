package com.ksu_cem.vigyan.ui.cs_notes

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Comp_sci_s3_notes_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comp_sci_s3_notes__main)
        supportActionBar?.hide()

        val lacauri: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1an72X5F0VAIwXr7rrqOTedfsuLz9kBzS")// laca lnk
        val dcuri: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1__u1pomgiwF--iibB84K5Ky473IrCR9t") // discrete comp link
        val sturi: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1a6G7c35c9f7V4XXS9xvR9HspG1UbFC8i") // switching theory lnk
        val dsuri: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1_pgQUTSVZpkxw6ah8KiX1xGLGpgHcGc-") //data structure link
        val edcuri: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1_j5WmeZ4Uu4hsy2rQXFpGP3Wg_Dz_OhU")// electronic device lnk
        val lsuri: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1aatMAwUpX858UMhg-_fhKX070K5ziFLo")//lifeskil lnk

        val btn8 = findViewById<Button>(R.id.button8)       //laca btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,lacauri )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)   // discrete comp btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, dcuri)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10) //switching theory button
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, sturi)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11) //data structure button
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, dsuri)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12) // electronic device btn
        btn12.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, edcuri)
            startActivity(intent)
        }
        val btn14 = findViewById<Button>(R.id.button14)// life skills btn
        btn14.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, lsuri)
            startActivity(intent)
        }
    }
}
