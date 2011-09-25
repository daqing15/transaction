package com.mixedpower.domain

/*
 * ҵ�����
 * ҵ����������Ϣ�� ��Ӧ��ҵ���ơ�ģ��ı�TB_OPERATION_INFO
 * @author daqing chen
*/
class Business implements Serializable{
		
	String operCode
	String latnId
	String operName
	String operDesc
	String descUrl                  //����url
	String ibssId 				    //ibss�Żݱ�ʶ
	String showCust					//�Ƿ���ʾ�ͻ���Ϣ
	String loginFlag                //��¼��ʶ
	String checkFlag				//������֤��־
	String nbrType					//�����������
	String agreeFlag				//�Ƿ���ʾЭ��
	String dealType					//�Ƿ�ʵʱ�����ʶ
	String convertType			    //ʵʱʧ��תԤ����
	String moreCheck				//���������֤
	String confirmFlag  		    //��д��Ϣȷ�ϱ�־
	String specialCheck 		    //���Ի�ҵ����֤
	String checkClass				//���Ի���֤��
	String referType				//�ύ������ʽ
	String ejbId					//ejb�� businessID
	String servClass				//ʵ���������
	String jspPath					//������д���Ի�jsp
	String jspConfirm				//����ȷ�ϸ��Ի�jsp
	String jspResult				//���������Ի�jsp
	String registerId				//Ȩ��ע���
	String linkNumber				//��ϵ�˺͵绰�ܷ�Ϊ��
	String state					//״̬
	String agreeUrl					//Э��ҳ��·��
	String servState				//�������״̬
	String manageFlag				//�Ƿ���Ҫ����
	String faceSys					//�����ϵͳ
	String prodId					//�����Ʒ��ʶ
	String custType					//����ͻ�����
	String subGroup					//�ͻ�ս����Ⱥ
	Date   createTime			    //����ʱ��
	String modStaff					//�޸���
	Date   modTime                  //�޸�ʱ��
	String belongOpenFlag 	        //�Ƿ�ͨ����
	String belongOpenClass 	        //��ͨ��
	String objType					//�����������
	String operSort					//ҵ�����
	String payType					//��������
	String linkCollect			    //�ɼ���ϵ��Ϣ
	String replyCollect			    //�ɼ��ظ���ַ
	String showCheckCode		    //��ʾ��֤��
	String isNeedAccount		    //�Ƿ���Ҫ�ʻ�
	String isNeedAddress		    //�Ƿ���Ҫװ����ַ
	String discCodeList			    //����Ʒ��ʶ��
		
		
    static constraints = {//TODO ���ֶ�Լ��
        operCode(blank: false)
        operName(blank: false)
        latnId(blank: false)

        descUrl(nullable: true)                  //����url
        ibssId(nullable: true) 				    //ibss�Żݱ�ʶ
        showCust(nullable: true)					//�Ƿ���ʾ�ͻ���Ϣ
        loginFlag(nullable: true)                //��¼��ʶ
        checkFlag(nullable: true)				//������֤��־
        nbrType(nullable: true)					//�����������
        agreeFlag(nullable: true)				//�Ƿ���ʾЭ��
        dealType(nullable: true)					//�Ƿ�ʵʱ�����ʶ
        convertType(nullable: true)			    //ʵʱʧ��תԤ����
        moreCheck(nullable: true)				//���������֤
        confirmFlag(nullable: true)  		    //��д��Ϣȷ�ϱ�־
        specialCheck(nullable: true) 		    //���Ի�ҵ����֤
        checkClass(nullable: true)				//���Ի���֤��
        referType(nullable: true)				//�ύ������ʽ
        ejbId(nullable: true)					//ejb�� businessID
        servClass(nullable: true)				//ʵ���������
        jspPath(nullable: true)					//������д���Ի�jsp
        jspConfirm(nullable: true)				//����ȷ�ϸ��Ի�jsp
        jspResult(nullable: true)				//���������Ի�jsp
        registerId(nullable: true)				//Ȩ��ע���
        linkNumber(nullable: true)				//��ϵ�˺͵绰�ܷ�Ϊ��
        state(nullable: true)					//״̬
        agreeUrl(nullable: true)					//Э��ҳ��·��
        servState(nullable: true)				//�������״̬
        manageFlag(nullable: true)				//�Ƿ���Ҫ����
        faceSys(nullable: true)					//�����ϵͳ
        prodId(nullable: true)					//�����Ʒ��ʶ
        custType(nullable: true)					//����ͻ�����
        subGroup(nullable: true)					//�ͻ�ս����Ⱥ
        createTime(nullable: true)					//����ʱ��
        modStaff(nullable: true)					//�޸���
        modTime(nullable: true)                    //�޸�ʱ��
        belongOpenFlag(nullable: true) 	        //�Ƿ�ͨ����
        belongOpenClass(nullable: true) 	        //��ͨ��
        objType(nullable: true)					//�����������
        operSort(nullable: true)					//ҵ�����
        payType(nullable: true)					//��������
        linkCollect(nullable: true)			    //�ɼ���ϵ��Ϣ
        replyCollect(nullable: true)			    //�ɼ��ظ���ַ
        showCheckCode(nullable: true)		    //��ʾ��֤��
        isNeedAccount(nullable: true)		    //�Ƿ���Ҫ�ʻ�
        isNeedAddress(nullable: true)		    //�Ƿ���Ҫװ����ַ
        discCodeList(nullable: true)			    //����Ʒ��ʶ��
    }

    static mapping = {
        version false
        table "tb_operation_info"
    }

    /*
    * ʵ�������ϵ����
    * */
    List bizPageList
    List bizExtendInfoList
    List bizNiceHints
    static hasMany = [bizPageList: BusinessPage, bizExtendInfoList: BizExtendInfo, bizNiceHints: BizNiceHint]

 }
