package com.mixedpower.domain

/**
 * 业务流程控制表tb_operation_flow
 * @author daqing chen
 * @email  daqing15@gmail.com
 */
class BizFlow {

    //TODO Grails ORM 自动生成ID [套餐id	OPER_ID	NUMBER(10)	FALSE	FALSE	TRUE]
    Integer pageId              //页面id	PAGE_ID	NUMBER(10)	FALSE	FALSE	TRUE
    Integer operId              //业务ID
    Integer attrId              //特性id	ATTR_ID	NUMBER(10)	FALSE	FALSE	TRUE
    String attrValue            //特性值	ATTR_VALUE	VARCHAR2(100)	FALSE	FALSE	FALSE
    String priorPage            //上一步	PRIOR_PAGE	NUMBER(10)	FALSE	FALSE	FALSE
    String nextPage             //下一步	NEXT_PAGE	NUMBER(10)	FALSE	FALSE	FALSE
    String state                //状态	STATE	VARCHAR2(6)	FALSE	FALSE	TRUE
    Date modTime                //修改时间	MOD_TIME	DATE	FALSE	FALSE	FALSE
    String modStaff             //修改人	MOD_STAFF	VARCHAR2(20)	FALSE	FALSE	FALSE

    static constraints = {
        state(blank: false)
        pageId(blank: false)
        attrId(blank: false)
        operId(blank: false)

        modStaff(nullable: true)
        modTime(nullable: true)
        nextPage(nullable: true)
        priorPage(nullable: true)
        attrValue(nullable: true)
    }

    static mapping = {
        version false
        table "tb_operation_flow"
    }
}
