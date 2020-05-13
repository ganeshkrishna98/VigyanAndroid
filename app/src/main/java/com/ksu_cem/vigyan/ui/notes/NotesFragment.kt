package com.ksu_cem.vigyan.ui.notes

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.ksu_cem.vigyan.*
import com.ksu_cem.vigyan.ui.dash_notes.Comp_sci_notes_MainActivity
import com.ksu_cem.vigyan.ui.dash_notes.Elec_comm_notes_MainActivity
import com.ksu_cem.vigyan.ui.dash_notes.Elec_ec_notes_MainActivity
import com.ksu_cem.vigyan.ui.dash_notes.Mech_notes_MainActivity

class NotesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_notes, container, false)

        val btn1 = v.findViewById<View>(R.id.button3) as Button
        btn1.setOnClickListener {

            val intent = Intent(activity, Comp_sci_notes_MainActivity::class.java)  //for cs module
            startActivity(intent)
        }

        val btn2 = v.findViewById<View>(R.id.button4) as Button
        btn2.setOnClickListener {

            val intent = Intent(activity, Elec_comm_notes_MainActivity::class.java) //for ec module
            startActivity(intent)
        }

        val btn3 = v.findViewById<View>(R.id.button5) as Button
        btn3.setOnClickListener {

            val intent = Intent(activity, Elec_ec_notes_MainActivity::class.java) //for ee module
            startActivity(intent)
        }

        val btn4 = v.findViewById<View>(R.id.button6) as Button
        btn4.setOnClickListener {

            val intent = Intent(activity, Mech_notes_MainActivity::class.java) //for me module
            startActivity(intent)
        }
        return v
    }
}
