package com.example.sunnyweather.logic.model

import com.google.gson.annotations.SerializedName

/*******************************************************************
 * DailyResponse.java  2020-06-13
 * <P>
 * class desc:<br/>
 * </p>
 * @author:Xiell
 ******************************************************************/
data class DailyResponse(val status: String, val result: Result) {


    data class Result(val daily: Daily)

    data class Daily(
        val temperature: List<Temperature>,
        val skycon: List<Skycon>, @SerializedName("life_index") val lifeIndex: LifeIndex
    )

    data class Temperature(val max: Float, val min: Float)

    data class Skycon(val value: String, val date: String)


    data class LifeIndex(
        val coldRisk: List<LifeDesc>,
        val carWashing: List<LifeDesc>,
        val ultraviolet: List<LifeDesc>,
        val dressing: List<LifeDesc>
    )

    data class LifeDesc(val desc: String)
}