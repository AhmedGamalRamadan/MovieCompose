package com.appssquare.ag.moviecompose.di

import com.appssquare.ag.moviecompose.architecture.data.repository.MovieListRepositoryImpl
import com.appssquare.ag.moviecompose.architecture.domain.repository.MovieListRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindMovieListRepository(
        movieListRepositoryImpl: MovieListRepositoryImpl
    ): MovieListRepository

}