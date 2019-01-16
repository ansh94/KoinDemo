package com.anshdeep.koindemo

import com.google.gson.Gson
import org.koin.dsl.module.module

/**
 * Created by ansh on 15/01/19.
 */

val applicationModule = module {
    // Singleton Dependency
    // same instance will be used every time
    single { Gson() }

    // Factory Dependency
    // new instance of the definition will be defined each time
    factory { CurrenciesAdapter() }
}