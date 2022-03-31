package com.joeroble.android.travelwishlist

// status of request - success - server error, network error
// data, if there is any
// message for user, if needed

enum class ApiStatus {
    SUCCESS,
    SERVER_ERROR,
    NETWORK_ERROR
}

data class ApiResult<out T> (val status: ApiStatus, val data: T?, val message: String?)
