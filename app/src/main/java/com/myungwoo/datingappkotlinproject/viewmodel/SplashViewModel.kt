package com.myungwoo.datingappkotlinproject.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashViewModel : ViewModel() {


    val navigateToMainEvent = MutableLiveData<Unit>()

    fun initiateSplashDelay() {
        CoroutineScope(Dispatchers.Main).launch {
            delay(3000)  // 3초 대기
            navigateToMainEvent.value = Unit
        }
    }


}