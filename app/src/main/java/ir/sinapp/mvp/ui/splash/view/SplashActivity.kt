package ir.sinapp.mvp.ui.splash.view

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.os.Bundle
import android.provider.Settings
import android.widget.Toast
import ir.sinapp.mvp.ui.splash.interactor.SplashMVPInteractor
import ir.sinapp.mvp.R
import ir.sinapp.mvp.ui.base.view.BaseActivity
import ir.sinapp.mvp.ui.splash.presenter.SplashMVPPresenter
import javax.inject.Inject
import kotlinx.android.synthetic.main.activity_splash.*


class SplashActivity : BaseActivity(), SplashMVPView {


    @Inject
    lateinit var presenter: SplashMVPPresenter<SplashMVPView, SplashMVPInteractor>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        presenter.onAttach(this)
    }

    override fun onDestroy() {
        presenter.onDetach()
        super.onDestroy()
    }

    override fun onFragmentDetached(tag: String) {
    }

    override fun onFragmentAttached() {
    }

    override fun showSuccessToast() {
        Toast.makeText(this,"Success",Toast.LENGTH_LONG).show()
    }

    override fun showErrorToast() {
    }

    override fun openMainActivity() {
        val str = Settings.Secure.getString(this.contentResolver, "android_id")
        val t = str
        val clipboard = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        val clip = ClipData.newPlainText("json", t)
        clipboard.primaryClip = clip
        tv.text = t
//        val intent = Intent(this, MainActivity::class.java)
//        startActivity(intent)
//        finish()
    }

}
