package ru.pakarpichev.getbinapplication.domain.repository

import kotlinx.coroutines.flow.Flow
import ru.pakarpichev.getbinapplication.domain.model.NetworkResult
import ru.pakarpichev.getbinapplication.domain.model.UserModel

interface AuthRepository {
    suspend fun signIn(user: UserModel): Flow<NetworkResult<Boolean>>

    suspend fun logIn(email: String, password: String): Flow<NetworkResult<Boolean>>
}