package com.joeroble.android.travelwishlist

import java.text.SimpleDateFormat
import java.util.*

class Place(val name: String, val reason: String? = null, val dateAdded: Date = Date(), var starred: Boolean = false, val id: Int? = null) {
    fun formattedDate(): String{
        return SimpleDateFormat("EEE, d, MMM yyyy",Locale.getDefault()).format(dateAdded)
    }
}