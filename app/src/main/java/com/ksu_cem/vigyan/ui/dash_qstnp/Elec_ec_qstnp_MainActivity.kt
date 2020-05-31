package com.ksu_cem.vigyan.ui.dash_qstnp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Elec_ec_qstnp_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elec_ec_qstnp__main)
        supportActionBar?.hide()

        val uris1: Uri = Uri.parse("https://drive.google.com/drive/folders/1_LUEhQxk6d8INRWxaHi8C8a0KxEqmcZF?usp=sharing")
        val uris3: Uri = Uri.parse("https://drive.google.com/drive/folders/1Lfs_DvoEI7PUi5O1q-z3Yr58rlBWthQM?usp=sharing")
        val uris4: Uri = Uri.parse("https://drive.google.com/drive/folders/1OWbW4TtNQwkpTXXB677mb6WAebyWOqph?usp=sharing")
        val uris5: Uri = Uri.parse("https://drive.google.com/drive/folders/1wKVzL80wTPjVyRupkqvdGBn3cdZAWhSU?usp=sharing")
        val uris6: Uri = Uri.parse("https://drive.google.com/drive/folders/1r7IQFGG1FVJCWssEpfHoDw8eVHm0bSfp?usp=sharing")
        val uris7: Uri = Uri.parse("https://drive.google.com/drive/folders/1EZE9iA4wm6aHzLEmiUZ1GGamImfsin31?usp=sharing")
        val uris8: Uri = Uri.parse("https://drive.google.com/drive/folders/1o2lt5YvqARGY3T3o8r3BN2jfyHQ5BLLm?usp=sharing")

        val btn15 = findViewById<Button>(R.id.button15)
        btn15.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, uris1)
            startActivity(intent)
        }
        val btn16 = findViewById<Button>(R.id.button16)
        btn16.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn17 = findViewById<Button>(R.id.button17)
        btn17.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, uris4)
            startActivity(intent)
        }
        val btn18 = findViewById<Button>(R.id.button18)
        btn18.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, uris5)
            startActivity(intent)
        }
        val btn19 = findViewById<Button>(R.id.button19)
        btn19.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, uris6)
            startActivity(intent)
        }
        val btn20 = findViewById<Button>(R.id.button20)
        btn20.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, uris7)
            startActivity(intent)
        }
        val btn21 = findViewById<Button>(R.id.button21)
        btn21.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, uris8)
            startActivity(intent)
        }
    }
}
