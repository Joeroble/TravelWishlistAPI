package com.joeroble.android.travelwishlist

import java.text.SimpleDateFormat
import java.util.*

data class Place(val name: String, val reason: String? = null, var starred: Boolean = false, val id: Int? = null) {

// This was part of the original app that would take in the long form of the date and change it into a normal date format
// This app does not support at the moment, but I did add error handling in case a null was passed, it would crash before
    // trying to change a null into a date.
//    val dateAdded: Date? = Date()
//    fun formattedDate(): String?{
//        if (dateAdded != null){
//            return SimpleDateFormat("EEE, d, MMM yyyy",Locale.getDefault()).format(dateAdded)
//        } else {
//            return dateAdded
//        }

    //}
}