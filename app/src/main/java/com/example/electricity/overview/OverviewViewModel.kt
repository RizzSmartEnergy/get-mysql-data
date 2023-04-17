package com.example.electricity.overview

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Callback
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.electricity.R
import com.example.electricity.network.ElectricityApi
import com.example.electricity.network.ElectricityProperty
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Response

class OverviewViewModel : ViewModel() {
    private val _response = MutableLiveData<String>()
    val response : LiveData<String>
    get() = _response

    private val _properties = MutableLiveData<ElectricityProperty>()
    val properties : LiveData<ElectricityProperty>
    get() = _properties

    init {
        getElectricityValue()
    }

    fun getElectricityValue(){
        viewModelScope.launch {
            try {
                val listResult = ElectricityApi.retrofitService.getProperties()
                _response.value = "Hasil "
                if (listResult.size > 0) {
                    _properties.value = listResult[0]
                }

            }catch(e:Exception){
                _response.value = "Koneksi gagal karena ${e.message}"
            }
        }
    }


}