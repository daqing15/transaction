package com.mixedpower.domain.order

/**
 * ҵ�񶩵��� tb_order_info
 * ҵ����������
 * @author daqing chen
 * @email  daqing15@gmail.com
 */
class OrderInfo {

    //String orderNo                  //�������� primary key	ORDER_NO	varchar2(20)	TRUE	FALSE	TRUE
    String orderLatn                //��������	ORDER_LATN	varchar2(4)	FALSE	FALSE	TRUE
    String operCode                 //�ײͱ���	OPER_CODE	varchar2(20)	FALSE	FALSE	TRUE
    String userLatn                 //�ͻ���¼����	USER_LATN	varchar2(4)	FALSE	FALSE	TRUE
    String userId                   //�ͻ���¼����	USER_ID	varchar2(50)	FALSE	FALSE	FALSE
    String userLoginType            //�ͻ���¼����	USER_LOGIN_TYPE	VARCHAR2(10)	FALSE	FALSE	FALSE
    String custId                   //�ͻ���ʶ	CUST_ID	varchar2(20)	FALSE	FALSE	FALSE
    String custCode                 //�ͻ�����	CUST_CODE	varchar2(30)	FALSE	FALSE	FALSE
    String custName                 //�ͻ�����	CUST_NAME	varchar2(200)	FALSE	FALSE	FALSE
    String custType                 //�ͻ�����	CUST_TYPE	varchar2(4)	FALSE	FALSE	FALSE
    String certType                 //֤������	CERT_TYPE	varchar2(30)	FALSE	FALSE	FALSE
    String certId                   //֤������	CERT_ID	varchar2(30)	FALSE	FALSE	FALSE
    String agreementId              //Э����	AGREEMENT_ID	varchar2(20)	FALSE	FALSE	FALSE
    Date   createTime               //����ʱ��	CREATE_TIME	DATE	FALSE	FALSE	TRUE
    String state                    //״̬	STATE	varchar2(20)	FALSE	FALSE	TRUE
    String modStaff                 //�޸���	MOD_STAFF	varchar2(20)	FALSE	FALSE	FALSE
    Date   modTime                  //�޸�����	MOD_TIME	DATE	FALSE	FALSE	FALSE
    String auditContent             //������	AUDIT_CONTENT	CLOB	FALSE	FALSE	FALSE
    String dealContent              //�������	DEAL_CONTENT	CLOB	FALSE	FALSE	FALSE
    String feedBack                 //������Ϣ	FEEDBACK	CLOB	FALSE	FALSE	FALSE
    String auditStaff               //��˹���	AUDIT_STAFF	varchar2(30)	FALSE	FALSE	FALSE
    Date   auditTime                //���ʱ��	AUDIT_TIME	DATE	FALSE	FALSE	FALSE
    String dealStaff                //������	DEAL_STAFF	varchar2(30)	FALSE	FALSE	FALSE
    Date   dealTime                 //����ʱ��	DEAL_TIME	DATE	FALSE	FALSE	FALSE
    String isNewPhone               //�Ƿ���װ�̻��ͻ�	IS_NEW_PHONE	varchar2(4)	FALSE	FALSE	FALSE
    String isNewAdsl                //�Ƿ���װ����ͻ�	IS_NEW_ADSL	varchar2(4)	FALSE	FALSE	FALSE
    String orderNumber              //�������	ORDER_NUMBER	varchar2(30)	FALSE	FALSE	FALSE
    String orderNumtype             //�����������	ORDER_NUMTYPE	varchar2(10)	FALSE	FALSE	FALSE
    String replyPhsNbr              //�ظ�С��ͨ	REPLY_PHS_NBR	varchar2(20)	FALSE	FALSE	FALSE
    String replyEmail               //�ظ��ʼ�	REPLY_EMAIL	varchar2(40)	FALSE	FALSE	FALSE
    String failInfo                 //ʧ����Ϣ	FAIL_INFO	CLOB	FALSE	FALSE	FALSE
    String linkMan                  //��ϵ��	LINK_MAN	varchar2(30)	FALSE	FALSE	FALSE
    String linkPhone                //��ϵ�绰	LINK_PHONE	varchar2(20)	FALSE	FALSE	FALSE
    String ibState                  //IB����״̬	IB_STATE	varchar2(20)	FALSE	FALSE	FALSE
    String ibFinish                 //IB�������	IB_FINISH	VARCHAR2(20)	FALSE	FALSE	FALSE
    String ibOrderno                //IB������	IB_ORDERNO	varchar2(20)	FALSE	FALSE	FALSE
    String recommendMan             //�Ƽ���	RECOMMEND_MAN	varchar2(200)	FALSE	FALSE	FALSE
    String orderSource              //������Դ	ORDER_SOURCE	varchar2(2)	FALSE	FALSE	FALSE
    String opStaff                  //��ǰ������	OP_STAFF	varchar2(30)	FALSE	FALSE	FALSE
    String opState                  //����״̬	OP_STATE	varchar2(2)	FALSE	FALSE	FALSE
    Date   opTime                   //������ʼʱ��	OP_TIME	DATE	FALSE	FALSE	FALSE
    String userIp                   //�û�ip	USER_IP	varchar2(20)	FALSE	FALSE	FALSE
    String processId                //�����̵���	PROCESS_ID	varchar2(20)	FALSE	FALSE	FALSE
    String operType                 //��������	OPER_TYPE	VARCHAR2(4)	FALSE	FALSE	FALSE
    String brandBig                 //Ʒ�ƴ���	BRAND_BIG	VARCHAR2(10)	FALSE	FALSE	FALSE
    String brandSmall               //Ʒ��С��	BRAND_SMALL	VARCHAR2(10)	FALSE	FALSE	FALSE
    String dealType                 //����ʽ	DEAL_TYPE	VARCHAR2(2)	FALSE	FALSE	FALSE
    String ibShenqNo                //IB���뵥����	IB_SHENQ_NO	VARCHAR2(20)	FALSE	FALSE	FALSE
    String oncefee                  //һ���Է��ý��	ONCEFEE	VARCHAR2(20)	FALSE	FALSE	FALSE
    String oncefee_state            //һ���Է���״̬	ONCEFEE_STATE	VARCHAR2(10)	FALSE	FALSE	FALSE
    Date   ibCurstateDate           //IB��������ʱ��	IB_CURSTATE_DATE	DATE	FALSE	FALSE	FALSE
    String fromUrl                  //ҵ��������url	FROM_URL	VARCHAR2(200)	FALSE	FALSE	FALSE
    String deriveContent            //������ʾ����	DERIVE_CONTENT	CLOB	FALSE	FALSE	FALSE

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
 tb_order_info ��ṹ���ڵ�����,�����ֶζ�,������ʵ�ʵ�Ӧ����,�����Ͳ��ᱻʹ�õ�;
 ���ֶα�����ۺ���һ�ű�,���õ���,������һ�ű�����Ŵ��ֶ�
 ��like������Ӱ��,����ʹ��Lucene֮����������������������;
 ���ڻ����ֶδ��������String����,��ɴ��������кܶ�Ķ������������,��ѯ���ܿ��ܵ���
 ������,���Կ���������Ʊ����,��û������������ű�
 */
