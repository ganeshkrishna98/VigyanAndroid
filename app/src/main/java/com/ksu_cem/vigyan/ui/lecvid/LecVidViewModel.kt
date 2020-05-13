package com.ksu_cem.vigyan.ui.lecvid


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LecVidViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Lecture Videos Module "
    }
    val text: LiveData<String> = _text

}