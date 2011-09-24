package com.mixedpower.domain

import org.springframework.dao.DataIntegrityViolationException
import com.mixedpower.serivce.transaction.OrderDetailComplexQryService

class BusinessController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]
    def orderDetailComplexQryService

    def complex_qry = {
        println orderDetailComplexQryService
        def complexParam = [:]
        if(params.orderNo){
            println "orderNo is null"
        } else {
            complexParam["orderNo"] = params.orderNo
        }
        orderDetailComplexQryService.queryOrderDetails(params: complexParam)
    }

    def index() {
        redirect(action: "list", params: params)
    }

    def list() {
        params.max = Math.min(params.max ? params.int('max') : 10, 100)
        [businessInstanceList: Business.list(params), businessInstanceTotal: Business.count()]
    }

    def create() {
        [businessInstance: new Business(params)]
    }

    def save() {
        def businessInstance = new Business(params)
        if (!businessInstance.save(flush: true)) {
            render(view: "create", model: [businessInstance: businessInstance])
            return
        }

		flash.message = message(code: 'default.created.message', args: [message(code: 'business.label', default: 'Business'), businessInstance.id])
        redirect(action: "show", id: businessInstance.id)
    }

    def show() {
        def businessInstance = Business.get(params.id)
        if (!businessInstance) {
			flash.message = message(code: 'default.not.found.message', args: [message(code: 'business.label', default: 'Business'), params.id])
            redirect(action: "list")
            return
        }

        [businessInstance: businessInstance]
    }

    def edit() {
        def businessInstance = Business.get(params.id)
        if (!businessInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'business.label', default: 'Business'), params.id])
            redirect(action: "list")
            return
        }

        [businessInstance: businessInstance]
    }

    def update() {
        def businessInstance = Business.get(params.id)
        if (!businessInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'business.label', default: 'Business'), params.id])
            redirect(action: "list")
            return
        }

        if (params.version) {
            def version = params.version.toLong()
            if (businessInstance.version > version) {
                businessInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                          [message(code: 'business.label', default: 'Business')] as Object[],
                          "Another user has updated this Business while you were editing")
                render(view: "edit", model: [businessInstance: businessInstance])
                return
            }
        }

        businessInstance.properties = params

        if (!businessInstance.save(flush: true)) {
            render(view: "edit", model: [businessInstance: businessInstance])
            return
        }

		flash.message = message(code: 'default.updated.message', args: [message(code: 'business.label', default: 'Business'), businessInstance.id])
        redirect(action: "show", id: businessInstance.id)
    }

    def delete() {
        def businessInstance = Business.get(params.id)
        if (!businessInstance) {
			flash.message = message(code: 'default.not.found.message', args: [message(code: 'business.label', default: 'Business'), params.id])
            redirect(action: "list")
            return
        }

        try {
            businessInstance.delete(flush: true)
			flash.message = message(code: 'default.deleted.message', args: [message(code: 'business.label', default: 'Business'), params.id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
			flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'business.label', default: 'Business'), params.id])
            redirect(action: "show", id: params.id)
        }
    }
}
