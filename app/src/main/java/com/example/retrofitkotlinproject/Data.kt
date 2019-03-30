package com.example.retrofitkotlinproject

import com.example.retrofitkotlinproject.children.Children
import com.google.gson.annotations.SerializedName

class Data {

    @SerializedName("dist")
    var dist : String ? = null

    @SerializedName("children")
    var children : ArrayList<Children>? = null

    override fun toString(): String {
        return "Data(dist=$dist, children=$children)"
    }


}