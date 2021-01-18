package com.yerdaulet.moviebrowser.repository

import androidx.lifecycle.LiveData
import com.yerdaulet.moviebrowser.api.MoviesApi
import com.yerdaulet.moviebrowser.api.responses.*
import com.yerdaulet.moviebrowser.models.MovieDetails
import com.yerdaulet.moviebrowser.util.NetworkBoundResourceNoCaching
import com.yerdaulet.moviebrowser.util.Resource

class MovieDetailRepository(
    private val movieApi: MoviesApi
) {

    fun getMovieDetail(movieId: Long): LiveData<Resource<MovieDetails>> {
        return object : NetworkBoundResourceNoCaching<MovieDetails, MovieDetailsResponse>() {
            override fun handleApiSuccessResponse(response: ApiSuccessResponse<MovieDetailsResponse>) {
                val detailsResponse= response.body
                val videos = detailsResponse.videoResponse?.videos
                val casts = detailsResponse.creditsResponse?.casts
                val reviews = detailsResponse.reviewResponse?.reviews
                result.value = Resource.Success(MovieDetails(videos,reviews,casts))
            }

            override fun handleApiEmptyResponse(response: ApiEmptyResponse<MovieDetailsResponse>) {
                //MovieDetails,has empty videos,casts,reviews
                result.value = Resource.Success(MovieDetails())
            }

            override fun handleApiErrorResponse(response: ApiErrorResponse<MovieDetailsResponse>) {
                result.value = Resource.Error(response.errorMessage,null)
            }

            override fun createCall(): LiveData<ApiResponse<MovieDetailsResponse>> =
                movieApi.getMovieDetail(movieId)

        }.asLiveData()
    }
}