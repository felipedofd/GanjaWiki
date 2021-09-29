package com.example.ganjawiki

import android.app.Application
import com.example.ganjawiki.data.di.mainModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@MyApp)

            modules(mainModule)
        }
    }
}