package com.example.jeffrey.kotlinsample

import android.content.Context
import android.widget.TextView
import android.widget.Toast

/**
 * Created by jeffrey on 2016. 7. 19..
 */

fun add(x : Int, y : Int) : Int {
    return x + y
}

fun add2(x : Int, y : Int) : Int = x + y


fun toast(context : Context, message : String, length : Int = Toast.LENGTH_SHORT) {
    Toast.makeText(context, message, length).show()
}


// extention functions with anko
fun Context.longToast(context : Context, message : String) {
    Toast.makeText(context, message, Toast.LENGTH_LONG).show()
}

// 사용방법 추가 확인
public var TextView.text : CharSequence
    get() = getText()
    set(value) = setText(value)

