package com.ksu_cem.vigyan.ui.ec_notes

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ksu_cem.vigyan.R

class Elec_comm_s6_notes_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elec_comm_s6_notes__main)
        supportActionBar?.hide()

        val uris1: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1KkZF6vDMOxP-cDwkSD8i98vxC7WtmLHn?usp=sharing")//dc
        val uris3: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1YoPLkidrEW4X0cn0ObNAGP6Zb5LSXIrc?usp=sharing")//vlsi
        val uris4: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1MaW3fU8nAvbV7DO8OVmjeHmX0F-5DbLZ?usp=sharing")//awp
        val uris5: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1yfCVumE9JkMyTdGtShhsRlu-fz9PggWK?usp=sharing")//es
        val uris6: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1A2Mb9FNXvLdCxJOnL-U_V3m-CqbGpIoK?usp=sharing")//oop
        val uris7: Uri =
            Uri.parse("https://drive.google.com/drive/folders/1RAE4GtyRcTGJ9ZJ1Peb6XCG-XuKpnBF7?usp=sharing")//ele

        val btn8 = findViewById<Button>(R.id.button8)   //dc btn
        btn8.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,uris1 )
            startActivity(intent)
        }
        val btn9 = findViewById<Button>(R.id.button9)   //vlsi btn
        btn9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris3)
            startActivity(intent)
        }
        val btn10 = findViewById<Button>(R.id.button10) //awp btn
        btn10.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris4)
            startActivity(intent)
        }
        val btn11 = findViewById<Button>(R.id.button11) //es btn
        btn11.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris5)
            startActivity(intent)
        }
        val btn12 = findViewById<Button>(R.id.button12) //oop btn
        btn12.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris6)
            startActivity(intent)
        }
        val btn13 = findViewById<Button>(R.id.button13) //ele btn
        btn13.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, uris7)
            startActivity(intent)
        }
    }
}
