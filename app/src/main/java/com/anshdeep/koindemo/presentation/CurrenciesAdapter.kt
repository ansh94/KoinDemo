package com.anshdeep.koindemo.presentation

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.anshdeep.koindemo.R
import com.anshdeep.koindemo.model.Currency

/**
 * Created by ansh on 16/01/19.
 */
class CurrenciesAdapter : RecyclerView.Adapter<CurrenciesAdapter.ViewHolder>() {

    var currencies: List<Currency> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_currency, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return currencies.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.currencyView.setCurrency(currencies[position])
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val currencyView: CurrencyView = view.findViewById(R.id.view_currency)
    }
}