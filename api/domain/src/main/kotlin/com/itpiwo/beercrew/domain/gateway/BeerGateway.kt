package com.itpiwo.beercrew.domain.gateway

import com.itpiwo.beercrew.domain.entity.Beer

/**
 * Created by Tsvetan Ovedenski on 26/04/2018.
 */
interface BeerGateway {
    fun findBeers(query: FindBeersQuery): List<Beer>
    fun create(beer: Beer)
}

data class FindBeersQuery(val nameContains: String)