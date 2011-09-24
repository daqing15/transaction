<%@ page import="com.mixedpower.domain.Business" %>



<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'operCode', 'error')} required">
    <label for="operCode">
        <g:message code="business.operCode.label" default="Oper Code"/>
        <span class="required-indicator">*</span>
    </label>
    <g:textField name="operCode" required="" value="${businessInstance?.operCode}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'operName', 'error')} required">
    <label for="operName">
        <g:message code="business.operName.label" default="Oper Name"/>
        <span class="required-indicator">*</span>
    </label>
    <g:textField name="operName" required="" value="${businessInstance?.operName}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'latnId', 'error')} required">
    <label for="latnId">
        <g:message code="business.latnId.label" default="Latn Id"/>
        <span class="required-indicator">*</span>
    </label>
    <g:textField name="latnId" required="" value="${businessInstance?.latnId}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'descUrl', 'error')} ">
    <label for="descUrl">
        <g:message code="business.descUrl.label" default="Desc Url"/>

    </label>
    <g:textField name="descUrl" value="${businessInstance?.descUrl}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'ibssId', 'error')} ">
    <label for="ibssId">
        <g:message code="business.ibssId.label" default="Ibss Id"/>

    </label>
    <g:textField name="ibssId" value="${businessInstance?.ibssId}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'showCust', 'error')} ">
    <label for="showCust">
        <g:message code="business.showCust.label" default="Show Cust"/>

    </label>
    <g:textField name="showCust" value="${businessInstance?.showCust}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'loginFlag', 'error')} ">
    <label for="loginFlag">
        <g:message code="business.loginFlag.label" default="Login Flag"/>

    </label>
    <g:textField name="loginFlag" value="${businessInstance?.loginFlag}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'checkFlag', 'error')} ">
    <label for="checkFlag">
        <g:message code="business.checkFlag.label" default="Check Flag"/>

    </label>
    <g:textField name="checkFlag" value="${businessInstance?.checkFlag}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'nbrType', 'error')} ">
    <label for="nbrType">
        <g:message code="business.nbrType.label" default="Nbr Type"/>

    </label>
    <g:textField name="nbrType" value="${businessInstance?.nbrType}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'agreeFlag', 'error')} ">
    <label for="agreeFlag">
        <g:message code="business.agreeFlag.label" default="Agree Flag"/>

    </label>
    <g:textField name="agreeFlag" value="${businessInstance?.agreeFlag}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'dealType', 'error')} ">
    <label for="dealType">
        <g:message code="business.dealType.label" default="Deal Type"/>

    </label>
    <g:textField name="dealType" value="${businessInstance?.dealType}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'convertType', 'error')} ">
    <label for="convertType">
        <g:message code="business.convertType.label" default="Convert Type"/>

    </label>
    <g:textField name="convertType" value="${businessInstance?.convertType}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'moreCheck', 'error')} ">
    <label for="moreCheck">
        <g:message code="business.moreCheck.label" default="More Check"/>

    </label>
    <g:textField name="moreCheck" value="${businessInstance?.moreCheck}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'confirmFlag', 'error')} ">
    <label for="confirmFlag">
        <g:message code="business.confirmFlag.label" default="Confirm Flag"/>

    </label>
    <g:textField name="confirmFlag" value="${businessInstance?.confirmFlag}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'specialCheck', 'error')} ">
    <label for="specialCheck">
        <g:message code="business.specialCheck.label" default="Special Check"/>

    </label>
    <g:textField name="specialCheck" value="${businessInstance?.specialCheck}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'checkClass', 'error')} ">
    <label for="checkClass">
        <g:message code="business.checkClass.label" default="Check Class"/>

    </label>
    <g:textField name="checkClass" value="${businessInstance?.checkClass}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'referType', 'error')} ">
    <label for="referType">
        <g:message code="business.referType.label" default="Refer Type"/>

    </label>
    <g:textField name="referType" value="${businessInstance?.referType}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'ejbId', 'error')} ">
    <label for="ejbId">
        <g:message code="business.ejbId.label" default="Ejb Id"/>

    </label>
    <g:textField name="ejbId" value="${businessInstance?.ejbId}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'servClass', 'error')} ">
    <label for="servClass">
        <g:message code="business.servClass.label" default="Serv Class"/>

    </label>
    <g:textField name="servClass" value="${businessInstance?.servClass}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'jspPath', 'error')} ">
    <label for="jspPath">
        <g:message code="business.jspPath.label" default="Jsp Path"/>

    </label>
    <g:textField name="jspPath" value="${businessInstance?.jspPath}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'jspConfirm', 'error')} ">
    <label for="jspConfirm">
        <g:message code="business.jspConfirm.label" default="Jsp Confirm"/>

    </label>
    <g:textField name="jspConfirm" value="${businessInstance?.jspConfirm}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'jspResult', 'error')} ">
    <label for="jspResult">
        <g:message code="business.jspResult.label" default="Jsp Result"/>

    </label>
    <g:textField name="jspResult" value="${businessInstance?.jspResult}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'registerId', 'error')} ">
    <label for="registerId">
        <g:message code="business.registerId.label" default="Register Id"/>

    </label>
    <g:textField name="registerId" value="${businessInstance?.registerId}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'linkNumber', 'error')} ">
    <label for="linkNumber">
        <g:message code="business.linkNumber.label" default="Link Number"/>

    </label>
    <g:textField name="linkNumber" value="${businessInstance?.linkNumber}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'state', 'error')} ">
    <label for="state">
        <g:message code="business.state.label" default="State"/>

    </label>
    <g:textField name="state" value="${businessInstance?.state}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'agreeUrl', 'error')} ">
    <label for="agreeUrl">
        <g:message code="business.agreeUrl.label" default="Agree Url"/>

    </label>
    <g:textField name="agreeUrl" value="${businessInstance?.agreeUrl}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'servState', 'error')} ">
    <label for="servState">
        <g:message code="business.servState.label" default="Serv State"/>

    </label>
    <g:textField name="servState" value="${businessInstance?.servState}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'manageFlag', 'error')} ">
    <label for="manageFlag">
        <g:message code="business.manageFlag.label" default="Manage Flag"/>

    </label>
    <g:textField name="manageFlag" value="${businessInstance?.manageFlag}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'faceSys', 'error')} ">
    <label for="faceSys">
        <g:message code="business.faceSys.label" default="Face Sys"/>

    </label>
    <g:textField name="faceSys" value="${businessInstance?.faceSys}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'prodId', 'error')} ">
    <label for="prodId">
        <g:message code="business.prodId.label" default="Prod Id"/>

    </label>
    <g:textField name="prodId" value="${businessInstance?.prodId}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'custType', 'error')} ">
    <label for="custType">
        <g:message code="business.custType.label" default="Cust Type"/>

    </label>
    <g:textField name="custType" value="${businessInstance?.custType}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'subGroup', 'error')} ">
    <label for="subGroup">
        <g:message code="business.subGroup.label" default="Sub Group"/>

    </label>
    <g:textField name="subGroup" value="${businessInstance?.subGroup}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'createTime', 'error')} ">
    <label for="createTime">
        <g:message code="business.createTime.label" default="Create Time"/>

    </label>
    <g:datePicker name="createTime" precision="day" value="${businessInstance?.createTime}" default="none"
                  noSelection="['': '']"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'modStaff', 'error')} ">
    <label for="modStaff">
        <g:message code="business.modStaff.label" default="Mod Staff"/>

    </label>
    <g:textField name="modStaff" value="${businessInstance?.modStaff}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'modTime', 'error')} ">
    <label for="modTime">
        <g:message code="business.modTime.label" default="Mod Time"/>

    </label>
    <g:datePicker name="modTime" precision="day" value="${businessInstance?.modTime}" default="none"
                  noSelection="['': '']"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'belongOpenFlag', 'error')} ">
    <label for="belongOpenFlag">
        <g:message code="business.belongOpenFlag.label" default="Belong Open Flag"/>

    </label>
    <g:textField name="belongOpenFlag" value="${businessInstance?.belongOpenFlag}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'belongOpenClass', 'error')} ">
    <label for="belongOpenClass">
        <g:message code="business.belongOpenClass.label" default="Belong Open Class"/>

    </label>
    <g:textField name="belongOpenClass" value="${businessInstance?.belongOpenClass}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'objType', 'error')} ">
    <label for="objType">
        <g:message code="business.objType.label" default="Obj Type"/>

    </label>
    <g:textField name="objType" value="${businessInstance?.objType}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'operSort', 'error')} ">
    <label for="operSort">
        <g:message code="business.operSort.label" default="Oper Sort"/>

    </label>
    <g:textField name="operSort" value="${businessInstance?.operSort}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'payType', 'error')} ">
    <label for="payType">
        <g:message code="business.payType.label" default="Pay Type"/>

    </label>
    <g:textField name="payType" value="${businessInstance?.payType}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'linkCollect', 'error')} ">
    <label for="linkCollect">
        <g:message code="business.linkCollect.label" default="Link Collect"/>

    </label>
    <g:textField name="linkCollect" value="${businessInstance?.linkCollect}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'replyCollect', 'error')} ">
    <label for="replyCollect">
        <g:message code="business.replyCollect.label" default="Reply Collect"/>

    </label>
    <g:textField name="replyCollect" value="${businessInstance?.replyCollect}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'showCheckCode', 'error')} ">
    <label for="showCheckCode">
        <g:message code="business.showCheckCode.label" default="Show Check Code"/>

    </label>
    <g:textField name="showCheckCode" value="${businessInstance?.showCheckCode}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'isNeedAccount', 'error')} ">
    <label for="isNeedAccount">
        <g:message code="business.isNeedAccount.label" default="Is Need Account"/>

    </label>
    <g:textField name="isNeedAccount" value="${businessInstance?.isNeedAccount}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'isNeedAddress', 'error')} ">
    <label for="isNeedAddress">
        <g:message code="business.isNeedAddress.label" default="Is Need Address"/>

    </label>
    <g:textField name="isNeedAddress" value="${businessInstance?.isNeedAddress}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'discCodeList', 'error')} ">
    <label for="discCodeList">
        <g:message code="business.discCodeList.label" default="Disc Code List"/>

    </label>
    <g:textField name="discCodeList" value="${businessInstance?.discCodeList}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'bizExtendInfoList', 'error')} ">
    <label for="bizExtendInfoList">
        <g:message code="business.bizExtendInfoList.label" default="Biz Extend Info List"/>

    </label>

    <ul class="one-to-many">
        <g:each in="${businessInstance?.bizExtendInfoList?}" var="b">
            <li><g:link controller="bizExtendInfo" action="show" id="${b.id}">${b?.encodeAsHTML()}</g:link></li>
        </g:each>
        <li class="add">
            <g:link controller="bizExtendInfo" action="create"
                    params="['business.id': businessInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'bizExtendInfo.label', default: 'BizExtendInfo')])}</g:link>
        </li>
    </ul>

</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'bizNiceHints', 'error')} ">
    <label for="bizNiceHints">
        <g:message code="business.bizNiceHints.label" default="Biz Nice Hints"/>

    </label>
    <g:select name="bizNiceHints" from="${com.mixedpower.domain.BizNiceHint.list()}" multiple="multiple" optionKey="id"
              size="5" value="${businessInstance?.bizNiceHints*.id}" class="many-to-many"/>
</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'bizPageList', 'error')} ">
    <label for="bizPageList">
        <g:message code="business.bizPageList.label" default="Biz Page List"/>

    </label>

    <ul class="one-to-many">
        <g:each in="${businessInstance?.bizPageList?}" var="b">
            <li><g:link controller="businessPage" action="show" id="${b.id}">${b?.encodeAsHTML()}</g:link></li>
        </g:each>
        <li class="add">
            <g:link controller="businessPage" action="create"
                    params="['business.id': businessInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'businessPage.label', default: 'BusinessPage')])}</g:link>
        </li>
    </ul>

</div>

<div class="fieldcontain ${hasErrors(bean: businessInstance, field: 'operDesc', 'error')} ">
    <label for="operDesc">
        <g:message code="business.operDesc.label" default="Oper Desc"/>

    </label>
    <g:textField name="operDesc" value="${businessInstance?.operDesc}"/>
</div>

