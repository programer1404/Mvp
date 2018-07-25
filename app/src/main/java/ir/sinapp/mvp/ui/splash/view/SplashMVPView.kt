package ir.sinapp.mvp.ui.splash.view

import ir.sinapp.mvp.ui.base.view.MVPView


interface SplashMVPView : MVPView {

    fun showSuccessToast()
    fun showErrorToast()
    fun openMainActivity()
}