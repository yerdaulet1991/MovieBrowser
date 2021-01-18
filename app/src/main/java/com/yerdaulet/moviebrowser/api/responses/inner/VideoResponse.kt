package com.yerdaulet.moviebrowser.api.responses.inner



import com.google.gson.annotations.SerializedName
import com.yerdaulet.moviebrowser.models.Video

class VideoResponse {
    @SerializedName("results")
    val videos: List<Video>? = null
}