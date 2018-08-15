package com.nandohusni.kompasmvpkotlin.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nandohusni.kompasmvpkotlin.R
import com.nandohusni.kompasmvpkotlin.model.DataItem
import kotlinx.android.synthetic.main.item_recyclerview.view.*

/**
 * Created by nandoseptianhusni on 15/08/18.
 */
class PilkadaAdapter (var data: List<DataItem?>?) : RecyclerView.Adapter<PilkadaAdapter.MyView>(){
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyView {
        val vview = LayoutInflater.from(parent?.context).inflate(R.layout.item_recyclerview,parent,false)

        return MyView(vview)

    }

    override fun getItemCount(): Int {
        return data?.size!!
    }

    override fun onBindViewHolder(holder: MyView?, position: Int) {
        holder?.bind(data?.get(position))
    }

    class MyView(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        fun bind(get: DataItem?) {
            itemView.textTitle.text = get?.percenttps
        }

    }
}