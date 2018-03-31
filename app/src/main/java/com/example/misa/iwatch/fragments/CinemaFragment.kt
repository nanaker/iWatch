package com.example.misa.iwatch.fragments

/**
 * Created by misa on 3/27/18.
 */

import android.support.v4.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.misa.iwatch.R

class CinemaFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_cinema, container, false)
        return rootView
    }
}