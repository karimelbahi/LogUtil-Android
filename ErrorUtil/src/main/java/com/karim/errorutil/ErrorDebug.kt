package com.karim.errorutil

import android.util.Log

object  ErrorDebug {

    private val TAG: String = "SUPER_AWESOME_APP_LIB"

    public fun errorr(message: String) {
        Log.e(TAG, message)
    }
}