package com.example.jeffrey.kotlinsample

/**
 * Created by jeffrey on 2016. 7. 19..
 */
// data class auto generate all the fields and property accessors
data class Artist(
        var id : Long,
        var name : String,
        var url : String,
        var bid : String)