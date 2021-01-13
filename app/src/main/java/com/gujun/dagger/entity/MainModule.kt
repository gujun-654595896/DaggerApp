package com.gujun.dagger.entity

import com.gujun.dagger.injection.scop.ActivityScope
import dagger.Module
import dagger.Provides


/**
 *    author : gujun
 *    date   : 2021/1/8 16:04
 *    desc   :
 */
@Module
class MainModule  {

    @ActivityScope
    @Provides
    fun provideMainView(): MainPresenter {
        return MainPresenter()
    }
}