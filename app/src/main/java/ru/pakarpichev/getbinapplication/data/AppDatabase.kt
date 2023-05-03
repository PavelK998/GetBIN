package ru.pakarpichev.getbinapplication.data

import androidx.room.Database
import androidx.room.RoomDatabase
import ru.pakarpichev.getbinapplication.domain.model.UserRequestModel
import ru.pakarpichev.getbinapplication.domain.repository.BinRepository



@Database(entities = [UserRequestModel::class], version = 1)
abstract class AppDatabase :RoomDatabase() {
    abstract fun BinDao(): BinRepository
}