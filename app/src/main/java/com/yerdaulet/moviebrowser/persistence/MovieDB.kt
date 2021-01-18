package com.yerdaulet.moviebrowser.persistence

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters


@Database(
    entities = [Movie::class],
    version = 1,
    exportSchema = true
)
@TypeConverters(Converter::class)
abstract class MovieDB : RoomDatabase() {
    abstract val movieDao: MovieAndDetailDao


}