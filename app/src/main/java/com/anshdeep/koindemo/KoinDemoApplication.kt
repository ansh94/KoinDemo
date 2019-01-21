package com.anshdeep.koindemo

import android.app.Application
import org.koin.android.ext.android.startKoin

/**
 * Created by ansh on 15/01/19.
 */
class KoinDemoApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin(this, listOf(applicationModule), loadPropertiesFromFile = true)
    }
}