package com.jcmo.mvpmoviedb.model

import com.jcmo.mvpmoviedb.presenter.MoviePresenter

class MovieInteractorImpl(var moviePresenter: MoviePresenter):MovieInteractor {


    private var movieRepository:MovieRepository = MovieRepositoryImpl(moviePresenter)

    override fun loadListMovie() {
        movieRepository.loadListMovies()

    }
}