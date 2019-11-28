package com.example.daggerkotlin.modules

import com.example.daggerkotlin.presenters.MyPresenter
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class FeatureModule(private var feature: String) {
    @Singleton
    @Provides
    fun providePresenter(): MyPresenter {
        return MyPresenter()
    }
}