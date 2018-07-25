package ir.sinapp.mvp

import android.app.Activity
import android.app.Application
import android.support.v7.app.AppCompatActivity
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import ir.sinapp.mvp.injection.component.DaggerAppComponent
import javax.inject.Inject

class App : Application(), HasActivityInjector {

    @Inject
    internal lateinit var activityDispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun activityInjector() = activityDispatchingAndroidInjector


    companion object {

        fun get(activity: AppCompatActivity): App = activity.applicationContext as App

    }

    override fun onCreate() {
        super.onCreate()
        val component = DaggerAppComponent
                .builder()
                .application(this)
                .build()
        component.inject(this)
    }

}
