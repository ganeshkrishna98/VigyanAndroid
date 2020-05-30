package com.ksu_cem.vigyan.ui.cs_lec_vid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Cs_lec_s5_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cs_lec_s5__main)
        supportActionBar?.hide()

        val tcuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1-iT8OzIWkYwIbRRNxGAg7PPWaZ7RX0r0?usp=sharing")//theo comp lnk
        val ssuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1zjedAbBkjGVB4DfP5OZkdW252YhF5EHB?usp=sharing")// sys sw lnk
        val mpuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1Req-H3mQViD3R7j47ip7QQztIrVDRM5W?usp=sharing")// micropro lnk
        val dcuri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1hRL54RLODAuGvNia77HNyJCcPhA_pphf?usp=sharing")//data comm lnk
        val gturi: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1fjTIENTxWhqOo6yqeCHYpQxnaAg3Knm-?usp=sharing")// graph theo lnk
        val eluri: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1xOJUN77nh6ZAW49yGBxupxk098mofSmQ?usp=sharing")//elective

        val btn8 = findViewById<Button>(R.id.button8) //theory of comp btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, tcuri )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9) //sys sw btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, ssuri)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10) // micro pro btn
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, mpuri)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11)// data comm btn
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, dcuri)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12)// graph tho btn
        btn12.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, gturi)
            startActivity(intent)
        }
        val btn13 = findViewById<Button>(R.id.button13)//elective
        btn13.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, eluri)
            startActivity(intent)
        }
    }
}
