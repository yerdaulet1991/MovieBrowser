package com.yerdaulet.moviebrowser.api.responses.inner

import android.provider.MediaStore
import com.google.gson.annotations.SerializedName

class VideoResponse {
    @SerializedName("results")
    val videos: List<MediaStore.Video>? = null
}