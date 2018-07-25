package ir.sinapp.mvp.ui.splash.presenter

import ir.sinapp.mvp.ui.splash.interactor.SplashMVPInteractor
import ir.sinapp.mvp.ui.base.presenter.BasePresenter
import ir.sinapp.mvp.ui.splash.view.SplashMVPView
import javax.inject.Inject

class SplashPresenter<V : SplashMVPView, I : SplashMVPInteractor> @Inject internal constructor(interactor: I) : BasePresenter<V, I>(interactor = interactor), SplashMVPPresenter<V, I> {

    override fun onAttach(view: V?) {
        super.onAttach(view)
        openActivity()
    }

    override fun openActivity() {
        interactor!!.postDelay(Runnable { getView()!!.openMainActivity() })
    }


}