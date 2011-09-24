package com.mixedpower.domain.order

/**
 * 业务订单表 tb_order_info
 * 业务主订单表
 * @author daqing chen
 * @email  daqing15@gmail.com
 */
class OrderInfo {

    //String orderNo                  //订单编码 primary key	ORDER_NO	varchar2(20)	TRUE	FALSE	TRUE
    String orderLatn                //订单地区	ORDER_LATN	varchar2(4)	FALSE	FALSE	TRUE
    String operCode                 //套餐编码	OPER_CODE	varchar2(20)	FALSE	FALSE	TRUE
    String userLatn                 //客户登录地区	USER_LATN	varchar2(4)	FALSE	FALSE	TRUE
    String userId                   //客户登录号码	USER_ID	varchar2(50)	FALSE	FALSE	FALSE
    String userLoginType            //客户登录类型	USER_LOGIN_TYPE	VARCHAR2(10)	FALSE	FALSE	FALSE
    String custId                   //客户标识	CUST_ID	varchar2(20)	FALSE	FALSE	FALSE
    String custCode                 //客户编码	CUST_CODE	varchar2(30)	FALSE	FALSE	FALSE
    String custName                 //客户名称	CUST_NAME	varchar2(200)	FALSE	FALSE	FALSE
    String custType                 //客户类型	CUST_TYPE	varchar2(4)	FALSE	FALSE	FALSE
    String certType                 //证件类型	CERT_TYPE	varchar2(30)	FALSE	FALSE	FALSE
    String certId                   //证件号码	CERT_ID	varchar2(30)	FALSE	FALSE	FALSE
    String agreementId              //协议编号	AGREEMENT_ID	varchar2(20)	FALSE	FALSE	FALSE
    Date   createTime               //受理时间	CREATE_TIME	DATE	FALSE	FALSE	TRUE
    String state                    //状态	STATE	varchar2(20)	FALSE	FALSE	TRUE
    String modStaff                 //修改人	MOD_STAFF	varchar2(20)	FALSE	FALSE	FALSE
    Date   modTime                  //修改日期	MOD_TIME	DATE	FALSE	FALSE	FALSE
    String auditContent             //审核意见	AUDIT_CONTENT	CLOB	FALSE	FALSE	FALSE
    String dealContent              //处理意见	DEAL_CONTENT	CLOB	FALSE	FALSE	FALSE
    String feedBack                 //反馈信息	FEEDBACK	CLOB	FALSE	FALSE	FALSE
    String auditStaff               //审核工号	AUDIT_STAFF	varchar2(30)	FALSE	FALSE	FALSE
    Date   auditTime                //审核时间	AUDIT_TIME	DATE	FALSE	FALSE	FALSE
    String dealStaff                //处理工号	DEAL_STAFF	varchar2(30)	FALSE	FALSE	FALSE
    Date   dealTime                 //处理时间	DEAL_TIME	DATE	FALSE	FALSE	FALSE
    String isNewPhone               //是否新装固话客户	IS_NEW_PHONE	varchar2(4)	FALSE	FALSE	FALSE
    String isNewAdsl                //是否新装宽带客户	IS_NEW_ADSL	varchar2(4)	FALSE	FALSE	FALSE
    String orderNumber              //办理号码	ORDER_NUMBER	varchar2(30)	FALSE	FALSE	FALSE
    String orderNumtype             //办理号码类型	ORDER_NUMTYPE	varchar2(10)	FALSE	FALSE	FALSE
    String replyPhsNbr              //回复小灵通	REPLY_PHS_NBR	varchar2(20)	FALSE	FALSE	FALSE
    String replyEmail               //回复邮件	REPLY_EMAIL	varchar2(40)	FALSE	FALSE	FALSE
    String failInfo                 //失败信息	FAIL_INFO	CLOB	FALSE	FALSE	FALSE
    String linkMan                  //联系人	LINK_MAN	varchar2(30)	FALSE	FALSE	FALSE
    String linkPhone                //联系电话	LINK_PHONE	varchar2(20)	FALSE	FALSE	FALSE
    String ibState                  //IB工单状态	IB_STATE	varchar2(20)	FALSE	FALSE	FALSE
    String ibFinish                 //IB受理完成	IB_FINISH	VARCHAR2(20)	FALSE	FALSE	FALSE
    String ibOrderno                //IB工单号	IB_ORDERNO	varchar2(20)	FALSE	FALSE	FALSE
    String recommendMan             //推荐人	RECOMMEND_MAN	varchar2(200)	FALSE	FALSE	FALSE
    String orderSource              //工单来源	ORDER_SOURCE	varchar2(2)	FALSE	FALSE	FALSE
    String opStaff                  //当前操作人	OP_STAFF	varchar2(30)	FALSE	FALSE	FALSE
    String opState                  //操作状态	OP_STATE	varchar2(2)	FALSE	FALSE	FALSE
    Date   opTime                   //操作开始时间	OP_TIME	DATE	FALSE	FALSE	FALSE
    String userIp                   //用户ip	USER_IP	varchar2(20)	FALSE	FALSE	FALSE
    String processId                //总流程单号	PROCESS_ID	varchar2(20)	FALSE	FALSE	FALSE
    String operType                 //工单类型	OPER_TYPE	VARCHAR2(4)	FALSE	FALSE	FALSE
    String brandBig                 //品牌大类	BRAND_BIG	VARCHAR2(10)	FALSE	FALSE	FALSE
    String brandSmall               //品牌小类	BRAND_SMALL	VARCHAR2(10)	FALSE	FALSE	FALSE
    String dealType                 //受理方式	DEAL_TYPE	VARCHAR2(2)	FALSE	FALSE	FALSE
    String ibShenqNo                //IB申请单编码	IB_SHENQ_NO	VARCHAR2(20)	FALSE	FALSE	FALSE
    String oncefee                  //一次性费用金额	ONCEFEE	VARCHAR2(20)	FALSE	FALSE	FALSE
    String oncefee_state            //一次性费用状态	ONCEFEE_STATE	VARCHAR2(10)	FALSE	FALSE	FALSE
    Date   ibCurstateDate           //IB工单竣工时间	IB_CURSTATE_DATE	DATE	FALSE	FALSE	FALSE
    String fromUrl                  //业务办理入口url	FROM_URL	VARCHAR2(200)	FALSE	FALSE	FALSE
    String deriveContent            //派生提示内容	DERIVE_CONTENT	CLOB	FALSE	FALSE	FALSE

    static constraints = {
        orderLatn(blank: false)
        operCode(blank: false)
        userLatn(blank: false)
        createTime(blank: false)
        state(blank: false)

        userId(nullable: true)
        userLoginType(nullable: true)
        custId(nullable: true)
        custCode(nullable: true)
        custName(nullable: true)
        custType(nullable: true)
        certType(nullable: true)
        certId(nullable: true)
        agreementId(nullable: true)
        modStaff(nullable: true)
        modTime(nullable: true)
        auditContent(nullable: true)
        dealContent(nullable: true)
        feedBack(nullable: true)
        auditStaff(nullable: true)
        auditTime(nullable: true)
        dealStaff(nullable: true)
        dealTime(nullable: true)
        isNewPhone(nullable: true) //default 'N'
        isNewAdsl(nullable: true)  //default 'n'
        orderNumber(nullable: true)
        orderNumtype(nullable: true)
        replyEmail(nullable: true)
        replyPhsNbr(nullable: true)
        failInfo(nullable: true)
        linkMan(nullable: true)
        linkPhone(nullable: true)
        ibState(nullable: true)
        ibFinish(nullable: true)
        ibOrderno(nullable: true)
        recommendMan(nullable: true)
        orderSource(nullable: true)
        opStaff(nullable: true)
        opState(nullable: true)
        opTime(nullable: true)
        userIp(nullable: true)
        processId(nullable: true)
        operType(nullable: true)
        brandBig(nullable: true)
        brandSmall(nullable: true)
        dealType(nullable: true)
        ibShenqNo(nullable: true)
        oncefee(nullable: true)
        oncefee_state(nullable: true)
        ibCurstateDate(nullable: true)
        fromUrl(nullable: true)
        deriveContent(nullable: true)
    }

    List orderDetails
    static hasMany = [orderDetails:OrderDetail]

    static mapping = {
        version false
        table "tb_order_info"
        id generator:"assigned", column: "order_no", type: 'string', index: 'ORDER_INFO_ORDER_NO_INDEX'
    }
}
/*
 tb_order_info 表结构存在的问题,冗余字段多,可能在实际的应用中,根本就不会被使用到;
 大字段被设计糅合在一张表,更好的是,另外存放一张表来存放大字段
 对like操作的影响,建议使用Lucene之类第三方的搜索引擎来完成;
 由于基本字段大多数都是String类型,造成创建索引有很多的额外的性能消耗,查询性能可能低下
 基本上,可以看出当初设计表的人,并没有认真设计这张表
 */
