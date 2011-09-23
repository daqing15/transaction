package com.mixedpower.domain.order

/**
 * 业务订单详情表 tb_order_detail
 * DESC:    业务订单详情表， 超大数据量表
 * @author daqing chen
 * @email  daqing15@gmail.com
 */
class OrderDetail {

    //订单编码	ORDER_NO	varchar2(20)	FALSE	FALSE	TRUE
    //特性标识	ATTR_ID	numeric(10)	FALSE	FALSE	TRUE

    String attrName             //特性名称	ATTR_NAME	varchar2(200)	FALSE	FALSE	FALSE
    String attrValue            //特性取值	ATTR_VALUE	varchar(500)	FALSE	FALSE	FALSE
    String attrValueName        //特性取值名称	ATTR_VALUE_NAME	varchar2(2000)	FALSE	FALSE	FALSE
    String dispSeq              //显示顺序	DISP_SEQ	varchar2(10)	FALSE	FALSE	FALSE
    String propName             //java特性名	PROP_NAME	varchar2(200)	FALSE	FALSE	FALSE
    static constraints = {
    }

    static mapping = {
        version false
        table("tb_order_detail")
    }
}
