package com.ksu_cem.vigyan.ui.cs_notes

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Comp_sci_s5_notes_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comp_sci_s5_notes__main)
        supportActionBar?.hide()

        val tcuri: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1d9kfYxJQaO7c-DnBiqdshLXSnDTb9pQP")//theo comp lnk
        val ssuri: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1d00YjTLyjeB5D822WJ3cuuvns9xesP76")// sys sw lnk
        val mpuri: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1cyES-bmGvngebKvDkfzPAu8vurJaYVJG")// micropro lnk
        val dcuri: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1ePd6GqOREyUSlZWtcrI6hJqsvi4QRGwE")//data comm lnk
        val gturi: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1eN4D7HqkerBSNajs94BQYrgO8jTuRbmr")// graph theo lnk
        val eluri: Uri =
            Uri.parse("https://drive.google.com/drive/u/2/folders/1ootdN4yRnRTuQTi1AjL_DfGXx112IoBc")//elective 1

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
        val btn13 = findViewById<Button>(R.id.button13)//elective 1
        btn13.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, eluri)
            startActivity(intent)
        }
    }
}
