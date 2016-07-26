package com.example.jeffrey.kotlinsample.UI

import android.app.Application
import com.example.jeffrey.kotlinsample.extenstions.DelegatesExt

/**
 * Created by jeffrey on 2016. 7. 26..
 */
class App : Application() {

    companion object {
        var instance: App by DelegatesExt.notNullSingleValue()
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}