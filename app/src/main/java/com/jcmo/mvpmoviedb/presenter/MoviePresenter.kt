package com.jcmo.mvpmoviedb.presenter

import com.jcmo.mvpmoviedb.model.Result

interface MoviePresenter {
    fun loadListMovies()
    fun showErrorLoadMovies(message: String?)

    fun sendListMovies(results: List<Result>?)
}