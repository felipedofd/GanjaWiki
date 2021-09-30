package com.example.ganjawiki

import android.app.Application
import com.example.ganjawiki.data.di.apiModule
import com.example.ganjawiki.data.di.mainModule
import com.example.ganjawiki.data.di.retrofitModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@MyApp)
            modules(listOf(mainModule, apiModule, retrofitModule))

            modules(mainModule)
        }
    }
}