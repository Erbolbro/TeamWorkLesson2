package com.example.teamworklesson2.presentation.data.repository

import com.example.teamworklesson2.presentation.data.remote.apiservice.Android15ApiService
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class Android15GroupRepository @Inject constructor(

    private val android15Group : Android15ApiService
) {

    fun fetchAndroid15() = flow {
        emit(android15Group.getAndroid15group())
    }
}