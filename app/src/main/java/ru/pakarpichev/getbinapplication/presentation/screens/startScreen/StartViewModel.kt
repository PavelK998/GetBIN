package ru.pakarpichev.getbinapplication.presentation.screens.startScreen

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import ru.pakarpichev.getbinapplication.domain.model.UserRequestModel
import ru.pakarpichev.getbinapplication.domain.usecases.InsertDataUseCase
import javax.inject.Inject

@HiltViewModel
class StartViewModel @Inject constructor(
    private val insertDataUseCase: InsertDataUseCase): ViewModel() {

        // Заносим данные в базу данных Room
        fun insertData(request: UserRequestModel){
        viewModelScope.launch {
            insertDataUseCase.invoke(request = request)
        }
    }
        // Проверяет есть ли подключение к интернету
      fun isOnline(context: Context): Boolean {
        val connectivityManager =
            context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        if (connectivityManager != null) {
            val capabilities =
                connectivityManager.getNetworkCapabilities(connectivityManager.activeNetwork)
            if (capabilities != null) {
                if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR)) {
                    Log.i("Internet", "NetworkCapabilities.TRANSPORT_CELLULAR")
                    return true
                } else if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI)) {
                    Log.i("Internet", "NetworkCapabilities.TRANSPORT_WIFI")
                    return true
                } else if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET)) {
                    Log.i("Internet", "NetworkCapabilities.TRANSPORT_ETHERNET")
                    return true
                }
            }
        }
        return false
    }



}