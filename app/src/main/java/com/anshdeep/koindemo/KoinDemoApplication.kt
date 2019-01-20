package com.anshdeep.koindemo

import android.app.Application
import org.koin.android.ext.android.startKoin
import timber.log.Timber

/**
 * Created by ansh on 15/01/19.
 */
class KoinDemoApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
        startKoin(this, listOf(applicationModule), loadPropertiesFromFile = true)
    }
}