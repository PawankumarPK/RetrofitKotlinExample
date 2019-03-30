package com.example.retrofitkotlinproject


import retrofit2.Call
import retrofit2.http.GET

interface RedditAPI {

    companion object {
        val base_url = "https://www.reddit.com/"
    }


    @get: GET(".json")
    val data: Call<Feed>


}