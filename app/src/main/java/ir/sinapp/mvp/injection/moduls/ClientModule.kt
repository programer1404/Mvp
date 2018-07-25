package ir.sinapp.mvp.injection.moduls
import android.content.Context
import dagger.Module
import dagger.Provides
import okhttp3.Cache
import okhttp3.OkHttpClient
import java.io.File
import javax.inject.Singleton

@Module
class ClientModule {

    @Singleton
    @Provides
    fun getClient(cache: Cache): OkHttpClient = OkHttpClient
            .Builder()
            .cache(cache)
            .build()

    @Singleton
    @Provides
    fun getCache(file: File, maxCacheSize:Int): Cache = Cache(file, maxCacheSize.toLong())


    @Provides
    fun getFile(context: Context) = File(context.cacheDir, "OkHttpClient")

}