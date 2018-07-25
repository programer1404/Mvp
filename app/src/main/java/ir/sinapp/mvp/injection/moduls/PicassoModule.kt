package ir.sinapp.mvp.injection.moduls

import android.content.Context
import com.squareup.picasso.OkHttp3Downloader
import com.squareup.picasso.Picasso
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import javax.inject.Singleton


@Module(includes = [ClientModule::class])
class PicassoModule {

    @Singleton
    @Provides
    fun getPicasso(context: Context, okHttp3Downloader: OkHttp3Downloader): Picasso = Picasso
            .Builder(context)
            .downloader(okHttp3Downloader)
            .build()

    @Singleton
    @Provides
    fun downloader(client: OkHttpClient): OkHttp3Downloader = OkHttp3Downloader(client)


}