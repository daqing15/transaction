package com.mixedpower.domain.order

/**
 * ҵ�񶩵������ tb_order_detail
 * DESC:    ҵ�񶩵������ ������������
 * @author daqing chen
 * @email  daqing15@gmail.com
 */
class OrderDetail implements Serializable {

    //��������	ORDER_NO	varchar2(20)	FALSE	FALSE	TRUE
    Integer attrId              //���Ա�ʶ	ATTR_ID	numeric(10)	FALSE	FALSE	TRUE
   // String orderNo
    String attrName             //��������	ATTR_NAME	varchar2(200)	FALSE	FALSE	FALSE
    String attrValue            //����ȡֵ	ATTR_VALUE	varchar(500)	FALSE	FALSE	FALSE
    String attrValueName        //����ȡֵ����	ATTR_VALUE_NAME	varchar2(2000)	FALSE	FALSE	FALSE
    String dispSeq              //��ʾ˳��	DISP_SEQ	varchar2(10)	FALSE	FALSE	FALSE
    String propName             //java������	PROP_NAME	varchar2(200)	FALSE	FALSE	FALSE
    static constraints = {
        attrName(nullable: true)
        attrValue(nullable: true)
        attrValueName(nullable: true)
        dispSeq(nullable: true)
        propName(nullable: true)
    }

    static mapping = {
        version false
        table("tb_order_detail")
        id generator:"assigned", column: "order_no", type: 'string', index: 'ORDER_DETAIL_ORDER_NO_INDEX'
        //��������
        attrId column:"attr_id", sqlType: "integer", index: "IDX_TB_ORDER_DETAIL_ATTRID"
    }
}
