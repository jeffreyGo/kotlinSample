package com.example.jeffrey.kotlinsample.Chapter21.datasource

import com.example.jeffrey.kotlinsample.Chapter21.model.ForecastList

/**
 * Created by jeffrey on 2016. 7. 25..
 */
interface ForecastDataSource {

    fun requestForecastByZipCode(zipCode: Long, date: Long): ForecastList?

}