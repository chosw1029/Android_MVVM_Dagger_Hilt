package com.nextus.model

import com.google.gson.annotations.SerializedName

data class Document(
    @SerializedName("collection") val collection: String,
    @SerializedName("datetime") val dateTime: String,
    @SerializedName("display_sitename") val displaySiteName: String,
    @SerializedName("doc_url") val docUrl: String,
    @SerializedName("height") val height: Int,
    @SerializedName("width") val width: Int,
    @SerializedName("image_url") val imageUrl: String,
    @SerializedName("thumbnail_url") val thumbnailUrl: String
)