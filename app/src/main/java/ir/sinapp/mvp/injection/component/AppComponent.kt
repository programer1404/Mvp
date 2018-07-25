package ir.sinapp.mvp.injection.component

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import ir.sinapp.mvp.App
import ir.sinapp.mvp.injection.bulder.ActivityBuilder
import ir.sinapp.mvp.injection.moduls.*
import javax.inject.Singleton

@Component(modules = [(PicassoModule::class),
    (RetrofitModule::class),
    (CacheDataModule::class),
    (AppModule::class),
    (AndroidModule::class),
    (LayoutManagerModule::class),
    (ActivityBuilder::class),
    (AndroidInjectionModule::class)])

@Singleton
interface AppComponent {

    fun inject(app: App)

    @Component.Builder
    interface Builder {

        fun build(): AppComponent

        @BindsInstance
        fun application(app: App): Builder

    }


}
