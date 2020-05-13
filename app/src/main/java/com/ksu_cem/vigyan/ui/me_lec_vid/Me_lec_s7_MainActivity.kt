package com.ksu_cem.vigyan.ui.me_lec_vid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Me_lec_s7_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_me_lec_s7__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1WOkgzMiRdk2qF2fOedG9zSUfFSByLGZr")//dm1
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1TKtg2jgrpgFB6oR-SHTGR4R6kz1yw5xO")//aee
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1U_8AY3WJ-mjj-QLIRNjp05It_nB1Z43D")//rf
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1UqNNyJgfcqKwwNXmNoNu3hR2jwrLVGPA")//met
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1U100G64nrYM5l_KDy8Sb09Mpz4OE6Y2F")//cff
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1pyEO58aYb-0Gyo5K0-RFWe37EJrs1-aR")//ele

        val btn8 = findViewById<Button>(R.id.button8)//dm1 btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)//aee btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10)//rf btn
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris4)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11)//met btn
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris5)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12)//cff btn
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
