package com.example.jeffrey.kotlinsample.Chapter21.model

/**
 * Created by jeffrey on 2016. 7. 25..
 */
data class Forecast(val id: Long, val date: Long, val description: String, val high: Int, val low: Int,
                    val iconUrl: String)