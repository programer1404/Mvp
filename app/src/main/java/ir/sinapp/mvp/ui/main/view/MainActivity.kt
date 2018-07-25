package ir.sinapp.mvp.ui.main.view

import android.os.Bundle
import android.support.v7.widget.RecyclerView
import com.squareup.picasso.Picasso
import ir.sinapp.mvp.R
import ir.sinapp.mvp.adapter.UserAdapter
import ir.sinapp.mvp.api.ManagementData
import ir.sinapp.mvp.api.model.Feeds
import ir.sinapp.mvp.api.model.User
import ir.sinapp.mvp.ui.main.interactor.MainMVPInteractor
import ir.sinapp.mvp.ui.main.presenter.MainMVPPresenter
import ir.sinapp.mvp.ui.base.view.BaseActivity
import javax.inject.Inject


class MainActivity : BaseActivity(), MainMVPView {

    @Inject
    internal lateinit var presenter: MainMVPPresenter<MainMVPView, MainMVPInteractor>


    @Inject
    lateinit var picasso: Picasso

    @Inject
    lateinit var managementData: ManagementData

    lateinit var recyclerView: RecyclerView

    @Inject
    lateinit var viewAdapter: UserAdapter

    @Inject
    lateinit var viewManager: RecyclerView.LayoutManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        recyclerView = findViewById<RecyclerView>(R.id.recyclerView).apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter
        }

        managementData.getUser(mapOf("count" to "100", "gender" to "both", "type" to "brief"), object : ManagementData.Callback {
            override fun onResponse(response: Feeds?) {
                viewAdapter.userList = response?.profiles!!
            }

            override fun onFailure(t: Throwable?) {

            }
        })

        viewAdapter.setListener(object : UserAdapter.ViewHolder.OnItemClickListener {
            override fun onClick(user: User) {

            }
        })

    }
    override fun onFragmentAttached() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onFragmentDetached(tag: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }



}
