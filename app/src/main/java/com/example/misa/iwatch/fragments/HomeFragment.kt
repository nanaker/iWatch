package com.example.misa.iwatch.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.Toast
import com.example.misa.iwatch.R
import android.app.Activity
import android.content.Intent
import android.widget.Button
import com.example.misa.iwatch.activities.MovieDetailActivity


/**
 * Created by misa on 3/27/18.
 */
class HomeFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_home, container, false)
        val context = rootView.getContext()
        val btnMovieDetails: ImageButton = rootView.findViewById(R.id.btnMovieDetail)

        btnMovieDetails.setOnClickListener {
            val intent = Intent(context, MovieDetailActivity::class.java)
            startActivity(intent)
        }

        return rootView

    }
}