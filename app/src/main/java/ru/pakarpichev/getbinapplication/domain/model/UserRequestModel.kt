package ru.pakarpichev.getbinapplication.domain.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

// Дата класс для данных, которые вводит пользователь

@Entity(tableName = "requestItem")
data class UserRequestModel (
    @PrimaryKey(autoGenerate = true)
    val id: Long= 0,
    @ColumnInfo(name = "request")
    val userRequest: String

        )
