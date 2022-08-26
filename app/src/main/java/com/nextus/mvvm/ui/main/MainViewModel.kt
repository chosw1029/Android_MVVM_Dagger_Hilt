package com.nextus.mvvm.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.nextus.mvvm.ui.base.BaseViewModel
import com.nextus.shared.domain.search.ImageSearchUseCase
import com.nextus.shared.result.NetworkResult
import com.nextus.shared.result.data
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val imageSearchUseCase: ImageSearchUseCase
): BaseViewModel() {
    val mutableLiveData: MutableLiveData<String> = MutableLiveData("")

    fun test() {
        viewModelScope.launch {
            imageSearchUseCase(Unit).collect { result ->
                when(result) {
                    is NetworkResult.Success -> {
                        Timber.e(result.data.toString())
                    }
                    is NetworkResult.Error -> Timber.e(result.exception)
                    else -> {}
                }
            }
        }
    }
}