package com.nisaefendioglu.daggerhiltinandroidwithexample.repository

import com.nisaefendioglu.daggerhiltinandroidwithexample.model.Cryptocurrency

interface CryptocurrencyRepository {
    fun getCryptoCurrency(): List<Cryptocurrency>
}