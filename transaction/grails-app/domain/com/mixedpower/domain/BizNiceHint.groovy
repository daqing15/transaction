package com.mixedpower.domain

/**
 * ��ܰ��ʾ��Ϣtb_operation_hint
 * @author daqing chen
 * @email  daqing15@gmail.com
 */
class BizNiceHint implements Serializable {

    //TODO Grails ORM �Զ�����ID [��ˮ��	HINT_ID	NUMBER(10)	TRUE	FALSE	TRUE]
    //�ײ�id	OPER_ID	NUMBER(10)	FALSE	FALSE	TRUE
    String content          //����	CONTENT	VARCHAR2(1000)	FALSE	FALSE	TRUE
    String state            //״̬	STATE	VARCHAR2(6)	FALSE	FALSE	FALSE
    Date createTime         //����ʱ��	CREATE_TIME	DATE	FALSE	FALSE	TRUE
    String modStaff         //�޸��˱�ʶ	MOD_STAFF	VARCHAR2(20)	FALSE	FALSE	FALSE
    Date modTime            //�޸�ʱ��	MOD_TIME	DATE	FALSE	FALSE	FALSE

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
