package ru.pakarpichev.getbinapplication.presentation.screens.historyScreen

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import ru.pakarpichev.getbinapplication.domain.model.UserRequestModel
import ru.pakarpichev.getbinapplication.domain.usecases.DeleteDataUseCase
import ru.pakarpichev.getbinapplication.domain.usecases.GetAllDataUseCase
import javax.inject.Inject


@HiltViewModel
class HistoryViewModel @Inject constructor(
    private val getAllDataUseCase: GetAllDataUseCase,
    private val deleteDataUseCase: DeleteDataUseCase
) : ViewModel() {

    private var _request = MutableLiveData<List<UserRequestModel>>()
    val request: LiveData<List<UserRequestModel>>
        get() = _request

    init {
        getAllData()
    }

    fun getAllData() {
        viewModelScope.launch {
            getAllDataUseCase.invoke().let {
                _request.postValue(it)
            }
        }

    }

    // Удаляет один элемент из списка истории
    fun deleteData(request: UserRequestModel) {
        viewModelScope.launch {
            deleteDataUseCase.invoke(request = request)
            getAllData()
        }
    }

    // Удаляет все элементы из списка истории
    fun deleteAllData() {
        viewModelScope.launch {
            request.value?.forEach { item ->
                deleteDataUseCase.invoke(item)
            }
            getAllData()
        }

    }


}


