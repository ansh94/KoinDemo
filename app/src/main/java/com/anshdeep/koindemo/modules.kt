package com.anshdeep.koindemo

import com.anshdeep.koindemo.data.DataRepository
import com.anshdeep.koindemo.data.DataRepositoryFactory
import com.anshdeep.koindemo.data.LocalDataRepository
import com.anshdeep.koindemo.data.RemoteDataRepository
import com.anshdeep.koindemo.presentation.CurrenciesAdapter
import com.anshdeep.koindemo.presentation.CurrenciesViewModel
import com.google.gson.Gson
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

/**
 * Created by ansh on 15/01/19.
 */

val applicationModule = module {
    // Singleton Dependency
    // same instance will be used every time
    single { Gson() }
    single { UrlHelper(getProperty("currency_base_url")) }

    // Factory Dependency
    // new instance of the definition will be defined each time
    // factory { CurrenciesAdapter() }
    scope("browse") { CurrenciesAdapter() }

    // Interface Dependency
    factory<DataRepository>("local") { LocalDataRepository(get()) }
    factory<DataRepository>("remote") { RemoteDataRepository() }

    // Named dependency
    factory { DataRepositoryFactory(get("local"), get("remote")) }

    // Viewmodel dependency
    viewModel { (jsonString: String) -> CurrenciesViewModel(get(), jsonString) }
}