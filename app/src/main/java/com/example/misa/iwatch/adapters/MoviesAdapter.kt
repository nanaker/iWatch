package com.example.misa.iwatch.adapters

/**
 * Created by NAWAL on 28/03/2018.
 */

import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import com.example.misa.iwatch.R
import com.example.misa.iwatch.activities.MainActivity
import com.example.misa.iwatch.activities.MovieDetailActivity
import com.example.misa.iwatch.data.Movies

class MoviesAdapter(val filmList: ArrayList<Movies>): RecyclerView.Adapter<MoviesAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.titre?.text = filmList[position].titre
        holder?.info?.text = filmList[position].info
        holder?.directeur?.text = filmList[position].directeur
        holder?.image?.setImageResource(filmList[position].image)



      /*  holder?.detai!!.setOnClickListener {
            val intent = Intent(MainActivity::getBaseContext, MovieDetailActivity::class.java)
            startActivity(intent)
        }*/
      /*  holder?.detai!!.setOnClickListener({


            /*val intent = Intent(getActivity(), next::class.java)

            intent.putExtra("keyIdentifier", "blabla")

            startActivity(intent)*/

            Log.e("ItemClicked", filmList[position].titre)
        })*/

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.movie_item, parent, false)

        return ViewHolder(v);
    }

    override fun getItemCount(): Int {
        return filmList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        val titre = itemView.findViewById<TextView>(R.id.title)
        val info = itemView.findViewById<TextView>(R.id.details)
        val directeur = itemView.findViewById<TextView>(R.id.directorName)
        val image = itemView.findViewById<ImageView>(R.id.picture)
       // val detai = itemView.findViewById<ImageButton>(R.id.btnMovieDetail)


    }
}