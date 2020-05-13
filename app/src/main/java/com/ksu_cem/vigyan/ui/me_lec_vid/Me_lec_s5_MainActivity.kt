package com.ksu_cem.vigyan.ui.me_lec_vid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Me_lec_s5_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_me_lec_s5__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1Ih6GYVMARpCnrFZ6lpAffMj65xmzhv2v")//mom
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1KJxWDkCTMXsUXOK1c042umMZClm5NO35")//mtdm
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1K5GM_Y2bMIVNM13JNyAgzF0hB-OT36xW")//cpnm
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1Joip44h00C75ce5QsnRdBePhwnqqX8uC")//edc
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1Jei0whpv8TSsHVgcvQHg2ROgKGgmkB00")//pm
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1aGwB_Kt0YKgeYOdWZA_cgdL-DbMYoGr5")//ele

        val btn8 = findViewById<Button>(R.id.button8)//mom btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)//mtdm btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10)//cpnm btn
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris4)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11)//edc btn
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris5)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12)//pm btn
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
