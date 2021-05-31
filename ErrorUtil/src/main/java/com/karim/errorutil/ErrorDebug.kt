package com.karim.errorutil

import android.util.Log

object  ErrorDebug {

    private val TAG: String = "SUPER_AWESOME_APP_LIB"

     fun error(message: String) {
        Log.e(TAG, message)
    }
}