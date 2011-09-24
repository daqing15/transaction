package com.mixedpower.domain

/**
 * 关联控制信息表TB_CN_ATTR_VALUE_CTRL
 * @author daqing chen
 * @email  daqing15@gmail.com
 */

class AttrValueCtrl {

    //Grails ORM 自动生成ID编号 关联控制ID	CONTROL_ID	NUMBER(10)	TRUE	FALSE	TRUE
    Integer attrId               //特性标识	ATTR_ID	NUMBER(10)	FALSE	FALSE	TRUE
    String  attrValue            //特性取值	ATTR_VALUE	varchar2(1000)	FALSE	FALSE	TRUE
    String  attrValueName        //特性值名称	ATTR_VALUE_NAME	varchar2(1000)	FALSE	FALSE	FALSE
    Integer passiveAttrId        //被关联特性标识	PASSIVE_ATTR_ID	NUMBER(10)	FALSE	FALSE	FALSE
    String  passiveAttrValue     //被关联特性的特性取值	PASSIVE_ATTR_VALUE	varchar2(1000)	FALSE	FALSE	FALSE
    String  viewState            //显示状态	VIEW_STATE	varchar2(2)	FALSE	FALSE	FALSE
    String  ctrlType             //关联类型	CTRL_TYPE	varchar2(10)	FALSE	FALSE	FALSE

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
