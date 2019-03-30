package com.example.retrofitkotlinproject

import com.google.gson.annotations.SerializedName

class Feed {

    @SerializedName("kind")
    var kind : String? = null

    @SerializedName("data")
    var data : Data? = null

    override fun toString(): String {
        return "Feed(kind=$kind, data=$data)"
    }


}
