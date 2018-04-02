package com.example.misa.iwatch.data

import com.example.misa.iwatch.R

/**
 * Created by NAWAL on 28/03/2018.
 */
data class Movies(val titre: String, val info: String, val directeur: String, var image: Int)
{
    fun  getMovies():ArrayList<Movies> {
        val Films = ArrayList<Movies>()


        Films.add(Movies("Guardian of the galaxy", "Action Aventure ", "James  Gunn", R.drawable.guardians_galaxy))
        Films.add(Movies("Guardian of the galaxy", "Action Aventure ", "James  Gunn", R.drawable.guardians_galaxy))
        Films.add(Movies("Guardian of the galaxy", "Action Aventure ", "James  Gunn", R.drawable.guardians_galaxy))
        Films.add(Movies("Guardian of the galaxy", "Action Aventure ", "James  Gunn", R.drawable.guardians_galaxy))
        Films.add(Movies("Guardian of the galaxy", "Action Aventure ", "James  Gunn", R.drawable.guardians_galaxy))
        Films.add(Movies("Guardian of the galaxy", "Action Aventure ", "James  Gunn", R.drawable.guardians_galaxy))
        Films.add(Movies("Guardian of the galaxy", "Action Aventure ", "James  Gunn", R.drawable.guardians_galaxy))
        Films.add(Movies("Guardian of the galaxy", "Action Aventure ", "James  Gunn", R.drawable.guardians_galaxy))
        Films.add(Movies("Guardian of the galaxy", "Action Aventure ", "James  Gunn", R.drawable.guardians_galaxy))
        Films.add(Movies("Guardian of the galaxy", "Action Aventure ", "James  Gunn", R.drawable.guardians_galaxy))




        return Films
    }


}