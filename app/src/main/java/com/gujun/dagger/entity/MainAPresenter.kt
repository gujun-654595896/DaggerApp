package com.gujun.dagger.entity

import javax.inject.Inject

/**
 *    author : gujun
 *    date   : 2021/1/8 16:01
 *    desc   :
 */
class MainAPresenter {

    private var mAView: MainAContact.View? = null

    @Inject
    constructor(view: MainAContact.View) {
        mAView = view
    }

    fun loadData() {

    }
}