<%@ page import="com.mixedpower.domain.Business" %>
<!doctype html>
<html>
<head>
    <meta name="layout" content="main">
    <g:set var="entityName" value="${message(code: 'business.label', default: 'Business')}"/>
    <title><g:message code="default.show.label" args="[entityName]"/></title>
</head>

<body>
<a href="#show-business" class="skip" tabindex="-1"><g:message code="default.link.skip.label"
                                                               default="Skip to content&hellip;"/></a>

<div class="nav" role="navigation">
    <ul>
        <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
        <li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]"/></g:link></li>
        <li><g:link class="create" action="create"><g:message code="default.new.label"
                                                              args="[entityName]"/></g:link></li>
    </ul>
</div>

<div id="show-business" class="content scaffold-show" role="main">
<h1><g:message code="default.show.label" args="[entityName]"/></h1>
<g:if test="${flash.message}">
    <div class="message" role="status">${flash.message}</div>
</g:if>
<ol class="property-list business">

<g:if test="${businessInstance?.operCode}">
    <li class="fieldcontain">
        <span id="operCode-label" class="property-label"><g:message code="business.operCode.label"
                                                                    default="Oper Code"/></span>

        <span class="property-value" aria-labelledby="operCode-label"><g:fieldValue bean="${businessInstance}"
                                                                                    field="operCode"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.operName}">
    <li class="fieldcontain">
        <span id="operName-label" class="property-label"><g:message code="business.operName.label"
                                                                    default="Oper Name"/></span>

        <span class="property-value" aria-labelledby="operName-label"><g:fieldValue bean="${businessInstance}"
                                                                                    field="operName"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.latnId}">
    <li class="fieldcontain">
        <span id="latnId-label" class="property-label"><g:message code="business.latnId.label"
                                                                  default="Latn Id"/></span>

        <span class="property-value" aria-labelledby="latnId-label"><g:fieldValue bean="${businessInstance}"
                                                                                  field="latnId"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.descUrl}">
    <li class="fieldcontain">
        <span id="descUrl-label" class="property-label"><g:message code="business.descUrl.label"
                                                                   default="Desc Url"/></span>

        <span class="property-value" aria-labelledby="descUrl-label"><g:fieldValue bean="${businessInstance}"
                                                                                   field="descUrl"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.ibssId}">
    <li class="fieldcontain">
        <span id="ibssId-label" class="property-label"><g:message code="business.ibssId.label"
                                                                  default="Ibss Id"/></span>

        <span class="property-value" aria-labelledby="ibssId-label"><g:fieldValue bean="${businessInstance}"
                                                                                  field="ibssId"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.showCust}">
    <li class="fieldcontain">
        <span id="showCust-label" class="property-label"><g:message code="business.showCust.label"
                                                                    default="Show Cust"/></span>

        <span class="property-value" aria-labelledby="showCust-label"><g:fieldValue bean="${businessInstance}"
                                                                                    field="showCust"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.loginFlag}">
    <li class="fieldcontain">
        <span id="loginFlag-label" class="property-label"><g:message code="business.loginFlag.label"
                                                                     default="Login Flag"/></span>

        <span class="property-value" aria-labelledby="loginFlag-label"><g:fieldValue bean="${businessInstance}"
                                                                                     field="loginFlag"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.checkFlag}">
    <li class="fieldcontain">
        <span id="checkFlag-label" class="property-label"><g:message code="business.checkFlag.label"
                                                                     default="Check Flag"/></span>

        <span class="property-value" aria-labelledby="checkFlag-label"><g:fieldValue bean="${businessInstance}"
                                                                                     field="checkFlag"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.nbrType}">
    <li class="fieldcontain">
        <span id="nbrType-label" class="property-label"><g:message code="business.nbrType.label"
                                                                   default="Nbr Type"/></span>

        <span class="property-value" aria-labelledby="nbrType-label"><g:fieldValue bean="${businessInstance}"
                                                                                   field="nbrType"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.agreeFlag}">
    <li class="fieldcontain">
        <span id="agreeFlag-label" class="property-label"><g:message code="business.agreeFlag.label"
                                                                     default="Agree Flag"/></span>

        <span class="property-value" aria-labelledby="agreeFlag-label"><g:fieldValue bean="${businessInstance}"
                                                                                     field="agreeFlag"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.dealType}">
    <li class="fieldcontain">
        <span id="dealType-label" class="property-label"><g:message code="business.dealType.label"
                                                                    default="Deal Type"/></span>

        <span class="property-value" aria-labelledby="dealType-label"><g:fieldValue bean="${businessInstance}"
                                                                                    field="dealType"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.convertType}">
    <li class="fieldcontain">
        <span id="convertType-label" class="property-label"><g:message code="business.convertType.label"
                                                                       default="Convert Type"/></span>

        <span class="property-value" aria-labelledby="convertType-label"><g:fieldValue bean="${businessInstance}"
                                                                                       field="convertType"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.moreCheck}">
    <li class="fieldcontain">
        <span id="moreCheck-label" class="property-label"><g:message code="business.moreCheck.label"
                                                                     default="More Check"/></span>

        <span class="property-value" aria-labelledby="moreCheck-label"><g:fieldValue bean="${businessInstance}"
                                                                                     field="moreCheck"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.confirmFlag}">
    <li class="fieldcontain">
        <span id="confirmFlag-label" class="property-label"><g:message code="business.confirmFlag.label"
                                                                       default="Confirm Flag"/></span>

        <span class="property-value" aria-labelledby="confirmFlag-label"><g:fieldValue bean="${businessInstance}"
                                                                                       field="confirmFlag"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.specialCheck}">
    <li class="fieldcontain">
        <span id="specialCheck-label" class="property-label"><g:message code="business.specialCheck.label"
                                                                        default="Special Check"/></span>

        <span class="property-value" aria-labelledby="specialCheck-label"><g:fieldValue bean="${businessInstance}"
                                                                                        field="specialCheck"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.checkClass}">
    <li class="fieldcontain">
        <span id="checkClass-label" class="property-label"><g:message code="business.checkClass.label"
                                                                      default="Check Class"/></span>

        <span class="property-value" aria-labelledby="checkClass-label"><g:fieldValue bean="${businessInstance}"
                                                                                      field="checkClass"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.referType}">
    <li class="fieldcontain">
        <span id="referType-label" class="property-label"><g:message code="business.referType.label"
                                                                     default="Refer Type"/></span>

        <span class="property-value" aria-labelledby="referType-label"><g:fieldValue bean="${businessInstance}"
                                                                                     field="referType"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.ejbId}">
    <li class="fieldcontain">
        <span id="ejbId-label" class="property-label"><g:message code="business.ejbId.label" default="Ejb Id"/></span>

        <span class="property-value" aria-labelledby="ejbId-label"><g:fieldValue bean="${businessInstance}"
                                                                                 field="ejbId"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.servClass}">
    <li class="fieldcontain">
        <span id="servClass-label" class="property-label"><g:message code="business.servClass.label"
                                                                     default="Serv Class"/></span>

        <span class="property-value" aria-labelledby="servClass-label"><g:fieldValue bean="${businessInstance}"
                                                                                     field="servClass"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.jspPath}">
    <li class="fieldcontain">
        <span id="jspPath-label" class="property-label"><g:message code="business.jspPath.label"
                                                                   default="Jsp Path"/></span>

        <span class="property-value" aria-labelledby="jspPath-label"><g:fieldValue bean="${businessInstance}"
                                                                                   field="jspPath"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.jspConfirm}">
    <li class="fieldcontain">
        <span id="jspConfirm-label" class="property-label"><g:message code="business.jspConfirm.label"
                                                                      default="Jsp Confirm"/></span>

        <span class="property-value" aria-labelledby="jspConfirm-label"><g:fieldValue bean="${businessInstance}"
                                                                                      field="jspConfirm"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.jspResult}">
    <li class="fieldcontain">
        <span id="jspResult-label" class="property-label"><g:message code="business.jspResult.label"
                                                                     default="Jsp Result"/></span>

        <span class="property-value" aria-labelledby="jspResult-label"><g:fieldValue bean="${businessInstance}"
                                                                                     field="jspResult"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.registerId}">
    <li class="fieldcontain">
        <span id="registerId-label" class="property-label"><g:message code="business.registerId.label"
                                                                      default="Register Id"/></span>

        <span class="property-value" aria-labelledby="registerId-label"><g:fieldValue bean="${businessInstance}"
                                                                                      field="registerId"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.linkNumber}">
    <li class="fieldcontain">
        <span id="linkNumber-label" class="property-label"><g:message code="business.linkNumber.label"
                                                                      default="Link Number"/></span>

        <span class="property-value" aria-labelledby="linkNumber-label"><g:fieldValue bean="${businessInstance}"
                                                                                      field="linkNumber"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.state}">
    <li class="fieldcontain">
        <span id="state-label" class="property-label"><g:message code="business.state.label" default="State"/></span>

        <span class="property-value" aria-labelledby="state-label"><g:fieldValue bean="${businessInstance}"
                                                                                 field="state"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.agreeUrl}">
    <li class="fieldcontain">
        <span id="agreeUrl-label" class="property-label"><g:message code="business.agreeUrl.label"
                                                                    default="Agree Url"/></span>

        <span class="property-value" aria-labelledby="agreeUrl-label"><g:fieldValue bean="${businessInstance}"
                                                                                    field="agreeUrl"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.servState}">
    <li class="fieldcontain">
        <span id="servState-label" class="property-label"><g:message code="business.servState.label"
                                                                     default="Serv State"/></span>

        <span class="property-value" aria-labelledby="servState-label"><g:fieldValue bean="${businessInstance}"
                                                                                     field="servState"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.manageFlag}">
    <li class="fieldcontain">
        <span id="manageFlag-label" class="property-label"><g:message code="business.manageFlag.label"
                                                                      default="Manage Flag"/></span>

        <span class="property-value" aria-labelledby="manageFlag-label"><g:fieldValue bean="${businessInstance}"
                                                                                      field="manageFlag"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.faceSys}">
    <li class="fieldcontain">
        <span id="faceSys-label" class="property-label"><g:message code="business.faceSys.label"
                                                                   default="Face Sys"/></span>

        <span class="property-value" aria-labelledby="faceSys-label"><g:fieldValue bean="${businessInstance}"
                                                                                   field="faceSys"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.prodId}">
    <li class="fieldcontain">
        <span id="prodId-label" class="property-label"><g:message code="business.prodId.label"
                                                                  default="Prod Id"/></span>

        <span class="property-value" aria-labelledby="prodId-label"><g:fieldValue bean="${businessInstance}"
                                                                                  field="prodId"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.custType}">
    <li class="fieldcontain">
        <span id="custType-label" class="property-label"><g:message code="business.custType.label"
                                                                    default="Cust Type"/></span>

        <span class="property-value" aria-labelledby="custType-label"><g:fieldValue bean="${businessInstance}"
                                                                                    field="custType"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.subGroup}">
    <li class="fieldcontain">
        <span id="subGroup-label" class="property-label"><g:message code="business.subGroup.label"
                                                                    default="Sub Group"/></span>

        <span class="property-value" aria-labelledby="subGroup-label"><g:fieldValue bean="${businessInstance}"
                                                                                    field="subGroup"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.createTime}">
    <li class="fieldcontain">
        <span id="createTime-label" class="property-label"><g:message code="business.createTime.label"
                                                                      default="Create Time"/></span>

        <span class="property-value" aria-labelledby="createTime-label"><g:formatDate
                date="${businessInstance?.createTime}"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.modStaff}">
    <li class="fieldcontain">
        <span id="modStaff-label" class="property-label"><g:message code="business.modStaff.label"
                                                                    default="Mod Staff"/></span>

        <span class="property-value" aria-labelledby="modStaff-label"><g:fieldValue bean="${businessInstance}"
                                                                                    field="modStaff"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.modTime}">
    <li class="fieldcontain">
        <span id="modTime-label" class="property-label"><g:message code="business.modTime.label"
                                                                   default="Mod Time"/></span>

        <span class="property-value" aria-labelledby="modTime-label"><g:formatDate
                date="${businessInstance?.modTime}"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.belongOpenFlag}">
    <li class="fieldcontain">
        <span id="belongOpenFlag-label" class="property-label"><g:message code="business.belongOpenFlag.label"
                                                                          default="Belong Open Flag"/></span>

        <span class="property-value" aria-labelledby="belongOpenFlag-label"><g:fieldValue bean="${businessInstance}"
                                                                                          field="belongOpenFlag"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.belongOpenClass}">
    <li class="fieldcontain">
        <span id="belongOpenClass-label" class="property-label"><g:message code="business.belongOpenClass.label"
                                                                           default="Belong Open Class"/></span>

        <span class="property-value" aria-labelledby="belongOpenClass-label"><g:fieldValue bean="${businessInstance}"
                                                                                           field="belongOpenClass"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.objType}">
    <li class="fieldcontain">
        <span id="objType-label" class="property-label"><g:message code="business.objType.label"
                                                                   default="Obj Type"/></span>

        <span class="property-value" aria-labelledby="objType-label"><g:fieldValue bean="${businessInstance}"
                                                                                   field="objType"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.operSort}">
    <li class="fieldcontain">
        <span id="operSort-label" class="property-label"><g:message code="business.operSort.label"
                                                                    default="Oper Sort"/></span>

        <span class="property-value" aria-labelledby="operSort-label"><g:fieldValue bean="${businessInstance}"
                                                                                    field="operSort"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.payType}">
    <li class="fieldcontain">
        <span id="payType-label" class="property-label"><g:message code="business.payType.label"
                                                                   default="Pay Type"/></span>

        <span class="property-value" aria-labelledby="payType-label"><g:fieldValue bean="${businessInstance}"
                                                                                   field="payType"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.linkCollect}">
    <li class="fieldcontain">
        <span id="linkCollect-label" class="property-label"><g:message code="business.linkCollect.label"
                                                                       default="Link Collect"/></span>

        <span class="property-value" aria-labelledby="linkCollect-label"><g:fieldValue bean="${businessInstance}"
                                                                                       field="linkCollect"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.replyCollect}">
    <li class="fieldcontain">
        <span id="replyCollect-label" class="property-label"><g:message code="business.replyCollect.label"
                                                                        default="Reply Collect"/></span>

        <span class="property-value" aria-labelledby="replyCollect-label"><g:fieldValue bean="${businessInstance}"
                                                                                        field="replyCollect"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.showCheckCode}">
    <li class="fieldcontain">
        <span id="showCheckCode-label" class="property-label"><g:message code="business.showCheckCode.label"
                                                                         default="Show Check Code"/></span>

        <span class="property-value" aria-labelledby="showCheckCode-label"><g:fieldValue bean="${businessInstance}"
                                                                                         field="showCheckCode"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.isNeedAccount}">
    <li class="fieldcontain">
        <span id="isNeedAccount-label" class="property-label"><g:message code="business.isNeedAccount.label"
                                                                         default="Is Need Account"/></span>

        <span class="property-value" aria-labelledby="isNeedAccount-label"><g:fieldValue bean="${businessInstance}"
                                                                                         field="isNeedAccount"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.isNeedAddress}">
    <li class="fieldcontain">
        <span id="isNeedAddress-label" class="property-label"><g:message code="business.isNeedAddress.label"
                                                                         default="Is Need Address"/></span>

        <span class="property-value" aria-labelledby="isNeedAddress-label"><g:fieldValue bean="${businessInstance}"
                                                                                         field="isNeedAddress"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.discCodeList}">
    <li class="fieldcontain">
        <span id="discCodeList-label" class="property-label"><g:message code="business.discCodeList.label"
                                                                        default="Disc Code List"/></span>

        <span class="property-value" aria-labelledby="discCodeList-label"><g:fieldValue bean="${businessInstance}"
                                                                                        field="discCodeList"/></span>

    </li>
</g:if>

<g:if test="${businessInstance?.bizExtendInfoList}">
    <li class="fieldcontain">
        <span id="bizExtendInfoList-label" class="property-label"><g:message code="business.bizExtendInfoList.label"
                                                                             default="Biz Extend Info List"/></span>

        <g:each in="${businessInstance.bizExtendInfoList}" var="b">
            <span class="property-value" aria-labelledby="bizExtendInfoList-label"><g:link controller="bizExtendInfo"
                                                                                           action="show"
                                                                                           id="${b.id}">${b?.encodeAsHTML()}</g:link></span>
        </g:each>

    </li>
</g:if>

<g:if test="${businessInstance?.bizNiceHints}">
    <li class="fieldcontain">
        <span id="bizNiceHints-label" class="property-label"><g:message code="business.bizNiceHints.label"
                                                                        default="Biz Nice Hints"/></span>

        <g:each in="${businessInstance.bizNiceHints}" var="b">
            <span class="property-value" aria-labelledby="bizNiceHints-label"><g:link controller="bizNiceHint"
                                                                                      action="show"
                                                                                      id="${b.id}">${b?.encodeAsHTML()}</g:link></span>
        </g:each>

    </li>
</g:if>

<g:if test="${businessInstance?.bizPageList}">
    <li class="fieldcontain">
        <span id="bizPageList-label" class="property-label"><g:message code="business.bizPageList.label"
                                                                       default="Biz Page List"/></span>

        <g:each in="${businessInstance.bizPageList}" var="b">
            <span class="property-value" aria-labelledby="bizPageList-label"><g:link controller="businessPage"
                                                                                     action="show"
                                                                                     id="${b.id}">${b?.encodeAsHTML()}</g:link></span>
        </g:each>

    </li>
</g:if>

<g:if test="${businessInstance?.operDesc}">
    <li class="fieldcontain">
        <span id="operDesc-label" class="property-label"><g:message code="business.operDesc.label"
                                                                    default="Oper Desc"/></span>

        <span class="property-value" aria-labelledby="operDesc-label"><g:fieldValue bean="${businessInstance}"
                                                                                    field="operDesc"/></span>

    </li>
</g:if>

</ol>
<g:form>
    <fieldset class="buttons">
        <g:hiddenField name="id" value="${businessInstance?.id}"/>
        <g:link class="edit" action="edit" id="${businessInstance?.id}"><g:message code="default.button.edit.label"
                                                                                   default="Edit"/></g:link>
        <g:actionSubmit class="delete" action="delete"
                        value="${message(code: 'default.button.delete.label', default: 'Delete')}"
                        onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');"/>
    </fieldset>
</g:form>
</div>
</body>
</html>
