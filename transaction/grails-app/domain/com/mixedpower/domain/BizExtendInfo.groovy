package com.mixedpower.domain

/*
* 业务扩展信息
* TB_OPERATION_EX_INFO
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
