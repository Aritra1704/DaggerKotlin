package com.example.daggerkotlin.common

import android.app.Application
import com.example.daggerkotlin.component.AppComponent
import com.example.daggerkotlin.modules.AppModule
import dagger.internal.DaggerCollections

class AppInstance: Application() {

    companion object {
        lateinit var appComponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()

        buildDagger()
//        val appComponent = AppComponent by lazy {
//            DaggerAppCom
//        }

    }

    fun buildDagger() {
        val appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()
    }
}