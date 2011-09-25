package com.mixedpower.domain

import org.springframework.dao.DataIntegrityViolationException

class DiscountController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index = {
        redirect(action: "list", params: params)
    }

    def list = {
        params.max = Math.min(params.max ? params.int('max') : 10, 100)
        [discountInstanceList: Discount.list(params), discountInstanceTotal: Discount.count()]
    }

    def create() {
        [discountInstance: new Discount(params)]
    }

    def save = {
        def discountInstance = new Discount(params)
        if (!discountInstance.save(flush: true)) {
            render(view: "create", model: [discountInstance: discountInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'discount.label', default: 'Discount'), discountInstance.id])
        redirect(action: "show", id: discountInstance.id)
    }

    def show = {
        def discountInstance = Discount.get(params.id)
        if (!discountInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'discount.label', default: 'Discount'), params.id])
            redirect(action: "list")
            return
        }

        [discountInstance: discountInstance]
    }

    def edit = {
        def discountInstance = Discount.get(params.id)
        if (!discountInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'discount.label', default: 'Discount'), params.id])
            redirect(action: "list")
            return
        }

        [discountInstance: discountInstance]
    }

    def update = {
        def discountInstance = Discount.get(params.id)
        if (!discountInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'discount.label', default: 'Discount'), params.id])
            redirect(action: "list")
            return
        }

        if (params.version) {
            def version = params.version.toLong()
            if (discountInstance.version > version) {
                discountInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                        [message(code: 'discount.label', default: 'Discount')] as Object[],
                        "Another user has updated this Discount while you were editing")
                render(view: "edit", model: [discountInstance: discountInstance])
                return
            }
        }

        discountInstance.properties = params

        if (!discountInstance.save(flush: true)) {
            render(view: "edit", model: [discountInstance: discountInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'discount.label', default: 'Discount'), discountInstance.id])
        redirect(action: "show", id: discountInstance.id)
    }

    def delete = {
        def discountInstance = Discount.get(params.id)
        if (!discountInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'discount.label', default: 'Discount'), params.id])
            redirect(action: "list")
            return
        }

        try {
            discountInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'discount.label', default: 'Discount'), params.id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'discount.label', default: 'Discount'), params.id])
            redirect(action: "show", id: params.id)
        }
    }
}
