package com.jyotsna.fragmentjyotsna.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.jyotsna.fragmentjyotsna.CommsInterface
import com.jyotsna.fragmentjyotsna.R

class FragmentOne : Fragment() {

    private var listener: CommsInterface? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is CommsInterface) {
            listener = context
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_one, container, false)

        val editText: EditText = view.findViewById(R.id.edit_text_one)
        val button: Button = view.findViewById(R.id.send_button)

        button.setOnClickListener {
            val data = editText.text.toString()
            listener?.passData(data)
        }

        return view
    }
}
