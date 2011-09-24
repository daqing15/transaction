package com.mixedpower.domain

/**
 * 业务页面参数模块表tb_operation_module
 * 简要说明其关联关系:
 *
 * @author daqing chen
 * @email  daqing15@gmail.com
 */
class BizModule {

    //TODO Grails ORM 自动生成ID [模块id	MODULE_ID	NUMBER(10)	TRUE	FALSE	TRUE]
    String pageId               //页面id	PAGE_ID	varchar2(40)	FALSE	FALSE	TRUE
    Integer operId              //套餐id	OPER_ID	NUMBER(10)	FALSE	FALSE	TRUE
    String moduleName           //模块名称	MODULE_NAME	VARCHAR2(100)	FALSE	FALSE	TRUE
    String moduleOrder          //显示顺序	MODULE_ORDER	varchar2(100)	FALSE	FALSE	FALSE
    String state                //状态	STATE	VARCHAR2(6)	FALSE	FALSE	TRUE
    String modStaff                //修改工号	MOD_STAFF	varchar2(20)	FALSE	FALSE	FALSE
    String showState            //显示状态	SHOW_STATE	varchar2(2)	FALSE	FALSE	FALSE
    String moduleCode           //模块编码	MODULE_CODE	varchar2(100)	FALSE	FALSE	FALSE
    Date   modTime              //修改时间	MOD_TIME	DATE	FALSE	FALSE	FALSE

    static constraints = {
        moduleName(blank: false)
        state(blank: false)
        pageId(blank: false)
        operId(blank: false)

        moduleOrder(nullable: true)
        modTime(nullable: true)
        modStaff(nullable: true)
        showState(nullable: true)
        moduleCode(nullable: true)

    }

    static mapping = {
        version false
        table "tb_operation_module"
    }
}
