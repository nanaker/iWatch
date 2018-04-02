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
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Button
import android.widget.LinearLayout
import com.example.misa.iwatch.activities.MovieDetailActivity
import com.example.misa.iwatch.adapters.MoviesAdapter
import com.example.misa.iwatch.data.Movies
import com.example.misa.iwatch.data.getMoviesRecent
import com.example.misa.iwatch.data.getSeriesRecent


/**
 * Created by misa on 3/27/18.
 */
class HomeFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_home, container, false)
        val context = rootView.getContext()

        val rv = rootView.findViewById<RecyclerView>(R.id.recycleViewHome)
        val btnMovies=rootView.findViewById<Button>(R.id.btnmovies)
        val btnseries=rootView.findViewById<Button>(R.id.btnseries)
        btnMovies.setOnClickListener {
            remplirMovies(rv)
        }
        btnseries.setOnClickListener {
            remplirSeries(rv)
        }
        remplirMovies(rv)// par defaut



        return rootView

    }
    fun remplirMovies(rv:RecyclerView){
        rv.layoutManager = LinearLayoutManager(context, LinearLayout.VERTICAL, false)

        val Films= getMoviesRecent()

        var adapter = MoviesAdapter(Films)
        rv.adapter = adapter


    }
    fun remplirSeries(rv:RecyclerView){
        rv.layoutManager = LinearLayoutManager(context, LinearLayout.VERTICAL, false)

        val Series= getSeriesRecent()
        var adapter = MoviesAdapter(Series)
        rv.adapter = adapter


    }
}