package com.jcmo.mvpmoviedb.view

import com.jcmo.mvpmoviedb.model.Result

interface MovieView {
    fun showErrorLoadMovies(message: String?)

    fun showListMovies(results: List<Result>?)
}