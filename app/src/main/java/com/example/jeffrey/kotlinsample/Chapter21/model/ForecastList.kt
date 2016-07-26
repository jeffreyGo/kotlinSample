package com.example.jeffrey.kotlinsample.Chapter21.model

/**
 * Created by jeffrey on 2016. 7. 25..
 */
data class ForecastList(val id: Long, val city: String, val country: String, val dailyForecast: List<Forecast>) {
    operator fun get(position: Int) = dailyForecast[position]
    fun size() = dailyForecast.size
}