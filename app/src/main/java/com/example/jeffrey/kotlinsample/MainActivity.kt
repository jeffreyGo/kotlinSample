package com.example.jeffrey.kotlinsample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.widget.Toast
import org.jetbrains.anko.custom.async
import org.jetbrains.anko.find
import org.jetbrains.anko.longToast
import org.jetbrains.anko.uiThread

class MainActivity : AppCompatActivity() {

    // val immutable  - read only
    // var mutable
    private val items = listOf(
            "Mon 6/23 - Sunny - 31/17",
            "Tue 6/24 - Foggy - 21/8",
            "Wed 6/25 - Cloudy - 22/17",
            "Thurs 6/26 - Rainy - 18/11",
            "Fri 6/27 - Foggy - 21/10",
            "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18",
            "Sun 6/23 - Sunny - 20/7"
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate")
        setContentView(R.layout.activity_main)

//        val forecastList = findViewById(R.id.forecast_list) as RecyclerView

        // with anko
        val forecastList : RecyclerView = find(R.id.forecast_list)
        forecastList.layoutManager = LinearLayoutManager(this)
        forecastList.adapter = ForecastListAdapter(items)

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
//        toast(this, "start", Toast.LENGTH_SHORT)
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
//        toast(this, "resume", Toast.LENGTH_SHORT)

        var myPerson = MyPerson()
        myPerson.name = "jeffrey"
        myPerson.familyName = "LEE"
        val name = myPerson.name;
        toast(this, name, Toast.LENGTH_SHORT)
        longToast(this, myPerson.familyName)


        async() {
            Request("http://www.naver.com").run()
            uiThread {
                longToast("Request performed")
            }

        }
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }

    companion object {
        val TAG = MainActivity::class.java.simpleName
    }

}
