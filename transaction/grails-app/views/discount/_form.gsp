<%@ page import="com.mixedpower.domain.Discount" %>



<div class="fieldcontain ${hasErrors(bean: discountInstance, field: 'offerCode', 'error')} ">
    <label for="offerCode">
        <g:message code="discount.offerCode.label" default="Offer Code"/>

    </label>
    <g:textField name="offerCode" value="${discountInstance?.offerCode}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: discountInstance, field: 'discCode', 'error')} ">
    <label for="discCode">
        <g:message code="discount.discCode.label" default="Disc Code"/>

    </label>
    <g:textField name="discCode" value="${discountInstance?.discCode}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: discountInstance, field: 'discSort', 'error')} ">
    <label for="discSort">
        <g:message code="discount.discSort.label" default="Disc Sort"/>

    </label>
    <g:textField name="discSort" value="${discountInstance?.discSort}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: discountInstance, field: 'offerId', 'error')} ">
    <label for="offerId">
        <g:message code="discount.offerId.label" default="Offer Id"/>

    </label>
    <g:textField name="offerId" value="${discountInstance?.offerId}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: discountInstance, field: 'discTypeArea', 'error')} ">
    <label for="discTypeArea">
        <g:message code="discount.discTypeArea.label" default="Disc Type Area"/>

    </label>
    <g:textField name="discTypeArea" value="${discountInstance?.discTypeArea}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: discountInstance, field: 'discTypeTime', 'error')} ">
    <label for="discTypeTime">
        <g:message code="discount.discTypeTime.label" default="Disc Type Time"/>

    </label>
    <g:textField name="discTypeTime" value="${discountInstance?.discTypeTime}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: discountInstance, field: 'sellContent', 'error')} ">
    <label for="sellContent">
        <g:message code="discount.sellContent.label" default="Sell Content"/>

    </label>
    <g:textField name="sellContent" value="${discountInstance?.sellContent}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: discountInstance, field: 'discName', 'error')} ">
    <label for="discName">
        <g:message code="discount.discName.label" default="Disc Name"/>

    </label>
    <g:textField name="discName" value="${discountInstance?.discName}"/>
</div>

