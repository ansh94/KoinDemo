package com.anshdeep.koindemo

import com.google.gson.Gson
import org.koin.dsl.module.module

/**
 * Created by ansh on 15/01/19.
 */

val applicationModule = module {
    // Singleton Dependency
    single { Gson() }
}