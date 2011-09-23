package com.mixedpower.domain

/*
 *业务受理页面表
 *tb_operation_page
 * @author daqing chen
*/
class BusinessPage {
	
	//套餐id	OPER_ID	NUMBER(10)	FALSE	FALSE	TRUE
	String pageDesc         //页面描述	PAGE_DESC	varchar2(40)	FALSE	FALSE	TRUE
	String pageOrder        //显示顺序	PAGE_ORDER	NUMBER(10)	FALSE	FALSE	TRUE
	String specialJspPath   //个性化jsp	JSP_PATH	varchar2(100)	FALSE	FALSE	FALSE
	String defaultFalg      //是否默认页面	DEFA_FLAG	varchar2(2)	FALSE	FALSE	FALSE
	String checkClass       //个性化验证类	CHECK_CLASS	varchar2(100)	FALSE	FALSE	FALSE
	String state            //状态	STATE	VARCHAR2(6)	FALSE	FALSE	TRUE
	Date   modTime          //	MOD_TIME	DATE	FALSE	FALSE	FALSE
	String modStaff         //修改工号	MOD_STAFF	varchar2(20)	FALSE	FALSE	FALSE

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
    * 实体关联关系设置
    * */
    static belongsTo = [oper: Business]

 }
