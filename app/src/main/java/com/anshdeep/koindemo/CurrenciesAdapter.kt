package com.anshdeep.koindemo

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.anshdeep.koindemo.model.Currency

/**
 * Created by ansh on 16/01/19.
 */
class CurrenciesAdapter : RecyclerView.Adapter<CurrenciesAdapter.ViewHolder>() {

    val currencies: List<Currency> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_currency, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return currencies.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currency = currencies[position]
        holder.nameText.text = currency.name
        holder.symbolText.text = currency.symbol
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameText: TextView = view.findViewById(R.id.text_name)
        val symbolText: TextView = view.findViewById(R.id.text_symbol)
    }
}