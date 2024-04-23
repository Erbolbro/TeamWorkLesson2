package com.example.teamworklesson2.presentation.di

import com.example.teamworklesson2.presentation.data.remote.apiservice.Android15ApiService
import com.example.teamworklesson2.presentation.data.remote.interceptor.KeyInterceptor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

private const val BASE_URL = "https://rapidapi.com/erzanrenako312/api/"

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient = OkHttpClient().newBuilder()
        .addInterceptor(KeyInterceptor("fc77e974d6msh784b7e904a8c866p1b1141jsncb8c14deddb4"))
        .connectTimeout(60L, TimeUnit.SECONDS).readTimeout(60L, TimeUnit.SECONDS)
        .writeTimeout(60L, TimeUnit.SECONDS).callTimeout(60L, TimeUnit.SECONDS).build()

    @Provides
    @Singleton
    fun retrofitClient(okHttpClient: OkHttpClient): Retrofit =
        Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient).build()

    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit): Android15ApiService {
        return retrofit.create(Android15ApiService::class.java)
    }
}