package com.itpiwo.beercrew.usecase

/**
 * Created by Tsvetan Ovedenski on 05/04/2018.
 */
interface Usecase <in Request, out Response> {
    fun execute(request: Request): Response
}