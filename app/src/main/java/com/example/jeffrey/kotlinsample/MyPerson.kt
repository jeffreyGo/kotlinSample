package com.example.jeffrey.kotlinsample

/**
 * Created by jeffrey on 2016. 7. 19..
 */
class MyPerson {
    var name : String = ""
        get() = field.toUpperCase()
        set(value) {
            field = "Name:$value"
        }

    var familyName : String = ""
        get() = field.toLowerCase()
        set(value) {
            field = "FamilyName:$value"
        }

}
