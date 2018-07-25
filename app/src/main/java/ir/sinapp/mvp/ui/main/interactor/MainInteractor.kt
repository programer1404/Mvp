package ir.sinapp.mvp.ui.main.interactor

import ir.sinapp.mvp.api.ManagementData
import ir.sinapp.mvp.injection.preferences.PreferenceHelper
import ir.sinapp.mvp.ui.base.interactor.BaseInteractor
import javax.inject.Inject

class MainInteractor @Inject internal constructor(preferenceHelper: PreferenceHelper, managementData: ManagementData) : BaseInteractor(preferenceHelper = preferenceHelper, managementData = managementData), MainMVPInteractor {



}
