package com.karim.libexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.karim.errorutil.ErrorDebug
import com.karim.logutil.LogDebug


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ErrorDebug.error("Error test")
        LogDebug.debug("Debug test")
    }


}