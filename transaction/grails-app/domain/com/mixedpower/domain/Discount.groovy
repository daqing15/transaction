package com.mixedpower.domain

/**
 * �ײ��Ż�
 */
class Discount {

    String offerCode               //����Ʒ����
	String discSort                //�Żݷ���
	String offerId
	String discTypeArea           //��������
	String discName               //�Ż�����
	String discTypeTime           //��������
	String discCode
	String sellContent            //����Ŀ¼

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
