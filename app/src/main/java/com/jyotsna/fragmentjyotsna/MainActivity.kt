package com.jyotsna.fragmentjyotsna

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jyotsna.fragmentjyotsna.fragment.FragmentOne
import com.jyotsna.fragmentjyotsna.fragment.FragmentTwo // Ensure this is imported

class MainActivity : AppCompatActivity(), CommsInterface {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Load FragmentOne initially
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, FragmentOne())
                .commit()
        }
    }

    override fun passData(data: String) {
        // Handle fragment communication
        val fragmentTwo = FragmentTwo()
        val bundle = Bundle()
        bundle.putString("key", data)
        fragmentTwo.arguments = bundle

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragmentTwo)
            .addToBackStack(null)
            .commit()
    }
}
