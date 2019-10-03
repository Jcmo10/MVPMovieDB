package com.jcmo.mvpmoviedb.model

import com.jcmo.mvpmoviedb.presenter.MoviePresenter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MovieRepositoryImpl(var moviePresenter: MoviePresenter):MovieRepository {


    override fun loadListMovies() {
        val api_key = "0585c40feaf08e75b01ee51d4baccce3"

        ApiService.create()
            .getTopRated(api_key)
            .enqueue(object : Callback<Movies>{
                override fun onFailure(call: Call<Movies>, t: Throwable) {
                    moviePresenter.showErrorLoadMovies(t.message)
                }

                override fun onResponse(call: Call<Movies>, response: Response<Movies>) {
                    if(response.isSuccessful){
                        moviePresenter.sendListMovies(response.body()?.results)
                    }
                }

            })
    }


}