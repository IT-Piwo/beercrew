package com.itpiwo.beercrew.domain.shared

/**
 * Created by Tsvetan Ovedenski on 26/04/2018.
 */
fun Float.assertBetween(lower: Float, upper: Float, name: String) {
    if (this < lower || this > upper) {
        throw IllegalArgumentException("$name must be between $lower and $upper")
    }
}