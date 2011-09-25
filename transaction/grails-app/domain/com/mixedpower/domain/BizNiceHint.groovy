package com.mixedpower.domain

/**
 * 温馨提示信息tb_operation_hint
 * @author daqing chen
 * @email  daqing15@gmail.com
 */
class BizNiceHint implements Serializable {

    //TODO Grails ORM 自动生成ID [流水号	HINT_ID	NUMBER(10)	TRUE	FALSE	TRUE]
    //套餐id	OPER_ID	NUMBER(10)	FALSE	FALSE	TRUE
    String content          //内容	CONTENT	VARCHAR2(1000)	FALSE	FALSE	TRUE
    String state            //状态	STATE	VARCHAR2(6)	FALSE	FALSE	FALSE
    Date createTime         //创建时间	CREATE_TIME	DATE	FALSE	FALSE	TRUE
    String modStaff         //修改人标识	MOD_STAFF	VARCHAR2(20)	FALSE	FALSE	FALSE
    Date modTime            //修改时间	MOD_TIME	DATE	FALSE	FALSE	FALSE

    static constraints = {
        state(nullable: true)
        modStaff(nullable: true)
        modTime(nullable: true)

        content(blank: false)
        createTime(blank: false)
    }

    static mapping = {
        version false
        table "tb_operation_hint"
    }
}
