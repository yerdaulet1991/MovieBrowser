package com.yerdaulet.moviebrowser.api.responses.inner

import com.google.gson.annotations.SerializedName
import com.yerdaulet.moviebrowser.models.Cast

class CreditsResponse {
    @SerializedName("cast")
    val casts: List<Cast>? = null
}