package ir.sinapp.mvp.ui.splash.interactor

import ir.sinapp.mvp.ui.base.interactor.BaseInteractor
import javax.inject.Inject
import android.os.Handler

class SplashInteractor @Inject constructor(val handler: Handler) : BaseInteractor(), SplashMVPInteractor {


    override fun postDelay(r: Runnable) {
        handler.postDelayed(r, 2000)
    }


}