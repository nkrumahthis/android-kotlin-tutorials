package com.example.currencyconverter.data.models

data class CurrencyResponse (
    val success : Boolean,
    val timestamp : Int,
    val base : String,
    val date : String,
    val rates : Rates
)