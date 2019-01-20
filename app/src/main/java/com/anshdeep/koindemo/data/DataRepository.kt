package com.anshdeep.koindemo.data

import com.anshdeep.koindemo.model.Currency

/**
 * Created by ansh on 20/01/19.
 */
interface DataRepository {

    fun getCurrencies(jsonString: String): List<Currency>
}