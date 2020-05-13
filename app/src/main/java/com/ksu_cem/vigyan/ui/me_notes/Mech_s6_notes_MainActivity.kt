
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
            Uri.parse("https://drive.google.com/drive/u/2/folders/1eLndUz7u6BaSeGdPCl1A9c-DAc-QYq50")//hmt
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1PsWPT75zkzKKRYB5xtA5naKDwQSWPHMd")//dm
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1RKg_gvSgJsgaiL4nIYuKGmpP7jkFHq7L")//amt
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1R4MyGVF9rWIoGfeLWT4TtJAUKKzJEz3o")//mi
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1QoQgls6EAL9xds83vyTiHAqOFsb_rgDg")//cad
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1cAqwNyjYUTFDwDXwFN1CEmiq5K1xBZc-")//ele

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
