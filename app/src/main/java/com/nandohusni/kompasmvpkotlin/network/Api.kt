package com.nandohusni.kompasmvpkotlin.network

import com.nandohusni.kompasmvpkotlin.model.ResponsePilkada
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by nandoseptianhusni on 14/08/18.
 */
interface Api {

    //todo 5
     @GET("search?key=anykey&p=1&sort=modifiedon:desc")

    fun getPilkada() : Call<ResponsePilkada>

}