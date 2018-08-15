package com.nandohusni.kompasmvpkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.nandohusni.kompasmvpkotlin.adapter.PilkadaAdapter
import com.nandohusni.kompasmvpkotlin.model.DataItem
import com.nandohusni.kompasmvpkotlin.presenter.PilkadaPresenter
import com.nandohusni.kompasmvpkotlin.presenter.PilkadaView
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

//todo 12 -> implementasi pilkadaview
class MainActivity : AppCompatActivity(),PilkadaView {



    //todo 13
    var presenter : PilkadaPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        presenter = PilkadaPresenter()

        onAttach()
    }

    override fun onStart() {
        super.onStart()
       // onAttach()
    }


    override fun onAttach() {
        presenter?.onAttachView(this)
        presenter?.ambilData()
    }

    override fun onDettach() {
        presenter?.onDettachView()
    }

    override fun onDestroy() {
        super.onDestroy()
        onDettach()
    }

    override fun onError(msg: String) {
        toast(msg)
    }

    override fun onSuccess(data: List<DataItem?>?) {

        recyclerview.adapter = PilkadaAdapter(data)
        recyclerview.layoutManager = LinearLayoutManager(this)
    }
}
