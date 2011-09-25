package com.mixedpower.domain.order



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainUnitTestMixin} for usage instructions
 */
@TestFor(OrderDetail)
class OrderDetailTests {

    void testSomething() {
        OrderDetail od = new OrderDetail();
        od.attrId = 122222
        od.attrName = 'Œ“”–”–”¥'
        od.attrValueName = ''
    }
}
