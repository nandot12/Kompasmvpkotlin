package com.nandohusni.kompasmvpkotlin.model

import com.google.gson.annotations.SerializedName

data class ResponsePilkada(

	@field:SerializedName("data")
	val data: List<DataItem?>? = null
)