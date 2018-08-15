package com.nandohusni.kompasmvpkotlin.network

import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit



/**
 * Created by nandoseptianhusni on 14/08/18.
 */
object ConfigRetrofit {


    var retrofit = Retrofit.Builder()
            .baseUrl("http://apipilkada.kompas.id/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    var service = retrofit.create<Api>(Api::class.java!!)
}