package gw.gobpo2005.rickandmorty.main_page.api.model

import com.google.gson.annotations.SerializedName

data class ResultDataResponse(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("status")
    val status: String?,
    @SerializedName("species")
    val species: String?,
    @SerializedName("type")
    val type: String?,
    @SerializedName("gender")
    val gender: String?,
    @SerializedName("origin")
    val origin: OriginResponse?,
    @SerializedName("location")
    val location: LocationResponse?,
    @SerializedName("image")
    val image:String?,
    @SerializedName("episode")
    val episode : List<String?>,
    @SerializedName("url")
    val url: String?,
    @SerializedName("created")
    val created : String?
)