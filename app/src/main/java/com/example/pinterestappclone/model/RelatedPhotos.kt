package com.example.pinterestappclone.model

data class RelatedPhotos(
    var total: Int? = null,
    var results: ArrayList<PhotoItem>? = null
)