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
            Uri.parse("https://drive.google.com/drive/folders/11gQmfXP24Pv04nTuBRGLuARXAnXaXRqy?usp=sharing")// laca lnk
        val dcuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1eSmhqpBKI0SbZSCInRns2sQuhb5K9Er-?usp=sharing") // discrete comp link
        val sturi: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1HteZBbixzjEJc6ZNQI6Giyi_UqxLgEyp?usp=sharing") // switching theory lnk
        val dsuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1Hc5Xntjwe6mv1npaJb72hfVNBRvW9zUE?usp=sharing") //data structure link
        val edcuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1wwac43F0zM7p0EttSosILbjtpo_Twb2-?usp=sharing")// electronic device lnk
        val lsuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1xxgXnFmYpbVv_DJclHH4EZQWG3FTCVKV?usp=sharing")//lifeskil lnk

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
        val btn14 = findViewById<Button>(R.id.button13)// life skills btn
        btn14.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, lsuri)
            startActivity(intent)
        }
    }
}
