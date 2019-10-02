package com.jcmo.mvpmoviedb.model

import com.jcmo.mvpmoviedb.presenter.MoviePresenter

class MovieRepositoryImpl(var moviePresenter: MoviePresenter):MovieRepository {


    override fun loadListMovies() {

    }


}