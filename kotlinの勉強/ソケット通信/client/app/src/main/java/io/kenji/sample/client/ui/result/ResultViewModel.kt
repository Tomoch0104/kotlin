package io.kenji.sample.client.ui.result

import android.util.Log
import androidx.lifecycle.*
import io.kenji.sample.client.model.SocketClient

class ResultViewModel(ip: String, port: Int) : ViewModel() {

    val receivedMessageLiveData: MutableLiveData<String> = MutableLiveData()
    private val socketClient = SocketClient(ip, port)
    private val observer: Observer<String> = Observer {
        receivedMessageLiveData.postValue(it)
    }

    init {
        read()
        socketClient.receivedData.observeForever(observer)
    }

    override fun onCleared() {
        super.onCleared()
        socketClient.receivedData.removeObserver(observer)
        closeSocketClient()
    }

    private fun read() = viewModelScope.launch {
        runCatching {
            withContext(Dispatchers.IO) {
                socketClient.connent()
                socketClient.read()
            }
        }.onFailure {
            Log.e(TAG, it.toString())
        }
    }

    private fun closeSocketClient() {
        socketClient.close()
    }

    class Factory(private val ip: String, private val port: Int) :
            ViewModelProvider.NewInstanceFactory() {
                @Suppress("UNCHECKED_CAST")
                override fun <T : ViewModel?> create(modelClass: Class<T>): T {
                    return ResultViewModel(ip, port) as T
                }
            }

    companion object {
        const val TAG = "ResultViewModel"
    }
}