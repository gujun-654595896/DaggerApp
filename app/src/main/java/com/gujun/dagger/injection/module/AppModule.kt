package com.gujun.dagger.injection.module

import android.content.Context
import com.gujun.dagger.app.BaseApplication
import com.gujun.dagger.injection.scop.AppScope
import dagger.Module
import dagger.Provides

/**
 *    author : gujun
 *    date   : 2021/1/11 16:31
 *    desc   : 此处的作用域一定要和Component中对应
 */
@Module
class AppModule(private val context: BaseApplication) {

    @AppScope
    @Provides
    fun provideContext(): Context {
        return this.context
    }

}