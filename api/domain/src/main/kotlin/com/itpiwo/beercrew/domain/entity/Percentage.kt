package com.itpiwo.beercrew.domain.entity

import com.itpiwo.beercrew.domain.shared.assertBetween

/**
 * Created by Tsvetan Ovedenski on 26/04/2018.
 */
data class Percentage(val value: Float) {
    init {
        value.assertBetween(0f, 100f, "percentage")
    }

    override fun toString() = "%.2f%%".format(value / 100)
}