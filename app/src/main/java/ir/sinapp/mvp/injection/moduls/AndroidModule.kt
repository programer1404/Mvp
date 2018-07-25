package ir.sinapp.mvp.injection.moduls


import android.content.Context
import dagger.Module
import dagger.Provides
import ir.sinapp.mvp.App
import ir.sinapp.mvp.injection.preferences.AppPreferenceHelper
import ir.sinapp.mvp.injection.preferences.PreferenceHelper
import android.os.Handler
import javax.inject.Singleton


@Module
class AndroidModule {

    @Singleton
    @Provides
    fun provideContext(app: App): Context = app.applicationContext

    @Singleton
    @Provides
    fun resource(app: App) = app.resources!!

    @Provides
    @Singleton
    internal fun providePrefHelper(appPreferenceHelper: AppPreferenceHelper): PreferenceHelper = appPreferenceHelper

    @Provides
    fun getHandler() = Handler()
}
