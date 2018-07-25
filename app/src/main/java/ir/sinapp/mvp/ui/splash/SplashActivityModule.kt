package ir.sinapp.mvp.ui.splash

import ir.sinapp.mvp.ui.splash.interactor.SplashInteractor
import ir.sinapp.mvp.ui.splash.interactor.SplashMVPInteractor
import ir.sinapp.mvp.ui.splash.presenter.SplashPresenter
import dagger.Module
import dagger.Provides
import ir.sinapp.mvp.ui.splash.presenter.SplashMVPPresenter
import ir.sinapp.mvp.ui.splash.view.SplashMVPView


@Module
class SplashActivityModule {

    @Provides
    internal fun provideSplashInteractor(splashInteractor: SplashInteractor): SplashMVPInteractor = splashInteractor

    @Provides
    internal fun provideSplashPresenter(splashPresenter: SplashPresenter<SplashMVPView, SplashMVPInteractor>)
            : SplashMVPPresenter<SplashMVPView, SplashMVPInteractor> = splashPresenter

}