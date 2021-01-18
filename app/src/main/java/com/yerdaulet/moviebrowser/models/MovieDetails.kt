package com.yerdaulet.moviebrowser.models

data class MovieDetails(
    val trailers: List<Video>? = null,
    val reviews: List<Review>? = null,
    val casts: List<Cast>? = null
)
