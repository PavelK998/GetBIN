package ru.pakarpichev.getbinapplication.domain.usecases

import ru.pakarpichev.getbinapplication.domain.model.UserRequestModel
import ru.pakarpichev.getbinapplication.domain.repository.BinRepository
import javax.inject.Inject

class DeleteDataUseCase @Inject constructor(private val binRepository: BinRepository) {
    suspend operator fun invoke(request: UserRequestModel) = binRepository.deleteData(request = request)
}