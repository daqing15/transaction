package com.mixedpower.domain

/*
 *ҵ����չ��Ϣ���Զ���
 *Table -> tb_operation_ex_define
 * @author daqing chen
*/
class BizExtendAttr implements Serializable {
	
	String attrName			//��ʾ����
	String attrType			//��������
	String propertyName		//��������
	String attrDesc			//����˵��
	String attrLength		//����ֵ����
	String checkClass		//��֤�����
	String sortOrder		//����˳��
	String state			//״̬
	Date createTime			//����ʱ��
	String createStaff		//������
	Date modTime			//�޸�ʱ��
	String modStaff			//�޸���

	static hasOne = [extendInfo: BizExtendInfo]

    static constraints = {
        modStaff(nullable: true)
        modTime(nullable: true)
        checkClass(nullable: true)
        attrLength(nullable: true)
        attrDesc(nullable: true)

        attrName(blank: false)
        attrType(blank: false)
        propertyName(blank: false)
        sortOrder(blank: false)
        state(blank: false)
        createTime(blank: false)
        createStaff(blank: false)


    }

    static mapping = {
        version false
        table "tb_operation_ex_define"
    }
}
