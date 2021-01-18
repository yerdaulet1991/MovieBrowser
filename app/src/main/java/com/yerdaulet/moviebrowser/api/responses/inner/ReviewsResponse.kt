package com.yerdaulet.moviebrowser.api.responses.inner

import com.google.gson.annotations.SerializedName
import com.yerdaulet.moviebrowser.models.Review

class ReviewsResponse {
    @SerializedName("results")
    val reviews: List<Review>? = null
}