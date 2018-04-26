package com.itpiwo.beercrew.domain.entity

/**
 * Created by Tsvetan Ovedenski on 26/04/2018.
 */
enum class Serving {
    Glass, Bottle, Can;

    companion object {
        fun from(string: String): Serving? = when (string.trim().toLowerCase()) {
            "glass"  -> Glass
            "bottle" -> Bottle
            "can"    -> Can

            else -> null
        }
    }
}