package com.mixedpower.domain

/**
 * �ײ��Ż�
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
    }

    static mapping = {
        version false
        table "tbn_disc"
    }
}
