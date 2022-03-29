package com.joeroble.android.travelwishlist

import java.text.SimpleDateFormat
import java.util.*

class Place(val name: String, val reason: String? = null,  var starred: Boolean = false, val id: Int? = null) {
    //val dateAdded: Date? = Date(),
//    fun formattedDate(): String{
//        return SimpleDateFormat("EEE, d, MMM yyyy",Locale.getDefault()).format(dateAdded)
//    }
}