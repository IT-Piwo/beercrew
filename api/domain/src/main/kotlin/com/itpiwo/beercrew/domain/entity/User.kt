package com.itpiwo.beercrew.domain.entity

/**
 * Created by Tsvetan Ovedenski on 26/04/2018.
 */
data class User(
        val name: String,
        val friends: List<User>,
        val checkins: List<Checkin>
) {
    fun checkin(beer: Beer, comment: String, serving: Serving) {
        val checkin =  Checkin(beer, comment, serving)
        (checkins as? MutableList)?.add(checkin)
    }
}