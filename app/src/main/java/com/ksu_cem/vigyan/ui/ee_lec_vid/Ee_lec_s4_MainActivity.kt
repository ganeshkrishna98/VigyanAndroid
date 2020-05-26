package com.ksu_cem.vigyan.ui.ee_lec_vid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Ee_lec_s4_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ee_lec_s4__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1c8slJf6y-8jVk3in65mhCdycKeaOMJhI")   //prob
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1pTIanK_ZqDr66WMXb7K6Sx-rF2jhO319")   //sim
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1pqNbnEfUD9VuBS9daI3zqzr7YqUUDlv-")   //del
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1pjKQLXOyRpvKfr91o7ckYeZQkZPxU8Xm")   //ms
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1pXt4YKUsbpjpViLZ2od6X_5n1zcicE1G")   //mai
        val uris8: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1aY9aD4dKa8BpPfDz4TW2P_D8LwBdfs0w")   //ls

        val btn8 = findViewById<Button>(R.id.button8)   //prob btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)   //sim btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10) //del btn
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris4)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11) //ms btn
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris5)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12) //mai btn
        btn12.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris6)
            startActivity(intent)
        }
        val btn14 = findViewById<Button>(R.id.button13) //ls btn
        btn14.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris8)
            startActivity(intent)
        }
    }
}
