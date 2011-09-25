package com.mixedpower.domain

/**
 * Ì×²ÍÓÅ»Ý
 */
class Discount {

    String offerCode
	String discSort
	String offerId
	String discTypeArea
	String discName
	String discTypeTime
	String discCode
	String sellContent

    static constraints = {
        offerCode(nullable: true)
        discCode(nullable: true)
        discSort(nullable: true)
        offerId(nullable: true)
        discTypeArea(nullable: true)
        discTypeTime(nullable: true)
        sellContent(nullable: true)
        discName(nullable: true)

    }

    static mapping = {
        version false
        table "tbn_disc"
    }
}
