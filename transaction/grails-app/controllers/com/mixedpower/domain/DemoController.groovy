package com.mixedpower.domain

import freemarker.template.Template
import grails.plugin.freemarker.FreemarkerViewService

/**
 * Freemarker here deme
 */
class DemoController {

    def freemarkerTemplateService
    String suffix = ".ftl"
    FreemarkerViewService freemarkerViewService

    def index = {

        def writer = new StringWriter()
        def view = freemarkerViewService.getView("demo/index")
        println freemarkerViewService
        println view

        def mpp = [name: 'Jeff Beck', instrument: '¼ªËûÓ´']
        //render(viewName:'index.ftl', model: mpp, plugin:'freemarker')
        freemarkerTemplateService.render("demo/index${suffix}" , [name:"basejump",instrument:"IL"], writer)
        println writer.toString()
        [name: 'Jeff Beck', instrument: '¼ªËûÓ´']
    }

}
