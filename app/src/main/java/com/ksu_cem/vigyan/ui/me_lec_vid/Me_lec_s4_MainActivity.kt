package com.ksu_cem.vigyan.ui.me_lec_vid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Me_lec_s4_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_me_lec_s4__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1bOro5Rg56theWRR9FsQGLhXJehtXTz6a?usp=sharing")//prob
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1Xy1ShyPrXVgJBod9YVUMxLL__rEJ_Jes?usp=sharing")//amos
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1QHQt-1dzzVDGSe3BY7MrolLP8EWfIR2m?usp=sharing")//te
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1fEA5QqRTlYfCOvXSBPLc1AX2PSzGI8FH?usp=sharing")//fm
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1cdYGx5hfrjGWwcttez--cL23_qDvZIsG?usp=sharing")//mt
        val uris8: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1yUXwWOLTUZtYH_khmnj8FvISgrYboQ4S?usp=sharing")//ls

        val btn8 = findViewById<Button>(R.id.button8)//prob btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)//amos btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10)//te btn
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris4)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11)//fm btn
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris5)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12)//mt btn
        btn12.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris6)
            startActivity(intent)
        }
        val btn14 = findViewById<Button>(R.id.button13)//ls btn
        btn14.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris8)
            startActivity(intent)
        }
    }
}
