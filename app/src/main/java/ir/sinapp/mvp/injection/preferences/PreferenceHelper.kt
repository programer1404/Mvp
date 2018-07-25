package ir.sinapp.mvp.injection.preferences

interface PreferenceHelper {

    fun getCurrentUserName(): String

    fun setCurrentUserName(userName: String?)

}