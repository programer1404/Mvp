@file:Suppress("UNCHECKED_CAST")

package ir.sinapp.mvp.api

import ir.sinapp.mvp.api.data.CacheData
import ir.sinapp.mvp.api.model.Feeds
import ir.sinapp.mvp.api.model.Profile
import retrofit2.Call
import retrofit2.Response
import javax.inject.Inject


class ManagementData @Inject constructor(val api: ServiceApi, val cacheData: CacheData) {

    fun getUser(paramMap: Map<String, String>, callback: Callback) {
        api.getMovieCall(paramMap).enqueue(object : retrofit2.Callback<Profile> {
            override fun onFailure(call: Call<Profile>?, t: Throwable?) {
                callback.onFailure(t)
            }

            override fun onResponse(call: Call<Profile>?, response: Response<Profile>?) {
                callback.onResponse(response?.body()?.feeds)
            }

        })
    }

    interface Callback {

        fun onFailure(t: Throwable?)

        fun onResponse(response: Feeds?)
    }


}
