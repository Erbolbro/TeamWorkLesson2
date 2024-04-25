package com.example.teamworklesson2.presentation.ui.activity

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.teamworklesson2.presentation.data.repository.Android15GroupRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class Android15GroupViewMode @Inject constructor(
    private val repository: Android15GroupRepository
) : ViewModel() {

    init {
        Log.e("log", "log")
        viewModelScope.launch {
            fetchAndroid().collect {
                Log.e("android15", it.toString())
            }
        }
    }

    fun fetchAndroid() = repository.fetchAndroid()

}