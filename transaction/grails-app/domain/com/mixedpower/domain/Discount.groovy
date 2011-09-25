package com.mixedpower.domain

/**
 * 套餐优惠
 */
class Discount {

    String offerCode               //销售品编码
	String discSort                //优惠分类
	String offerId
	String discTypeArea           //城区类型
	String discName               //优惠名称
	String discTypeTime           //分期类型
	String discCode
	String sellContent            //销售目录

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
