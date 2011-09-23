package com.mixedpower.domain

/**
 * 特性表（tb_cn_attribute）
 * @author daqing chen
 * @email  daqing15@gmail.com
 */
class FeatureAttribute {

    // Grails ORM 自动生成ID 特性标识	ATTR_ID	NUMBER(10)	TRUE	FALSE	TRUE
    //套餐id	OPER_ID	NUMBER(10)	FALSE	FALSE	TRUE
    //所属页面	PAGE_ID	NUMBER(10)	FALSE	FALSE	FALSE

    String attrName             //特性名称	ATTR_NAME	VARCHAR2(30)	FALSE	FALSE	TRUE
    String attrType             //特性类型	ATTR_TYPE	VARCHAR2(6)	FALSE	FALSE	TRUE
    String attrDataType         //特性值数据类型	ATTR_DATA_TYPE	VARCHAR2(6)	FALSE	FALSE	FALSE
    Integer attrLength           //特性值长度	ATTR_LENGTH	INTEGER	FALSE	FALSE	FALSE
    String attrNullable         //特性值是否可为空	ATTR_NULLABLE	VARCHAR2(6)	FALSE	FALSE	TRUE
    String attrDefaValue        //特性默认值	ATTR_DEFA_VALUE	VARCHAR2(1000)	FALSE	FALSE	FALSE
    String attrValueDesc        //特性取值描述	ATTR_VALUE_DESC	VARCHAR2(2000)	FALSE	FALSE	FALSE
    String propertyName         //java属性名称	PROPERTY_NAME	VARCHAR2(20)	FALSE	FALSE	FALSE
    String parseClass           //java解析类名	PARSE_CLASS	VARCHAR2(150)	FALSE	FALSE	FALSE
    Integer displayOrder         //显示顺序	DISPLAY_ORDER	INTEGER	FALSE	FALSE	FALSE
    String state                //状态	STATE	VARCHAR(6)	FALSE	FALSE	TRUE
    Date   createTime           //创建日期	CREATE_TIME	DATE	FALSE	FALSE	FALSE
    String modStaff             //修改人标识	MOD_STAFF	VARCHAR2(10)	FALSE	FALSE	FALSE
    Date   modTime              //修改日期	MOD_TIME	DATE	FALSE	FALSE	FALSE
    String remark               //备注	REMARK	VARCHAR(100)	FALSE	FALSE	FALSE
    String readOnly             //是否只读	READ_ONLY	VARCHAR2(2)	FALSE	FALSE	FALSE
    String confirmFlag          //确认验证标志	CONFIRM_FLAG	VARCHAR(6)	FALSE	FALSE	FALSE
    String valFrom              //取值来源	VAL_FROM	VARCHAR2(2)	FALSE	FALSE	FALSE
    String valClass             //取值class类	VAL_CLASS	VARCHAR2(100)	FALSE	FALSE	FALSE
    String optionFrom           //选项来源	OPTION_FROM	VARCHAR2(2)	FALSE	FALSE	FALSE
    String optionClass          //选项class类	OPTION_CLASS	VARCHAR2(100)	FALSE	FALSE	FALSE
    String layMode              //排列方式	LAY_MODE	VARCHAR2(2)	FALSE	FALSE	FALSE
    String patternXsl        //样式XSL	PATTERN_XSL	VARCHAR2(100)	FALSE	FALSE	FALSE
    String hiddenFlag           //是否隐藏	HIDDEN_FLAG	varchar2(2)	FALSE	FALSE	FALSE
    String maxChoice            //选项上限	MAX_CHOICE	varchar(4)	FALSE	FALSE	FALSE
    String minChoice            //选项下限	MIN_CHOICE	varchar2(4)	FALSE	FALSE	FALSE
    String maxLength            //最大长度	MAX_LENGTH	varchar2(4)	FALSE	FALSE	FALSE
    String minLength            //最小长度	MIN_LENGTH	varchar2(4)	FALSE	FALSE	FALSE
    String showState            //显示状态	SHOW_STATE	varchar2(2)	FALSE	FALSE	FALSE

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
