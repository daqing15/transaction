package com.mixedpower.domain

/*
 *ҵ������ҳ���
 *tb_operation_page
 * @author daqing chen
*/
class BusinessPage {
	
	//�ײ�id	OPER_ID	NUMBER(10)	FALSE	FALSE	TRUE
	String pageDesc         //ҳ������	PAGE_DESC	varchar2(40)	FALSE	FALSE	TRUE
	String pageOrder        //��ʾ˳��	PAGE_ORDER	NUMBER(10)	FALSE	FALSE	TRUE
	String specialJspPath   //���Ի�jsp	JSP_PATH	varchar2(100)	FALSE	FALSE	FALSE
	String defaultFalg      //�Ƿ�Ĭ��ҳ��	DEFA_FLAG	varchar2(2)	FALSE	FALSE	FALSE
	String checkClass       //���Ի���֤��	CHECK_CLASS	varchar2(100)	FALSE	FALSE	FALSE
	String state            //״̬	STATE	VARCHAR2(6)	FALSE	FALSE	TRUE
	Date   modTime          //	MOD_TIME	DATE	FALSE	FALSE	FALSE
	String modStaff         //�޸Ĺ���	MOD_STAFF	varchar2(20)	FALSE	FALSE	FALSE

    static constraints = {
        modStaff(nullable: true)
        pageDesc(nullable: true)
        pageOrder(nullable: true)
        specialJspPath(nullable: true)
        defaultFalg(nullable: true)
        checkClass(nullable: true)
        state(nullable: true)
        modTime(nullable: true)
    }

    static mapping = {
        version false
        table "tb_operation_page"
    }

    /*
    * ʵ�������ϵ����
    * */
    static belongsTo = [oper: Business]

 }
