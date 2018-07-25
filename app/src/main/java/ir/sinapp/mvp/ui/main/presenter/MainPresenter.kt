package ir.sinapp.mvp.ui.main.presenter

import ir.sinapp.mvp.ui.main.interactor.MainMVPInteractor
import ir.sinapp.mvp.ui.main.view.MainMVPView
import ir.sinapp.mvp.ui.base.presenter.BasePresenter
import javax.inject.Inject


class MainPresenter<V : MainMVPView, I : MainMVPInteractor> @Inject internal constructor(interactor: I) : BasePresenter<V, I>(interactor = interactor), MainMVPPresenter<V, I> {

    override fun onAttach(view: V?) {
        super.onAttach(view)


    }


}