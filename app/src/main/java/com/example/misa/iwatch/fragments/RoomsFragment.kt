package com.example.misa.iwatch.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.misa.iwatch.R

/**
 * Created by misa on 3/29/18.
 */
class RoomsFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_rooms, container, false)
        return rootView
    }
}