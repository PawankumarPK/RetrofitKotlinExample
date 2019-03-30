package com.example.retrofitkotlinproject

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    val base_url = "https://www.reddit.com/"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retrofit = Retrofit.Builder()
            .baseUrl(base_url)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val redditAPI = retrofit.create(RedditAPI::class.java)
        val call = redditAPI.data

        call.enqueue(object : Callback<Feed> {
            override fun onFailure(call: Call<Feed>?, t: Throwable?) {
                Toast.makeText(this@MainActivity, "Something went wrong", Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(call: Call<Feed>?, response: Response<Feed>?) {

                val childList = response!!.body().data!!.children
                for (i in childList!!.indices) {
                    mFirst.text = childList[i].data!!.subreddit
                    mSecond.text = childList[i].data!!.subreddit_type
                    mThird.text = childList[i].data!!.title
                }
            }

        })

    }
}
