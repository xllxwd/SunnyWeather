package com.example.sunnyweather

import android.app.Application
import android.content.Context

/*******************************************************************
 * SunnyWeatherApplication.java  2020-06-11
 * <P>
 * class desc:<br/>
 * </p>
 * @author:Xiell
 ******************************************************************/
class SunnyWeatherApplication : Application() {

    companion object{
        const val TOKEN = "0trT1DiIOP96TV8L"
        lateinit var context : Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}