package com.mixedpower.domain

/**
 * 特性值编码取值表（tb_cn_attr_value）
 * DESC: 特性值编码取值表。用来描述不同的对象（产品、业务）对编码特性的取值范围。
 * PK_CN_ATTR_VALUE primary key (ATTR_VALUE_NAME, ATTR_VALUE, ATTR_ID)
 * @author daqing chen
 * @email  daqing15@gmail.com
 */
class FeatureAttrValue implements Serializable {

    //Grails ORM 自动生成ID编号	ID	NUMBER(10)	FALSE	FALSE	FALSE

    //特性标识	ATTR_ID	NUMBER(10)	TRUE	FALSE	TRUE
    String attrValueName            //特性值名称	ATTR_VALUE_NAME	varchar2(1000)	TRUE	FALSE	TRUE
    String attrValue                //特性取值	ATTR_VALUE	varchar2(1000)	TRUE	FALSE	TRUE
    Integer attrValueSeq            //特性取值序号	ATTR_VALUE_SEQ	INTEGER	FALSE	FALSE	FALSE
    String state                    //状态	STATE	varchar2(6)	FALSE	FALSE	FALSE
    String modStaff                 //修改人标识	MOD_STAFF	varchar2(20)	FALSE	FALSE	FALSE
    Date   modDate                  // 修改日期	MOD_DATE	DATE	FALSE	FALSE	FALSE
    String remark                   //备注	REMARK	VARCHAR2(100)	FALSE	FALSE	FALSE
    String ctrlAttr                 // default 'SOA' 特性显示控制	CTRL_ATTR	VARCHAR2(4)	FALSE	FALSE	FALSE
    String ctrlAttrValue            //特性值显示控制	CTRL_ATTR_VALUE	varchar2(4)	FALSE	FALSE	FALSE
    String valueState               //显示状态	VALUE_STATE	varchar2(2)	FALSE	FALSE	FALSE

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
