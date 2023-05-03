package ru.pakarpichev.getbinapplication.presentation.screens.resultScreen

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.core.content.ContextCompat.startActivity

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import retrofit2.HttpException
import ru.pakarpichev.getbinapplication.domain.model.RetrofitModel
import ru.pakarpichev.getbinapplication.domain.usecases.AddRetrofitData
import javax.inject.Inject

@HiltViewModel
class ResultViewModel @Inject constructor(
    private val addRetrofitData: AddRetrofitData,
) : ViewModel() {
    private val _data = MutableLiveData<RetrofitModel>()
    val data: LiveData<RetrofitModel>
        get() = _data

    // Переменная добавлена для получения результата выполнения блока try catch
    var tryCatchResult = mutableStateOf("")


    fun getData(userText: String) {
        viewModelScope.launch {

            try {
                addRetrofitData.invoke(userText = userText).let {
                    _data.postValue(it)
                    tryCatchResult.value = "0"
                    Log.d("Mylog", "try: ${data.value}, tryCatchResult: $tryCatchResult")

                }
            } catch (e: HttpException) {
                tryCatchResult.value = "1"
                Log.d("Mylog", "catch: ${data.value}, tryCatchResult: $tryCatchResult")
            }


        }

    }

    // Передаем телефонный номер, в результате получим окно набора номера
    fun phoneCall(context: Context, phone: String) {
        val intent = Intent(Intent.ACTION_DIAL)
        intent.data = Uri.parse("tel:" + phone)
        startActivity(context, intent, null)


    }
    // Передаем URL, в результате будет осуществлен переход по заданному URL
    fun urlView(context: Context, url: String) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("https://$url")
        startActivity(context, intent, null)




    }

    // Открываем приложение навигации
    fun mapsView(context: Context, latitude: String, longtitude: String) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("geo:" + "$latitude, $longtitude")
        startActivity(context, intent, null)
    }
}



