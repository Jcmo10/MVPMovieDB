package com.jcmo.mvpmoviedb.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.jcmo.mvpmoviedb.R
import com.jcmo.mvpmoviedb.presenter.MoviePresenter
import com.jcmo.mvpmoviedb.presenter.MoviePresenterImpl

class MoviesFragment : Fragment(),MovieView {

    private var moviePresenter: MoviePresenter? = null



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_movies, container, false)

        moviePresenter = MoviePresenterImpl(this)

        getMovies()

        return root
    }

    private fun getMovies() {
        moviePresenter?.loadListMovies()
    }
}