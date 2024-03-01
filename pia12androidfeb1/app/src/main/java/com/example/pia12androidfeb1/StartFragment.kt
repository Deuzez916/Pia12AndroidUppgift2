package com.example.pia12androidfeb1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class StartFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_start, container, false)



    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.StartText).text = "Hej Banan"

        view.findViewById<Button>(R.id.StartButton).setOnClickListener {
            view.findViewById<TextView>(R.id.StartText).text = "Hej Apelsin"
        }

        view.findViewById<Button>(R.id.StartGoButton).setOnClickListener {
            requireActivity().supportFragmentManager
                .beginTransaction()
                .add(R.id.fragcon, ReadmoreFragment())
                .addToBackStack(null)
                .commit()
        }
    }
}