package com.dahe.iron

import android.app.Application
import android.content.Context
import android.content.res.Configuration
import android.util.Log

/**
 * author : charile yuan
 * date   : 20-12-22
 * desc   :
 */
class App : Application() {

    var TAG : String = "App"

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG,"onCreate")
        appContext = this
    }

    override fun onLowMemory() {
        super.onLowMemory()
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
    }

    override fun onTrimMemory(level: Int) {
        super.onTrimMemory(level)
    }

    companion object{
        lateinit var appContext : Context
    }

}