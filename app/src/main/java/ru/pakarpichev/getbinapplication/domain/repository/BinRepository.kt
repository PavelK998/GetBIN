package ru.pakarpichev.getbinapplication.domain.repository
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import ru.pakarpichev.getbinapplication.domain.model.UserRequestModel


@Dao
interface BinRepository {

    @Insert
    suspend fun insertData(request:UserRequestModel)

    @Query("SELECT * FROM requestItem")
    suspend fun gelAllData():List<UserRequestModel>

    @Delete
    suspend fun deleteData(request: UserRequestModel)

}