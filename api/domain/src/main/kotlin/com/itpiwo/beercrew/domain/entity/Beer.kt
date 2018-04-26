package com.itpiwo.beercrew.domain.entity

import com.itpiwo.beercrew.domain.shared.assertBetween

/**
 * Created by Tsvetan Ovedenski on 05/04/2018.
 */
data class Beer(
        val name: String,
        val brewery: Brewery,
        val alcohol: Percentage,
        val bitterness: Percentage
)