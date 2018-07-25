package ir.sinapp.mvp.ui.main

import dagger.Module
import dagger.Provides
import ir.sinapp.mvp.ui.main.interactor.MainInteractor
import ir.sinapp.mvp.ui.main.interactor.MainMVPInteractor
import ir.sinapp.mvp.ui.main.presenter.MainMVPPresenter
import ir.sinapp.mvp.ui.main.presenter.MainPresenter
import ir.sinapp.mvp.ui.main.view.MainMVPView

/**
 * Created by jyotidubey on 09/01/18.
 */
@Module
class MainActivityModule {

    @Provides
    internal fun provideMainInteractor(mainInteractor: MainInteractor): MainMVPInteractor = mainInteractor

    @Provides
    internal fun provideMainPresenter(mainPresenter: MainPresenter<MainMVPView, MainMVPInteractor>)
            : MainMVPPresenter<MainMVPView, MainMVPInteractor> = mainPresenter

}