package com.example.sunnyweather.logic.model

/*******************************************************************
 * Weather.java  2020-06-13
 * <P>
 * class desc:<br/>
 * </p>
 * @author:Xiell
 ******************************************************************/

data class Weather(val realtime: RealtimeResponse.RealTime, val daily: DailyResponse.Daily)