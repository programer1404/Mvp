package ir.sinapp.mvp.api

import ir.sinapp.mvp.api.model.Profile
import retrofit2.Call

class ServiceApi(private val api: Api) {

    fun getMovieCall(paramMap: Map<String, String>): Call<Profile> = api.getProfile(paramMap)

}
