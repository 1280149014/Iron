package com.dahe.iron.ui

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import java.lang.ref.WeakReference

/**
 * author : charile yuan
 * date   : 20-12-23
 * desc   : 左右 activity 的基类
 */
open class BaseActivity : AppCompatActivity()  {

    /**
     * 判断当前界面是否在前台
     */
    protected var isActive:Boolean = false;

    /**
     * 当前activity 的实例
     */
    protected var activity: Activity? = null

    private var activityWR: WeakReference<Activity>? = null

    private val TAG: String = this.javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        Log.d(TAG, "onCreate: ")
    }
}