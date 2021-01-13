package com.gujun.dagger.app

import android.app.Application
import com.gujun.dagger.injection.component.DaggerAppComponent
import com.gujun.dagger.injection.module.AppModule

/**
 *    author : gujun
 *    date   : 2021/1/11 11:41
 *    desc   :
 */
open class BaseApplication : Application() {

    lateinit var appComponent: DaggerAppComponent

    override fun onCreate() {
        super.onCreate()
        initInjection()
    }

    private fun initInjection() {
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build() as DaggerAppComponent
    }
}