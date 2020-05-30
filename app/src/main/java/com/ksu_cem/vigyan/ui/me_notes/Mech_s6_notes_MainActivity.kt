
package com.ksu_cem.vigyan.ui.me_notes

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Mech_s6_notes_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mech_s6_notes__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1ubxyadZZAzJSPXVFXke5EpjcFLhjwdS_?usp=sharing")//hmt
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1eYNA4dw89-Ug5OOzN07wNz-WBON_dQYL?usp=sharing")//dm
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1BEY2eq3yU5mOKjsTM0zgqFnj4QdsGBaz?usp=sharing")//amt
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/folders/16G3UvyE2iYEU-XSWm_H1tsqe0IYq_Ald?usp=sharing")//mi
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1cjsEF6qTJAj757mwcru-L83TSVTszjO9?usp=sharing")//cad
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1RO6_iYgo37MkjnmXObozU425A1-S3Qpk?usp=sharing")//ele

        val btn8 = findViewById<Button>(R.id.button8)//hmt btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)//dm btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10)//amt btn
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris4)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11)//mi btn
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris5)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12)//cad btn
        btn12.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris6)
            startActivity(intent)
        }
        val btn13 = findViewById<Button>(R.id.button13)//ele btn
        btn13.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris7)
            startActivity(intent)
        }
    }
}
