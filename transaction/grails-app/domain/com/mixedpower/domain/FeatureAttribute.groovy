package com.mixedpower.domain

/**
 * ���Ա�tb_cn_attribute��
 * @author daqing chen
 * @email  daqing15@gmail.com
 */
class FeatureAttribute {

    // Grails ORM �Զ�����ID ���Ա�ʶ	ATTR_ID	NUMBER(10)	TRUE	FALSE	TRUE
    //�ײ�id	OPER_ID	NUMBER(10)	FALSE	FALSE	TRUE
    //����ҳ��	PAGE_ID	NUMBER(10)	FALSE	FALSE	FALSE

    String attrName             //��������	ATTR_NAME	VARCHAR2(30)	FALSE	FALSE	TRUE
    String attrType             //��������	ATTR_TYPE	VARCHAR2(6)	FALSE	FALSE	TRUE
    String attrDataType         //����ֵ��������	ATTR_DATA_TYPE	VARCHAR2(6)	FALSE	FALSE	FALSE
    Integer attrLength           //����ֵ����	ATTR_LENGTH	INTEGER	FALSE	FALSE	FALSE
    String attrNullable         //����ֵ�Ƿ��Ϊ��	ATTR_NULLABLE	VARCHAR2(6)	FALSE	FALSE	TRUE
    String attrDefaValue        //����Ĭ��ֵ	ATTR_DEFA_VALUE	VARCHAR2(1000)	FALSE	FALSE	FALSE
    String attrValueDesc        //����ȡֵ����	ATTR_VALUE_DESC	VARCHAR2(2000)	FALSE	FALSE	FALSE
    String propertyName         //java��������	PROPERTY_NAME	VARCHAR2(20)	FALSE	FALSE	FALSE
    String parseClass           //java��������	PARSE_CLASS	VARCHAR2(150)	FALSE	FALSE	FALSE
    Integer displayOrder         //��ʾ˳��	DISPLAY_ORDER	INTEGER	FALSE	FALSE	FALSE
    String state                //״̬	STATE	VARCHAR(6)	FALSE	FALSE	TRUE
    Date   createTime           //��������	CREATE_TIME	DATE	FALSE	FALSE	FALSE
    String modStaff             //�޸��˱�ʶ	MOD_STAFF	VARCHAR2(10)	FALSE	FALSE	FALSE
    Date   modTime              //�޸�����	MOD_TIME	DATE	FALSE	FALSE	FALSE
    String remark               //��ע	REMARK	VARCHAR(100)	FALSE	FALSE	FALSE
    String readOnly             //�Ƿ�ֻ��	READ_ONLY	VARCHAR2(2)	FALSE	FALSE	FALSE
    String confirmFlag          //ȷ����֤��־	CONFIRM_FLAG	VARCHAR(6)	FALSE	FALSE	FALSE
    String valFrom              //ȡֵ��Դ	VAL_FROM	VARCHAR2(2)	FALSE	FALSE	FALSE
    String valClass             //ȡֵclass��	VAL_CLASS	VARCHAR2(100)	FALSE	FALSE	FALSE
    String optionFrom           //ѡ����Դ	OPTION_FROM	VARCHAR2(2)	FALSE	FALSE	FALSE
    String optionClass          //ѡ��class��	OPTION_CLASS	VARCHAR2(100)	FALSE	FALSE	FALSE
    String layMode              //���з�ʽ	LAY_MODE	VARCHAR2(2)	FALSE	FALSE	FALSE
    String patternXsl        //��ʽXSL	PATTERN_XSL	VARCHAR2(100)	FALSE	FALSE	FALSE
    String hiddenFlag           //�Ƿ�����	HIDDEN_FLAG	varchar2(2)	FALSE	FALSE	FALSE
    String maxChoice            //ѡ������	MAX_CHOICE	varchar(4)	FALSE	FALSE	FALSE
    String minChoice            //ѡ������	MIN_CHOICE	varchar2(4)	FALSE	FALSE	FALSE
    String maxLength            //��󳤶�	MAX_LENGTH	varchar2(4)	FALSE	FALSE	FALSE
    String minLength            //��С����	MIN_LENGTH	varchar2(4)	FALSE	FALSE	FALSE
    String showState            //��ʾ״̬	SHOW_STATE	varchar2(2)	FALSE	FALSE	FALSE

    static constraints = {
        attrName(blank: false)
        attrType(blank: false)
        attrNullable(blank: false)
        state(blank: false)

        attrDataType(nullable: true)
        attrLength(nullable: true)
        attrDefaValue(nullable: true)
        attrValueDesc(nullable: true)
        propertyName(nullable: true)
        parseClass(nullable: true)
        displayOrder(nullable: true)
        createTime(nullable: true)
        modStaff(nullable: true)
        modTime(nullable: true)
        remark(nullable: true)
        readOnly(nullable: true)
        confirmFlag(nullable: true)
        valFrom(nullable: true)
        valClass(nullable: true)
        optionFrom(nullable: true)
        optionClass(nullable: true)
        layMode(nullable: true)
        patternXsl(nullable: true)
        hiddenFlag(nullable: true)
        maxChoice(nullable: true)
        minChoice(nullable: true)
        maxLength(nullable: true)
        minLength(nullable: true)
        showState(nullable: true)

    }

    static mapping = {
        version false
        table "tb_cn_attribute"
    }
}
