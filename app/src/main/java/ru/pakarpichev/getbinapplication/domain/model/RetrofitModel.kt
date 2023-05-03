package ru.pakarpichev.getbinapplication.domain.model

// Дата класс для данных полученных в JSON формате с сервера

data class RetrofitModel(
        val number: Number,
        val scheme: String,
        val type: String,
        val brand: String,
        val prepaid: String,
        val country: Country,
        val bank: Bank
    )

    data class Number (
        val length: String,
        val luhn: String
    )

    data class Country(
        val name:String,
        val latitude:String,
        val longitude:String,

        )

    data class Bank (
        val name:String,
        val url:String,
        val phone:String,
        val city:String
    )
