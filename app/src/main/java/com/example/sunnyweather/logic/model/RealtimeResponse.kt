package com.example.sunnyweather.logic.model

import com.google.gson.annotations.SerializedName

/*******************************************************************
 * RealtimeResponse.java  2020-06-13
 * <P>
 * class desc:<br/>
 * </p>
 * @author:Xiell
 ******************************************************************/
data class RealtimeResponse(val status: String, val result: Result) {

    data class Result(val realtime: RealTime)


    data class RealTime(
        val temperature: Float,
        val skycon: String, @SerializedName("air_quality") val airQuality: AirQuality
    )

    data class AirQuality(val aqi: AQI)

    data class AQI(val chn: Float)
}