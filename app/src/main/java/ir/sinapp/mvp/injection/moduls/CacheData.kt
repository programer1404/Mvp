package ir.sinapp.mvp.injection.moduls

import dagger.Module
import dagger.Provides
import ir.sinapp.mvp.api.data.CacheData
import javax.inject.Singleton

@Module
class CacheDataModule {

    @Singleton
    @Provides
    fun getCacheData(maxCacheSize: Int) = CacheData(maxCacheSize)

}