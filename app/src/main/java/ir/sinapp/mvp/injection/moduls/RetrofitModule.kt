package ir.sinapp.mvp.injection.moduls

import dagger.Module
import dagger.Provides
import ir.sinapp.mvp.api.Api
import ir.sinapp.mvp.api.ServiceApi
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module(includes = [AppModule::class, ClientModule::class])
class RetrofitModule {

    @Singleton
    @Provides
    fun serviceApi(retrofit: Retrofit) = ServiceApi(retrofit.create(Api::class.java))

    @Singleton
    @Provides
    fun getRetrofit(client: OkHttpClient, URL: String) = Retrofit
            .Builder()
            .baseUrl(URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()!!

}