package com.gujun.dagger.injection.component

import android.app.Activity
import android.content.Context
import com.gujun.dagger.injection.module.ActivityModule
import com.gujun.dagger.injection.scop.ActivityScope
import dagger.Component

/**
 *    author : gujun
 *    date   : 2021/1/11 16:21
 *    desc   : Activity级别的组件依赖App级别的组件,作用域Scope一定和Module中的保持一致
 */
@ActivityScope
@Component(dependencies = [(AppComponent::class)], modules = [(ActivityModule::class)])
interface ActivityComponent {

    fun context(): Context
    fun activity(): Activity
}