package com.yerdaulet.moviebrowser.persistence

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.yerdaulet.moviebrowser.models.Movie
import com.yerdaulet.moviebrowser.persistence.dao.MovieAndDetailDao


@Database(
    entities = [Movie::class],
    version = 1,
    exportSchema = true
)
@TypeConverters(Converter::class)
abstract class MovieDB : RoomDatabase() {
    abstract val movieDao: MovieAndDetailDao


}