<%@ page import="com.mixedpower.domain.Discount" %>
<!doctype html>
<html>
<head>
    <meta name="layout" content="main">
    <g:set var="entityName" value="${message(code: 'discount.label', default: 'Discount')}"/>
    <title><g:message code="default.show.label" args="[entityName]"/></title>
</head>

<body>
<a href="#show-discount" class="skip" tabindex="-1"><g:message code="default.link.skip.label"
                                                               default="Skip to content&hellip;"/></a>

<div class="nav" role="navigation">
    <ul>
        <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
        <li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]"/></g:link></li>
        <li><g:link class="create" action="create"><g:message code="default.new.label"
                                                              args="[entityName]"/></g:link></li>
    </ul>
</div>

<div id="show-discount" class="content scaffold-show" role="main">
    <h1><g:message code="default.show.label" args="[entityName]"/></h1>
    <g:if test="${flash.message}">
        <div class="message" role="status">${flash.message}</div>
    </g:if>
    <ol class="property-list discount">

        <g:if test="${discountInstance?.offerCode}">
            <li class="fieldcontain">
                <span id="offerCode-label" class="property-label"><g:message code="discount.offerCode.label"
                                                                             default="Offer Code"/></span>

                <span class="property-value" aria-labelledby="offerCode-label"><g:fieldValue bean="${discountInstance}"
                                                                                             field="offerCode"/></span>

            </li>
        </g:if>

        <g:if test="${discountInstance?.discCode}">
            <li class="fieldcontain">
                <span id="discCode-label" class="property-label"><g:message code="discount.discCode.label"
                                                                            default="Disc Code"/></span>

                <span class="property-value" aria-labelledby="discCode-label"><g:fieldValue bean="${discountInstance}"
                                                                                            field="discCode"/></span>

            </li>
        </g:if>

        <g:if test="${discountInstance?.discSort}">
            <li class="fieldcontain">
                <span id="discSort-label" class="property-label"><g:message code="discount.discSort.label"
                                                                            default="Disc Sort"/></span>

                <span class="property-value" aria-labelledby="discSort-label"><g:fieldValue bean="${discountInstance}"
                                                                                            field="discSort"/></span>

            </li>
        </g:if>

        <g:if test="${discountInstance?.offerId}">
            <li class="fieldcontain">
                <span id="offerId-label" class="property-label"><g:message code="discount.offerId.label"
                                                                           default="Offer Id"/></span>

                <span class="property-value" aria-labelledby="offerId-label"><g:fieldValue bean="${discountInstance}"
                                                                                           field="offerId"/></span>

            </li>
        </g:if>

        <g:if test="${discountInstance?.discTypeArea}">
            <li class="fieldcontain">
                <span id="discTypeArea-label" class="property-label"><g:message code="discount.discTypeArea.label"
                                                                                default="Disc Type Area"/></span>

                <span class="property-value" aria-labelledby="discTypeArea-label"><g:fieldValue
                        bean="${discountInstance}" field="discTypeArea"/></span>

            </li>
        </g:if>

        <g:if test="${discountInstance?.discTypeTime}">
            <li class="fieldcontain">
                <span id="discTypeTime-label" class="property-label"><g:message code="discount.discTypeTime.label"
                                                                                default="Disc Type Time"/></span>

                <span class="property-value" aria-labelledby="discTypeTime-label"><g:fieldValue
                        bean="${discountInstance}" field="discTypeTime"/></span>

            </li>
        </g:if>

        <g:if test="${discountInstance?.sellContent}">
            <li class="fieldcontain">
                <span id="sellContent-label" class="property-label"><g:message code="discount.sellContent.label"
                                                                               default="Sell Content"/></span>

                <span class="property-value" aria-labelledby="sellContent-label"><g:fieldValue
                        bean="${discountInstance}" field="sellContent"/></span>

            </li>
        </g:if>

        <g:if test="${discountInstance?.discName}">
            <li class="fieldcontain">
                <span id="discName-label" class="property-label"><g:message code="discount.discName.label"
                                                                            default="Disc Name"/></span>

                <span class="property-value" aria-labelledby="discName-label"><g:fieldValue bean="${discountInstance}"
                                                                                            field="discName"/></span>

            </li>
        </g:if>

    </ol>
    <g:form>
        <fieldset class="buttons">
            <g:hiddenField name="id" value="${discountInstance?.id}"/>
            <g:link class="edit" action="edit" id="${discountInstance?.id}"><g:message code="default.button.edit.label"
                                                                                       default="Edit"/></g:link>
            <g:actionSubmit class="delete" action="delete"
                            value="${message(code: 'default.button.delete.label', default: 'Delete')}"
                            onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');"/>
        </fieldset>
    </g:form>
</div>
</body>
</html>
