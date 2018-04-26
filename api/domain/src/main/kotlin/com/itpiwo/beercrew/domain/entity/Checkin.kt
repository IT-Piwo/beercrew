package com.itpiwo.beercrew.domain.entity

/**
 * Created by Tsvetan Ovedenski on 26/04/2018.
 */
data class Checkin(
        val beer: Beer,
        val comment: String,
        val serving: Serving
)