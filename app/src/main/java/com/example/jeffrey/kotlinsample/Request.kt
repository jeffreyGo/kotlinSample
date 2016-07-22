package com.example.jeffrey.kotlinsample

import android.util.Log
import java.net.URL

/**
 * Created by jeffrey on 2016. 7. 19..
 */

class Request(val url : String) {

    fun run() {
        val forecastJsonStr = URL(url).readText()
        Log.d(javaClass.simpleName, forecastJsonStr)
    }
}