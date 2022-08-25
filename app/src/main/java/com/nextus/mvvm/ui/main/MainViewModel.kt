package com.nextus.mvvm.ui.main

import androidx.lifecycle.MutableLiveData
import com.nextus.mvvm.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(): BaseViewModel() {
    val mutableLiveData: MutableLiveData<String> = MutableLiveData("")
}