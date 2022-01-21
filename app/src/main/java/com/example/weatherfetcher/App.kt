package com.example.weatherfetcher

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import com.example.weatherfetcher.feature.weather_screen.di.weatherScreenModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@App)
            modules(weatherScreenModule)
        }

        // чтобы приложение использовало темную тему в зависимости от системы
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
    }
}