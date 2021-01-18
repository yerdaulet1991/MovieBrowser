package com.yerdaulet.moviebrowser.api.responses

import com.google.gson.annotations.SerializedName
import com.yerdaulet.moviebrowser.api.responses.inner.CreditsResponse
import com.yerdaulet.moviebrowser.api.responses.inner.ReviewsResponse
import com.yerdaulet.moviebrowser.api.responses.inner.VideoResponse

data class MovieDetailsResponse(
    @SerializedName("videos")
    val videoResponse: VideoResponse? = null,

    @SerializedName("reviews")
    val reviewResponse: ReviewsResponse? = null,

    @SerializedName("credits")
    val creditsResponse: CreditsResponse? = null
)
