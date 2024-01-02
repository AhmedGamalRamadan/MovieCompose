package com.appssquare.ag.moviecompose.architecture.domain.repository


import com.appssquare.ag.moviecompose.architecture.domain.model.Movie
import com.appssquare.ag.moviecompose.architecture.util.Resource
import kotlinx.coroutines.flow.Flow

interface MovieListRepository {
    suspend fun getMovieList(
        forceFetchFromRemote: Boolean,
        category: String,
        page: Int
    ): Flow<Resource<List<Movie>>>

    suspend fun getMovie(id: Int): Flow<Resource<Movie>>
}