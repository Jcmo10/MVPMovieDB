package com.jcmo.mvpmoviedb.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jcmo.mvpmoviedb.R
import com.jcmo.mvpmoviedb.model.Result


class MoviesAdapter(movieList: ArrayList<Result>) :RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder>(){

    private var movieList = ArrayList<Result>()

    init {
        this.movieList = movieList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.movie_list_item,parent,false)
        return MoviesViewHolder(itemView)
    }

    override fun getItemCount(): Int = movieList.size

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
       val movie = movieList[position]
        holder.setMovie(movie)
    }

    class MoviesViewHolder(itemView: View):RecyclerView.ViewHolder(itemView), View.OnClickListener {

        init {
            itemView.setOnClickListener(this)
        }

        fun setMovie(movie: Result){

        }

        override fun onClick(p0: View?) {

        }


    }

}