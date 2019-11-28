package com.example.daggerkotlin.component

import android.app.Activity
import android.app.Application
import android.content.Context
import com.example.daggerkotlin.modules.AppModule
import com.example.daggerkotlin.modules.FeatureModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class, FeatureModule::class))
interface AppComponent {
    fun getContext(): Context
    fun getApplicationContext(): Application
    fun inject(activity: Activity)
}