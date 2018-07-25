package ir.sinapp.mvp.injection.preferences

import android.content.Context
import android.content.SharedPreferences
import javax.inject.Inject


class AppPreferenceHelper @Inject constructor(context: Context,
                                              @PreferenceInfo private val prefFileName: String) : PreferenceHelper {

    companion object {
        const val PREF_KEY_CURRENT_USER_NAME = "PREF_KEY_CURRENT_USER_NAME"
    }

    private val mPrefs: SharedPreferences = context.getSharedPreferences(prefFileName, Context.MODE_PRIVATE)

    override fun getCurrentUserName(): String = mPrefs.getString(PREF_KEY_CURRENT_USER_NAME, "ABC")

    override fun setCurrentUserName(userName: String?) = mPrefs.edit().putString(PREF_KEY_CURRENT_USER_NAME, userName).apply()


}