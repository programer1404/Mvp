package ir.sinapp.mvp.adapter

import android.annotation.SuppressLint
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import ir.sinapp.mvp.R
import ir.sinapp.mvp.api.model.User
import java.util.*
import javax.inject.Inject

class UserAdapter @Inject constructor(private val picasso: Picasso) :
        RecyclerView.Adapter<UserAdapter.ViewHolder>() {

    internal var userList = ArrayList<User>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    fun setListener(onItemClickListener: ViewHolder.OnItemClickListener) {
        ViewHolder.onItemClickListener = onItemClickListener
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val name: TextView = itemView.findViewById(R.id.txt_name)
        private val email: TextView = itemView.findViewById(R.id.txt_email)
        private val avatar: ImageView = itemView.findViewById(R.id.img_profile)

        companion object {
            var onItemClickListener: OnItemClickListener? = null
        }

        @SuppressLint("SetTextI18n")
        fun bindData(user: User, picasso: Picasso) {

            name.text = "${user.firstName} ${user.lastName}"
            email.text = user.email
            picasso.load("http:${user.imageUrl}").into(avatar)

            itemView.setOnClickListener { onItemClickListener?.onClick(user) }

        }

        interface OnItemClickListener {
            fun onClick(user:User)
        }

    }


    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.adapter_user, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.bindData(userList[position], picasso)

    }

    override fun getItemCount() = userList.size
}