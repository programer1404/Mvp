package ir.sinapp.mvp.api.model

import com.google.gson.annotations.SerializedName


data class Profile(
        @SerializedName("status") var status: Int,
        @SerializedName("message") var message: String,
        @SerializedName("feeds") var feeds: Feeds,
        @SerializedName("debugInfo") var debugInfo: Any?
)

data class Feeds(
        @SerializedName("profiles") var profiles: ArrayList<User>
)

class User(
        @SerializedName("firstname") var firstName: String,
        @SerializedName("lastname") var lastName: String,
        @SerializedName("gender") var gender: String,
        @SerializedName("email") var email: String,
        @SerializedName("imageUrl") var imageUrl: String,
        @SerializedName("phone") var phone: String
)
