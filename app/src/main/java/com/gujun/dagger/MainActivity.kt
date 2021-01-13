package com.gujun.dagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gujun.dagger.entity.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainAContact.View {
    @Inject
    lateinit var mainPresenter: MainPresenter

    @Inject
    lateinit var mainPresenter2: MainPresenter

    @Inject
    lateinit var mainAPresenter: MainAPresenter

    @Inject
    lateinit var mainAPresenter2: MainAPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        DaggerMainComponent.builder()
                .mainModule(MainModule())
                .mainAModule(MainAModule(this))
                .build()
                .inject(this)
    }


}