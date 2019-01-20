package com.anshdeep.koindemo.presentation

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.anshdeep.koindemo.data.DataRepositoryFactory
import com.anshdeep.koindemo.model.Currency

/**
 * Created by ansh on 20/01/19.
 */
class CurrenciesViewModel constructor(
    private val dataRepositoryFactory: DataRepositoryFactory,
    private val jsonString: String) : ViewModel() {

    val currencyLiveData = MutableLiveData<List<Currency>>()

    fun observeCurrencies(): LiveData<List<Currency>> {
        return currencyLiveData
    }

    fun retreiveCurrencies() {
        val data = dataRepositoryFactory.retreiveLocalSource().getCurrencies(jsonString)
        currencyLiveData.postValue(data)
    }


}