package com.anshdeep.koindemo.data

import com.anshdeep.koindemo.model.Currency
import com.google.gson.Gson

/**
 * Created by ansh on 15/01/19.
 */
class LocalDataRepository(private val gson: Gson) : DataRepository {

    override fun getCurrencies(jsonString: String): List<Currency> {
        return gson.fromJson(jsonString, Array<Currency>::class.java).toList()
    }
}