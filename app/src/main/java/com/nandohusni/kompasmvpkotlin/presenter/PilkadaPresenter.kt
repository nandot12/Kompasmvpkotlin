package com.nandohusni.kompasmvpkotlin.presenter

import com.nandohusni.kompasmvpkotlin.base.BasePresenter
import com.nandohusni.kompasmvpkotlin.model.ResponsePilkada
import com.nandohusni.kompasmvpkotlin.network.ConfigRetrofit
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class PilkadaPresenter : BasePresenter<PilkadaView>{

    //todo 8
    var pilkadaview : PilkadaView? = null


    //todo 9 get data from server
    fun ambilData(){
        ConfigRetrofit.service.getPilkada().enqueue(object  : Callback<ResponsePilkada>{
            override fun onFailure(call: Call<ResponsePilkada>?, t: Throwable?) {

                //todo 11
                pilkadaview?.onError(t?.message!!)

            }

            override fun onResponse(call: Call<ResponsePilkada>?, response: Response<ResponsePilkada>?) {

            //todo 12 check response
                if(response?.isSuccessful!!){

                    val body = response.body()?.data

                    //todo 13 masukin data state view
                    pilkadaview?.onSuccess(body)
                }


            }
        })

    }


    override fun onAttachView(v: PilkadaView) {
        pilkadaview = v
    }

    override fun onDettachView() {
        pilkadaview = null
    }


}