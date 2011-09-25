package com.mixedpower.domain



import org.junit.*
import grails.test.mixin.*
import javax.servlet.http.HttpServletResponse

@TestFor(DiscountController)
@Mock(Discount)
class DiscountControllerTests {

    void testIndex() {
        controller.index()
        assert "/discount/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.discountInstanceList.size() == 0
        assert model.discountInstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.discountInstance != null
    }

    void testSave() {
        controller.save()
        assert response.status == HttpServletResponse.SC_METHOD_NOT_ALLOWED

        response.reset()
        request.method = 'POST'
        controller.save()

        assert model.discountInstance != null
        assert view == '/discount/create'

        response.reset()

        // TODO: Populate valid properties

        controller.save()

        assert response.redirectedUrl == '/discount/show/1'
        assert controller.flash.message != null
        assert Discount.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/discount/list'


        def discount = new Discount()

        // TODO: populate domain properties

        assert discount.save() != null

        params.id = discount.id

        def model = controller.show()

        assert model.discountInstance == discount
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/discount/list'


        def discount = new Discount()

        // TODO: populate valid domain properties

        assert discount.save() != null

        params.id = discount.id

        def model = controller.edit()

        assert model.discountInstance == discount
    }

    void testUpdate() {

        controller.update()
        assert response.status == HttpServletResponse.SC_METHOD_NOT_ALLOWED

        response.reset()
        request.method = 'POST'
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/discount/list'

        response.reset()


        def discount = new Discount()

        // TODO: populate valid domain properties

        assert discount.save() != null

        // test invalid parameters in update
        params.id = discount.id

        controller.update()

        assert view == "/discount/edit"
        assert model.discountInstance != null

        discount.clearErrors()

        // TODO: populate valid domain form parameter
        controller.update()

        assert response.redirectedUrl == "/discount/show/$discount.id"
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert response.status == HttpServletResponse.SC_METHOD_NOT_ALLOWED

        response.reset()
        request.method = 'POST'
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/discount/list'

        response.reset()

        def discount = new Discount()

        // TODO: populate valid domain properties
        assert discount.save() != null
        assert Discount.count() == 1

        params.id = discount.id

        controller.delete()

        assert Discount.count() == 0
        assert Discount.get(discount.id) == null
        assert response.redirectedUrl == '/discount/list'
    }
}
