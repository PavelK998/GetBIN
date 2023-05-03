package ru.pakarpichev.getbinapplication.domain.usecases

import ru.pakarpichev.getbinapplication.domain.model.UserModel
import ru.pakarpichev.getbinapplication.domain.repository.AuthRepository
import javax.inject.Inject

class AuthUseCase @Inject constructor(
    private val repository: AuthRepository
) {

    suspend fun registerNewUser(userModel: UserModel){
        repository.signIn(user = userModel)
    }
    suspend fun logIn(email: String, password: String){
        repository.logIn(email, password)
    }
}