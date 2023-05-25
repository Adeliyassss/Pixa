package com.example.pixa

data class PixaModel (
    val hits: ArrayList<ImageModel>
)

data class ImageModel(
    var largeImageUrl: String
)
