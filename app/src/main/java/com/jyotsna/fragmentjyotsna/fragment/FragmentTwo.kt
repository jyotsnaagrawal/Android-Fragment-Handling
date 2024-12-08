package com.jyotsna.fragmentjyotsna.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.jyotsna.fragmentjyotsna.R

class FragmentTwo : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_two, container, false)

        val textView: TextView = view.findViewById(R.id.text_view_two)
        arguments?.getString("key")?.let {
            textView.text = it
        }

        return view
    }
}
