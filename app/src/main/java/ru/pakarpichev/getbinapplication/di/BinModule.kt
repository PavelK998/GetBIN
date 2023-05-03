package ru.pakarpichev.getbinapplication.di

import android.content.Context
import androidx.room.Room
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import ru.pakarpichev.getbinapplication.data.AppDatabase
import ru.pakarpichev.getbinapplication.data.firebase.AuthRepositoryImpl
import ru.pakarpichev.getbinapplication.domain.repository.AuthRepository

import ru.pakarpichev.getbinapplication.domain.repository.BinRepository
import ru.pakarpichev.getbinapplication.domain.repository.RetrofitRepository
import ru.pakarpichev.getbinapplication.domain.usecases.AuthUseCase
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class BinModule {

    @Provides
    fun provideAppDb(@ApplicationContext appcontext: Context): AppDatabase{

        return Room.databaseBuilder(
            appcontext,
            AppDatabase::class.java,
            "bin.db"
        ).build()

    }
    @Provides
    fun providesBinDao(appDatabase: AppDatabase):BinRepository {
        return appDatabase.BinDao()
    }




    @Provides
    fun provideRetrofit():RetrofitRepository =
        Retrofit.Builder()
            .baseUrl("https://lookup.binlist.net")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(RetrofitRepository::class.java)



}