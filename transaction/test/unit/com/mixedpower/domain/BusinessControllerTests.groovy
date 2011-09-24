package com.mixedpower.domain



import org.junit.*
import grails.test.mixin.*
import javax.servlet.http.HttpServletResponse

@TestFor(BusinessController)
@Mock(Business)
class BusinessControllerTests {

    void testIndex() {
        controller.index()
        assert "/business/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.businessInstanceList.size() == 0
        assert model.businessInstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.businessInstance != null
    }

    void testSave() {
        controller.save()
        assert response.status == HttpServletResponse.SC_METHOD_NOT_ALLOWED

        response.reset()
        request.method = 'POST'
        controller.save()

        assert model.businessInstance != null
        assert view == '/business/create'

        response.reset()

        // TODO: Populate valid properties

        controller.save()

        assert response.redirectedUrl == '/business/show/1'
        assert controller.flash.message != null
        assert Business.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/business/list'


        def business = new Business()

        // TODO: populate domain properties

        assert business.save() != null

        params.id = business.id

        def model = controller.show()

        assert model.businessInstance == business
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/business/list'


        def business = new Business()

        // TODO: populate valid domain properties

        assert business.save() != null

        params.id = business.id

        def model = controller.edit()

        assert model.businessInstance == business
    }

    void testUpdate() {

        controller.update()
        assert response.status == HttpServletResponse.SC_METHOD_NOT_ALLOWED

        response.reset()
        request.method = 'POST'
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/business/list'

        response.reset()


        def business = new Business()

        // TODO: populate valid domain properties

        assert business.save() != null

        // test invalid parameters in update
        params.id = business.id

        controller.update()

        assert view == "/business/edit"
        assert model.businessInstance != null

        business.clearErrors()

        // TODO: populate valid domain form parameter
        controller.update()

        assert response.redirectedUrl == "/business/show/$business.id"
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert response.status == HttpServletResponse.SC_METHOD_NOT_ALLOWED

        response.reset()
        request.method = 'POST'
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/business/list'

        response.reset()

        def business = new Business()

        // TODO: populate valid domain properties
        assert business.save() != null
        assert Business.count() == 1

        params.id = business.id

        controller.delete()

        assert Business.count() == 0
        assert Business.get(business.id) == null
        assert response.redirectedUrl == '/business/list'
    }
}
