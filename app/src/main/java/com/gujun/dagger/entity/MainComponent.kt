package com.gujun.dagger.entity

import com.gujun.dagger.MainActivity
import com.gujun.dagger.injection.scop.ActivityScope
import dagger.Component

/**
 *    author : gujun
 *    date   : 2021/1/8 16:10
 *    desc   :
 */
@ActivityScope
@Component(modules = [(MainModule::class),(MainAModule::class)])
interface MainComponent {
    fun inject(activity: MainActivity);
}