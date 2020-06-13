package com.example.sunnyweather.logic.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/*******************************************************************
 * ServiceCreator.java  2020-06-11
 * <P>
 * class desc:<br/>
 * </p>
 * @author:Xiell
 ******************************************************************/
object ServiceCreator {
    private const val BASE_URL = "https://api.caiyunapp.com/"

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun <T> create(serviceCreator: Class<T>): T = retrofit.create(serviceCreator)

    inline fun <reified T> create(): T = create(T::class.java)


}