package ir.sinapp.mvp.ui.base.interactor

import ir.sinapp.mvp.api.ManagementData
import ir.sinapp.mvp.injection.preferences.PreferenceHelper

open class BaseInteractor() : MVPInteractor {

    protected lateinit var preferenceHelper: PreferenceHelper
    protected lateinit var managementData: ManagementData

    constructor(preferenceHelper: PreferenceHelper, managementData: ManagementData) : this() {
        this.preferenceHelper = preferenceHelper
        this.managementData = managementData
    }

}