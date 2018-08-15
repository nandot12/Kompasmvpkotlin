package com.nandohusni.kompasmvpkotlin.model

import com.google.gson.annotations.SerializedName

data class DataItem(

	@field:SerializedName("electionid")
	val electionid: Int? = null,

	@field:SerializedName("modifiedon")
	val modifiedon: String? = null,

	@field:SerializedName("election")
	val election: String? = null,

	@field:SerializedName("parentname")
	val parentname: Any? = null,

	@field:SerializedName("electiontype")
	val electiontype: String? = null,

	@field:SerializedName("year")
	val year: String? = null,

	@field:SerializedName("nid")
	val nid: Int? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("logo")
	val logo: String? = null,

	@field:SerializedName("lon")
	val lon: String? = null,

	@field:SerializedName("percenttps")
	val percenttps: String? = null,

	@field:SerializedName("lat")
	val lat: String? = null
)