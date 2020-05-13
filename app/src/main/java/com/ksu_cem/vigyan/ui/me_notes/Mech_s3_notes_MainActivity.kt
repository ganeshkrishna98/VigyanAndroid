package com.ksu_cem.vigyan.ui.me_notes

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Mech_s3_notes_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mech_s3_notes__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1an72X5F0VAIwXr7rrqOTedfsuLz9kBzS")//laca
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1G8Lt_itqG-AV14xyQQwC4iUUn--6Qkjz")//mos
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1Gki6yjzbLe03r6gDt7C6Nxr3k59fGO-o")//mof
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1GZMrXPjAxP5LocmRf_8uzsgZJMyIz1H-")//tdm
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1GVunuop5gX_RWbg8LENIjFBflphar-Ex")//mam
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1acaL1xaIw2TUWJ08l5kZCqDTiG6frg-E")//be

        val btn8 = findViewById<Button>(R.id.button8)//laca btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)//mos btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10)//mof btn
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris4)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11)//tdm btn
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris5)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12)//mam btn
        btn12.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris6)
            startActivity(intent)
        }
        val btn13 = findViewById<Button>(R.id.button13)//be btn
        btn13.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris7)
            startActivity(intent)
        }
    }
}
