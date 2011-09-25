package com.mixedpower.domain

/*
 * 业务对象
 * 业务主配置信息， 对应‘业务定制’模块的表TB_OPERATION_INFO
 * @author daqing chen
*/
class Business implements Serializable{
		
	String operCode
	String latnId
	String operName
	String operDesc
	String descUrl                  //描述url
	String ibssId 				    //ibss优惠标识
	String showCust					//是否显示客户信息
	String loginFlag                //登录标识
	String checkFlag				//快速验证标志
	String nbrType					//面向号码类型
	String agreeFlag				//是否显示协议
	String dealType					//是否实时受理标识
	String convertType			    //实时失败转预受理
	String moreCheck				//二次身份验证
	String confirmFlag  		    //填写信息确认标志
	String specialCheck 		    //个性化业务验证
	String checkClass				//个性化验证类
	String referType				//提交工单方式
	String ejbId					//ejb的 businessID
	String servClass				//实现类的名称
	String jspPath					//资料填写个性化jsp
	String jspConfirm				//资料确认个性化jsp
	String jspResult				//受理结果个性化jsp
	String registerId				//权限注册号
	String linkNumber				//联系人和电话能否为空
	String state					//状态
	String agreeUrl					//协议页面路径
	String servState				//号码服务状态
	String manageFlag				//是否需要处理
	String faceSys					//面向的系统
	String prodId					//面向产品标识
	String custType					//面向客户类型
	String subGroup					//客户战略子群
	Date   createTime			    //创建时间
	String modStaff					//修改者
	Date   modTime                  //修改时间
	String belongOpenFlag 	        //是否开通功能
	String belongOpenClass 	        //开通类
	String objType					//受理对象类型
	String operSort					//业务分类
	String payType					//付费类型
	String linkCollect			    //采集联系信息
	String replyCollect			    //采集回复地址
	String showCheckCode		    //显示验证码
	String isNeedAccount		    //是否需要帐户
	String isNeedAddress		    //是否需要装机地址
	String discCodeList			    //销售品标识串
		
		
    static constraints = {//TODO 加字段约束
        operCode(blank: false)
        operName(blank: false)
        latnId(blank: false)

        descUrl(nullable: true)                  //描述url
        ibssId(nullable: true) 				    //ibss优惠标识
        showCust(nullable: true)					//是否显示客户信息
        loginFlag(nullable: true)                //登录标识
        checkFlag(nullable: true)				//快速验证标志
        nbrType(nullable: true)					//面向号码类型
        agreeFlag(nullable: true)				//是否显示协议
        dealType(nullable: true)					//是否实时受理标识
        convertType(nullable: true)			    //实时失败转预受理
        moreCheck(nullable: true)				//二次身份验证
        confirmFlag(nullable: true)  		    //填写信息确认标志
        specialCheck(nullable: true) 		    //个性化业务验证
        checkClass(nullable: true)				//个性化验证类
        referType(nullable: true)				//提交工单方式
        ejbId(nullable: true)					//ejb的 businessID
        servClass(nullable: true)				//实现类的名称
        jspPath(nullable: true)					//资料填写个性化jsp
        jspConfirm(nullable: true)				//资料确认个性化jsp
        jspResult(nullable: true)				//受理结果个性化jsp
        registerId(nullable: true)				//权限注册号
        linkNumber(nullable: true)				//联系人和电话能否为空
        state(nullable: true)					//状态
        agreeUrl(nullable: true)					//协议页面路径
        servState(nullable: true)				//号码服务状态
        manageFlag(nullable: true)				//是否需要处理
        faceSys(nullable: true)					//面向的系统
        prodId(nullable: true)					//面向产品标识
        custType(nullable: true)					//面向客户类型
        subGroup(nullable: true)					//客户战略子群
        createTime(nullable: true)					//创建时间
        modStaff(nullable: true)					//修改者
        modTime(nullable: true)                    //修改时间
        belongOpenFlag(nullable: true) 	        //是否开通功能
        belongOpenClass(nullable: true) 	        //开通类
        objType(nullable: true)					//受理对象类型
        operSort(nullable: true)					//业务分类
        payType(nullable: true)					//付费类型
        linkCollect(nullable: true)			    //采集联系信息
        replyCollect(nullable: true)			    //采集回复地址
        showCheckCode(nullable: true)		    //显示验证码
        isNeedAccount(nullable: true)		    //是否需要帐户
        isNeedAddress(nullable: true)		    //是否需要装机地址
        discCodeList(nullable: true)			    //销售品标识串
    }

    static mapping = {
        version false
        table "tb_operation_info"
    }

    /*
    * 实体关联关系设置
    * */
    List bizPageList
    List bizExtendInfoList
    List bizNiceHints
    static hasMany = [bizPageList: BusinessPage, bizExtendInfoList: BizExtendInfo, bizNiceHints: BizNiceHint]

 }
