package ir.sinapp.mvp.injection.moduls

import dagger.Module
import dagger.Provides
import ir.sinapp.mvp.common.Config
import ir.sinapp.mvp.injection.preferences.PreferenceInfo
import javax.inject.Singleton

@Module
class AppModule {

    @Singleton
    @Provides
    fun url() = Config.URL

    @Singleton
    @Provides
    fun maxSize() = Config.maxSize

    @Provides
    @PreferenceInfo
    internal fun provideprefFileName(): String = Config.PREF_NAME


}