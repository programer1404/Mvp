package ir.sinapp.mvp.api

import ir.sinapp.mvp.api.model.Profile
import retrofit2.Call
import retrofit2.http.*

interface Api {

    @FormUrlEncoded
    @POST("generate")
    fun getProfile(@FieldMap paramMap: Map<String, String>): Call<Profile>


}