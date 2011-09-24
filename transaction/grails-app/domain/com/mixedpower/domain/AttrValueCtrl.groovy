package com.mixedpower.domain

/**
 * ����������Ϣ��TB_CN_ATTR_VALUE_CTRL
 * @author daqing chen
 * @email  daqing15@gmail.com
 */

class AttrValueCtrl {

    //Grails ORM �Զ�����ID��� ��������ID	CONTROL_ID	NUMBER(10)	TRUE	FALSE	TRUE
    Integer attrId               //���Ա�ʶ	ATTR_ID	NUMBER(10)	FALSE	FALSE	TRUE
    String  attrValue            //����ȡֵ	ATTR_VALUE	varchar2(1000)	FALSE	FALSE	TRUE
    String  attrValueName        //����ֵ����	ATTR_VALUE_NAME	varchar2(1000)	FALSE	FALSE	FALSE
    Integer passiveAttrId        //���������Ա�ʶ	PASSIVE_ATTR_ID	NUMBER(10)	FALSE	FALSE	FALSE
    String  passiveAttrValue     //���������Ե�����ȡֵ	PASSIVE_ATTR_VALUE	varchar2(1000)	FALSE	FALSE	FALSE
    String  viewState            //��ʾ״̬	VIEW_STATE	varchar2(2)	FALSE	FALSE	FALSE
    String  ctrlType             //��������	CTRL_TYPE	varchar2(10)	FALSE	FALSE	FALSE

    static constraints = {
        attrValue(blank: false)

        attrValueName(nullable: true)
        passiveAttrId(nullable: true)
        passiveAttrValue(nullable: true)
        viewState(nullable: true)
        ctrlType(nullable: true)
    }

    static mapping = {
        version false
        table "TB_CN_ATTR_VALUE_CTRL"
    }
}
