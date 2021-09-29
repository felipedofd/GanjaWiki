package com.example.ganjawiki

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ganjawiki.data.RetrofitInitializer
import com.example.ganjawiki.data.StrainResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ListViewMoldel : ViewModel() {
    val ganja = MutableLiveData<StrainResponse>()
    private val ganjaApi = RetrofitInitializer.ganjaApi()

    fun getStrain() {

        val result = ganjaApi.getStrains(count = 1000, "-createdAt").enqueue(object : Callback<StrainResponse>{
            override fun onResponse(call: Call<StrainResponse>, response: Response<StrainResponse>) {
                ganja.postValue(response.body())
            }

            override fun onFailure(call: Call<StrainResponse>, t: Throwable) {
                print(t.toString())
            }

        })
        }

    }

