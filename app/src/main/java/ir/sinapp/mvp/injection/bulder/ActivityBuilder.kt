package ir.sinapp.mvp.injection.bulder

import dagger.Module
import dagger.android.ContributesAndroidInjector
import ir.sinapp.mvp.ui.main.MainActivityModule
import ir.sinapp.mvp.ui.main.view.MainActivity
import ir.sinapp.mvp.ui.splash.SplashActivityModule
import ir.sinapp.mvp.ui.splash.view.SplashActivity

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [(SplashActivityModule::class)])
    abstract fun bindSplashActivity(): SplashActivity

    @ContributesAndroidInjector(modules = [(MainActivityModule::class)])
    abstract fun bindMainActivity(): MainActivity


}