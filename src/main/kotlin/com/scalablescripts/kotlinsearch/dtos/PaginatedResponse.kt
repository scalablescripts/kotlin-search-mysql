package com.scalablescripts.kotlinsearch.dtos

class PaginatedResponse(
    val data: List<Any>,
    val total: Int,
    val page: Int,
    val last_page: Int
) {
}