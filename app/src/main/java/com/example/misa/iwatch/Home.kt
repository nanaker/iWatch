package com.example.misa.iwatch

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.Toast

/**
 * Created by misa on 3/27/18.
 */
class Home: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_home, container, false)

        val btnMovieDetails = rootView.findViewById<ImageButton>(R.id.btnMovieDetail)

        btnMovieDetails.setOnClickListener {
            Toast.makeText(context, "You clicked on TextView 'Click Me'.", Toast.LENGTH_SHORT).show()
        }

        return rootView

    }
}