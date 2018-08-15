package com.nandohusni.kompasmvpkotlin.base

import android.view.View

/**
 * Created by nandoseptianhusni on 14/08/18.
 */
interface BasePresenter<T : BaseView> {



    //todo 7
    fun onAttachView(v : T)
    fun onDettachView()

}