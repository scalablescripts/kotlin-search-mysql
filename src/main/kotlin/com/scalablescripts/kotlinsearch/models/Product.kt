package com.scalablescripts.kotlinsearch.models

import javax.persistence.*

@Entity
class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id = 0

    @Column
    var title = ""

    @Column
    var description = ""

    @Column
    var image = ""

    @Column
    var price = 0
}