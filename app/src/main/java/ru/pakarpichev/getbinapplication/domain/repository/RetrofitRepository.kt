package ru.pakarpichev.getbinapplication.domain.repository

import retrofit2.http.GET
import retrofit2.http.Path
import ru.pakarpichev.getbinapplication.domain.model.RetrofitModel

interface RetrofitRepository {

        @GET("{userText}")
        suspend fun getJsonRequest(@Path("userText") userText:String): RetrofitModel
}