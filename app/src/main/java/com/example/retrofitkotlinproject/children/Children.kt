package com.example.retrofitkotlinproject.children

import com.google.gson.annotations.SerializedName

class Children {

    @SerializedName("kind")
    var kind : String? = null

    @SerializedName("data")
    var data : DataList?= null

    override fun toString(): String {
        return "Children(kind=$kind, data=$data)"
    }


}