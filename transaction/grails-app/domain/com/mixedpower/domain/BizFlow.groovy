package com.mixedpower.domain

/**
 * ҵ�����̿��Ʊ�tb_operation_flow
 * @author daqing chen
 * @email  daqing15@gmail.com
 */
class BizFlow {

    //TODO Grails ORM �Զ�����ID [�ײ�id	OPER_ID	NUMBER(10)	FALSE	FALSE	TRUE]
    //ҳ��id	PAGE_ID	NUMBER(10)	FALSE	FALSE	TRUE
    //����id	ATTR_ID	NUMBER(10)	FALSE	FALSE	TRUE
    String attrValue            //����ֵ	ATTR_VALUE	VARCHAR2(100)	FALSE	FALSE	FALSE
    String priorPage            //��һ��	PRIOR_PAGE	NUMBER(10)	FALSE	FALSE	FALSE
    String nextPage             //��һ��	NEXT_PAGE	NUMBER(10)	FALSE	FALSE	FALSE
    String state                //״̬	STATE	VARCHAR2(6)	FALSE	FALSE	TRUE
    Date modTime                //�޸�ʱ��	MOD_TIME	DATE	FALSE	FALSE	FALSE
    String modStaff             //�޸���	MOD_STAFF	VARCHAR2(20)	FALSE	FALSE	FALSE

    static constraints = {
    }

    static mapping = {
        version false
        table "tb_operation_flow"
    }
}
