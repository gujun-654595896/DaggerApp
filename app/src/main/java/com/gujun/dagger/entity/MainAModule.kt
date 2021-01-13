package com.gujun.dagger.entity

import dagger.Module
import dagger.Provides


/**
 *    author : gujun
 *    date   : 2021/1/8 16:04
 *    desc   :
 */
@Module
class MainAModule constructor(val mAView: MainAContact.View) {

    @Provides
    fun provideMainAView(): MainAContact.View {
        return mAView
    }
}