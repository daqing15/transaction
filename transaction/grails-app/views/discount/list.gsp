<%@ page import="com.mixedpower.domain.Discount" %>
<!doctype html>
<html>
<head>
    <meta name="layout" content="main">
    <g:set var="entityName" value="${message(code: 'discount.label', default: 'Discount')}"/>
    <title><g:message code="default.list.label" args="[entityName]"/></title>
</head>

<body>
<a href="#list-discount" class="skip" tabindex="-1"><g:message code="default.link.skip.label"
                                                               default="Skip to content&hellip;"/></a>

<div class="nav" role="navigation">
    <ul>
        <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
        <li><g:link class="create" action="create"><g:message code="default.new.label"
                                                              args="[entityName]"/></g:link></li>
    </ul>
</div>

<div id="list-discount" class="content scaffold-list" role="main">
    <h1><g:message code="default.list.label" args="[entityName]"/></h1>
    <g:if test="${flash.message}">
        <div class="message" role="status">${flash.message}</div>
    </g:if>
    <table>
        <thead>
        <tr>

            <g:sortableColumn property="offerCode"
                              title="${message(code: 'discount.offerCode.label', default: 'Offer Code')}"/>

            <g:sortableColumn property="discCode"
                              title="${message(code: 'discount.discCode.label', default: 'Disc Code')}"/>

            <g:sortableColumn property="discSort"
                              title="${message(code: 'discount.discSort.label', default: 'Disc Sort')}"/>

            <g:sortableColumn property="offerId"
                              title="${message(code: 'discount.offerId.label', default: 'Offer Id')}"/>

            <g:sortableColumn property="discTypeArea"
                              title="${message(code: 'discount.discTypeArea.label', default: 'Disc Type Area')}"/>

            <g:sortableColumn property="discTypeTime"
                              title="${message(code: 'discount.discTypeTime.label', default: 'Disc Type Time')}"/>

        </tr>
        </thead>
        <tbody>
        <g:each in="${discountInstanceList}" status="i" var="discountInstance">
            <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

                <td><g:link action="show"
                            id="${discountInstance.id}">${fieldValue(bean: discountInstance, field: "offerCode")}</g:link></td>

                <td>${fieldValue(bean: discountInstance, field: "discCode")}</td>

                <td>${fieldValue(bean: discountInstance, field: "discSort")}</td>

                <td>${fieldValue(bean: discountInstance, field: "offerId")}</td>

                <td>${fieldValue(bean: discountInstance, field: "discTypeArea")}</td>

                <td>${fieldValue(bean: discountInstance, field: "discTypeTime")}</td>

            </tr>
        </g:each>
        </tbody>
    </table>

    <div class="pagination">
        <g:paginate total="${discountInstanceTotal}"/>
    </div>
</div>
</body>
</html>
