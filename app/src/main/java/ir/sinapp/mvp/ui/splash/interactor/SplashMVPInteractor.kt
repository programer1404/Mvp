package ir.sinapp.mvp.ui.splash.interactor

import ir.sinapp.mvp.ui.base.interactor.MVPInteractor

/**
 * Created by jyotidubey on 04/01/18.
 */
interface SplashMVPInteractor : MVPInteractor {

    fun postDelay(r: Runnable)

}