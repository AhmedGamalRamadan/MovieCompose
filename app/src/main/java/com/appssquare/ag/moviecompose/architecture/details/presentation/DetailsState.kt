package com.appssquare.ag.moviecompose.architecture.details.presentation

import com.appssquare.ag.moviecompose.architecture.domain.model.Movie

data class DetailsState(
    val isLoading: Boolean = false,
    val movie: Movie? = null
)