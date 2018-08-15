package com.nandohusni.kompasmvpkotlin.presenter

import com.nandohusni.kompasmvpkotlin.base.BaseView
import com.nandohusni.kompasmvpkotlin.model.DataItem

/**
 * Created by nandoseptianhusni on 14/08/18.
 */
interface PilkadaView : BaseView {

    //todo 10
    fun onError(msg : String)

    fun onSuccess(data : List<DataItem?>?)
}