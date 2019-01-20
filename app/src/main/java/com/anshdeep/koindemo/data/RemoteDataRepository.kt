package com.anshdeep.koindemo.data

import com.anshdeep.koindemo.model.Currency

/**
 * Created by ansh on 20/01/19.
 */
class RemoteDataRepository() : DataRepository {

    override fun getCurrencies(jsonString: String): List<Currency> {
        return listOf()
    }
}