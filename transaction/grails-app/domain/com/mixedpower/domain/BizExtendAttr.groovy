package com.mixedpower.domain

/*
 *业务扩展信息属性定义
 *Table -> tb_operation_ex_define
 * @author daqing chen
*/
class BizExtendAttr implements Serializable {
	
	String attrName			//显示名称
	String attrType			//属性类型
	String propertyName		//属性名称
	String attrDesc			//属性说明
	String attrLength		//属性值长度
	String checkClass		//验证插件类
	String sortOrder		//排列顺序
	String state			//状态
	Date createTime			//创建时间
	String createStaff		//创建者
	Date modTime			//修改时间
	String modStaff			//修改者

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
