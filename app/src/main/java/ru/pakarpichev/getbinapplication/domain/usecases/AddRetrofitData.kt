package ru.pakarpichev.getbinapplication.domain.usecases

import ru.pakarpichev.getbinapplication.domain.repository.RetrofitRepository
import javax.inject.Inject

class AddRetrofitData @Inject constructor(private val retrofitRepository: RetrofitRepository) {
    suspend operator fun invoke(userText: String) = retrofitRepository.getJsonRequest(userText = userText)
}