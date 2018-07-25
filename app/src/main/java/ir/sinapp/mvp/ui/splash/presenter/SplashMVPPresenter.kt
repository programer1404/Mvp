package ir.sinapp.mvp.ui.splash.presenter

import ir.sinapp.mvp.ui.splash.interactor.SplashMVPInteractor
import ir.sinapp.mvp.ui.base.presenter.MVPPresenter
import ir.sinapp.mvp.ui.splash.view.SplashMVPView

interface SplashMVPPresenter<V : SplashMVPView, I : SplashMVPInteractor> : MVPPresenter<V, I> {

    fun openActivity()

}