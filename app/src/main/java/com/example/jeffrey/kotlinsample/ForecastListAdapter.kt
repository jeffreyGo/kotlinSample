package com.example.jeffrey.kotlinsample

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by jeffrey on 2016. 7. 19..
 */

class ForecastListAdapter(var items: List<String>) : RecyclerView.Adapter<ForecastListAdapter.ViewHolder>(){

    override fun getItemCount(): Int  = items.size

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        if (holder == null) {
            return
        }

        holder.textview.text = items[position]
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder? {
        if (parent == null) {
            return null
        }
        return ViewHolder(TextView(parent.context))
    }

    class ViewHolder(var textview : TextView) : RecyclerView.ViewHolder(textview)
}