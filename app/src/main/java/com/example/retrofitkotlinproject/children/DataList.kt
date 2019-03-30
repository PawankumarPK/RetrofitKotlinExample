package com.example.retrofitkotlinproject.children

import com.google.gson.annotations.SerializedName

class DataList {

    @SerializedName("subreddit")
    var subreddit : String? = null

    @SerializedName("title")
    var title : String? = null

    @SerializedName("subreddit_type")
    var subreddit_type : String? = null

    override fun toString(): String {
        return "DataList(subreddit=$subreddit, title=$title, subreddit_type=$subreddit_type)"
    }


}