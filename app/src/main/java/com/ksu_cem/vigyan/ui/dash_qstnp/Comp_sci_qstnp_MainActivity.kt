package com.ksu_cem.vigyan.ui.dash_qstnp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Comp_sci_qstnp_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comp_sci_qstnp__main)
        supportActionBar?.hide()

        val uris1: Uri = Uri.parse("https://drive.google.com/drive/u/2/folders/1Aw2etP6dluLi21OVLBZ7bTm7Ahhl9aMI")
        val uris3: Uri = Uri.parse("https://drive.google.com/drive/u/2/folders/1HCT-NXWZZ1jvzwDk1SHP6pdA9uLNrymM")
        val uris4: Uri = Uri.parse("https://drive.google.com/drive/u/2/folders/1jORS0Rk5OV6-Y0Sv1GsIlBX7ys_XBKs0")
        val uris5: Uri = Uri.parse("https://drive.google.com/drive/u/2/folders/1_YQ9qKtXjVPdOnjWaQNOeparkqzAgQRe")
        val uris6: Uri = Uri.parse("https://drive.google.com/drive/u/2/folders/1h3JMQyW4PXmBHjfaA1NzHhDJSikoXoMZ")
        val uris7: Uri = Uri.parse("https://drive.google.com/drive/u/2/folders/128BjU4J4AVJcdnuQ_K_3d5oaDzGn5K3G")
        val uris8: Uri = Uri.parse("https://drive.google.com/drive/u/2/folders/10wQaYIE0_8ffR7hInEENxbPNFauAiCJb")

        val btn8 = findViewById<Button>(R.id.button8)
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10)
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris4)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11)
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris5)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12)
        btn12.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris6)
            startActivity(intent)
        }
        val btn13 = findViewById<Button>(R.id.button13)
        btn13.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris7)
            startActivity(intent)
        }
        val btn14 = findViewById<Button>(R.id.button14)
        btn14.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris8)
            startActivity(intent)
        }
    }
}
