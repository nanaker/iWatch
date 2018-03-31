package com.example.misa.iwatch.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.misa.iwatch.R
import com.example.misa.iwatch.adapters.MovieSectionsPageAdapter
import com.example.misa.iwatch.fragments.CommentsFragment
import com.example.misa.iwatch.fragments.DetailsFragment
import com.example.misa.iwatch.fragments.RoomsFragment
import kotlinx.android.synthetic.main.activity_movie_detail.*


class MovieDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)


        val pageAdapter = MovieSectionsPageAdapter(supportFragmentManager)

        pageAdapter.addFragment(DetailsFragment(), "DETAILS")
        pageAdapter.addFragment(RoomsFragment(), "ROOMS")
        pageAdapter.addFragment(CommentsFragment(), "COMMENTS")


        movieContainer.adapter = pageAdapter
        Movietabs.setupWithViewPager(movieContainer)

    }



}
