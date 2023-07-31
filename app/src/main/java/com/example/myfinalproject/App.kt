package com.example.myfinalproject

import android.app.Application
import com.example.myfinalproject.di.dataModule
import com.example.myfinalproject.di.domainModule
import com.example.myfinalproject.di.networkModule
import com.example.myfinalproject.di.presentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(
                listOf(
                    dataModule,
                    domainModule,
                    presentationModule,
                    networkModule,
                    )
            )
        }
    }
}
