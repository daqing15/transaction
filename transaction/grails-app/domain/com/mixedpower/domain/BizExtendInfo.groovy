package com.mixedpower.domain

/*
* ҵ����չ��Ϣ
* TB_OPERATION_EX_INFO
* @author daqing chen
*/
class BizExtendInfo {

	String propertyName
	String attrValue

	BizExtendAttr attr_define

    static constraints = {
    }

    static mapping = {
        version false
        table "tb_operation_ex_info"
    }

    static belongsTo = [oper: Business]
}
