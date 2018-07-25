package ir.sinapp.mvp.ui.main.presenter

import ir.sinapp.mvp.ui.main.interactor.MainMVPInteractor
import ir.sinapp.mvp.ui.main.view.MainMVPView
import ir.sinapp.mvp.ui.base.presenter.MVPPresenter

interface MainMVPPresenter<V : MainMVPView, I : MainMVPInteractor> : MVPPresenter<V, I> {


}