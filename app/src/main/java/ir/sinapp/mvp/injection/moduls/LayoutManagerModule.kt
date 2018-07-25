package ir.sinapp.mvp.injection.moduls

import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import dagger.Module
import dagger.Provides

@Module
class LayoutManagerModule{

    @Provides
    fun linerLayoutManager(context: Context): RecyclerView.LayoutManager  = LinearLayoutManager(context)

}