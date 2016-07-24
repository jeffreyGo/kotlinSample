package com.example.jeffrey.kotlinsample

import org.junit.Test

import org.junit.Assert.*
import java.util.*

/**
 * Created by jeffrey on 16. 7. 24..
 */
class ForecastTest {

    @Test
    fun testDataClassCopy() {
        val f1 = Forecast(Date(), 27.5f, "Shiny day")
        val f2 = f1.copy(temporature = 30f)

        assertEquals(f1.details, f2.details)

    }

    @Test
    fun testDataClassMapping() {
        val f1 = Forecast(Date(), 27.5f, "Shiny day")
        val (date, temporature, details) = f1

        assertEquals(date, f1.date)
        assertEquals(temporature, f1.temporature)
        assertEquals(details, f1.details)
    }


}