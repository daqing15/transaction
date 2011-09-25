package com.mixedpower.domain

/**
 * ����ֵ����ȡֵ��tb_cn_attr_value��
 * DESC: ����ֵ����ȡֵ������������ͬ�Ķ��󣨲�Ʒ��ҵ�񣩶Ա������Ե�ȡֵ��Χ��
 * PK_CN_ATTR_VALUE primary key (ATTR_VALUE_NAME, ATTR_VALUE, ATTR_ID)
 * @author daqing chen
 * @email  daqing15@gmail.com
 */
class FeatureAttrValue implements Serializable {

    //Grails ORM �Զ�����ID���	ID	NUMBER(10)	FALSE	FALSE	FALSE

    //���Ա�ʶ	ATTR_ID	NUMBER(10)	TRUE	FALSE	TRUE
    String attrValueName            //����ֵ����	ATTR_VALUE_NAME	varchar2(1000)	TRUE	FALSE	TRUE
    String attrValue                //����ȡֵ	ATTR_VALUE	varchar2(1000)	TRUE	FALSE	TRUE
    Integer attrValueSeq            //����ȡֵ���	ATTR_VALUE_SEQ	INTEGER	FALSE	FALSE	FALSE
    String state                    //״̬	STATE	varchar2(6)	FALSE	FALSE	FALSE
    String modStaff                 //�޸��˱�ʶ	MOD_STAFF	varchar2(20)	FALSE	FALSE	FALSE
    Date   modDate                  // �޸�����	MOD_DATE	DATE	FALSE	FALSE	FALSE
    String remark                   //��ע	REMARK	VARCHAR2(100)	FALSE	FALSE	FALSE
    String ctrlAttr                 // default 'SOA' ������ʾ����	CTRL_ATTR	VARCHAR2(4)	FALSE	FALSE	FALSE
    String ctrlAttrValue            //����ֵ��ʾ����	CTRL_ATTR_VALUE	varchar2(4)	FALSE	FALSE	FALSE
    String valueState               //��ʾ״̬	VALUE_STATE	varchar2(2)	FALSE	FALSE	FALSE

    static constraints = {
        attrValueName(blank: false)
        attrValue(blank: false)

        attrValueSeq(nullable: true)
        state(nullable: true)
        modStaff(nullable: true)
        modDate(nullable: true)
        remark(nullable: true)
        ctrlAttr(nullable: true)
        ctrlAttrValue(nullable: true)
        valueState(nullable: true)

    }

    static mapping = {
        table "tb_cn_attr_value"
        version false
    }
}
