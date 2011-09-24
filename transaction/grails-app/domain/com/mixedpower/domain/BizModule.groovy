package com.mixedpower.domain

/**
 * ҵ��ҳ�����ģ���tb_operation_module
 * ��Ҫ˵���������ϵ:
 *
 * @author daqing chen
 * @email  daqing15@gmail.com
 */
class BizModule {

    //TODO Grails ORM �Զ�����ID [ģ��id	MODULE_ID	NUMBER(10)	TRUE	FALSE	TRUE]
    String pageId               //ҳ��id	PAGE_ID	varchar2(40)	FALSE	FALSE	TRUE
    Integer operId              //�ײ�id	OPER_ID	NUMBER(10)	FALSE	FALSE	TRUE
    String moduleName           //ģ������	MODULE_NAME	VARCHAR2(100)	FALSE	FALSE	TRUE
    String moduleOrder          //��ʾ˳��	MODULE_ORDER	varchar2(100)	FALSE	FALSE	FALSE
    String state                //״̬	STATE	VARCHAR2(6)	FALSE	FALSE	TRUE
    String modStaff                //�޸Ĺ���	MOD_STAFF	varchar2(20)	FALSE	FALSE	FALSE
    String showState            //��ʾ״̬	SHOW_STATE	varchar2(2)	FALSE	FALSE	FALSE
    String moduleCode           //ģ�����	MODULE_CODE	varchar2(100)	FALSE	FALSE	FALSE
    Date   modTime              //�޸�ʱ��	MOD_TIME	DATE	FALSE	FALSE	FALSE

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
