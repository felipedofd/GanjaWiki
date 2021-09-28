package com.example.ganjawiki

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ListViewMoldel : ViewModel() {
    val ganja = MutableLiveData<ListItems>()

}