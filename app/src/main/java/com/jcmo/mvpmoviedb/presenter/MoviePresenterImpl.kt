package com.jcmo.mvpmoviedb.presenter

import com.jcmo.mvpmoviedb.model.MovieInteractor
import com.jcmo.mvpmoviedb.model.MovieInteractorImpl
import com.jcmo.mvpmoviedb.model.Result
import com.jcmo.mvpmoviedb.view.MovieView

class MoviePresenterImpl(var movieView: MovieView): MoviePresenter {

    private var movieInteractor: MovieInteractor = MovieInteractorImpl(this)


    override fun loadListMovies() {
        movieInteractor.loadListMovie()
    }

    override fun showErrorLoadMovies(message: String?) {
        movieView.showErrorLoadMovies(message)
    }

    override fun sendListMovies(results: List<Result>?) {
        movieView.showListMovies(results)
    }

}