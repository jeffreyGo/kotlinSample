package com.example.jeffrey.kotlinsample.extenstions

import android.content.Context
import kotlin.properties.ReadWriteProperty

/**
 * Created by jeffrey on 2016. 7. 26..
 */

object DelegatesExt {
    fun <T> notNullSingleValue(): ReadWriteProperty<Any?, T> = NotNullSingleValueVar()
    fun preference(context: Context, name: String, default: Long) = Preference(context, name, default)
}