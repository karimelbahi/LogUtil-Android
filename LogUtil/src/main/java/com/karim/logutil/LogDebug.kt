package com.karim.logutil

import android.util.Log

class LogDebug {

    private val TAG: String = "SUPER_AWESOME_APP_LIB"
    fun debug(message: String) {
        Log.d(TAG, message)
    }
}