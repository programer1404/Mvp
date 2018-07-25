package ir.sinapp.mvp.ui.base.presenter

import ir.sinapp.mvp.ui.base.interactor.MVPInteractor
import ir.sinapp.mvp.ui.base.view.MVPView

interface MVPPresenter<V : MVPView, I : MVPInteractor> {

    fun onAttach(view: V?)

    fun onDetach()

    fun getView(): V?

}