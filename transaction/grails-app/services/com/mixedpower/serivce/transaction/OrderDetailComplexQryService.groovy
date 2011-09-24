package com.mixedpower.serivce.transaction

import groovy.sql.Sql
import com.mixedpower.domain.User
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.PreparedStatementCallback
import java.sql.PreparedStatement
import com.mixedpower.domain.order.OrderDetail

/**
 * Order订单复杂类查询服务类，直接使用GDBC
 * @author daqing chen
 * @email  daqing15@gmail.com
 */
class OrderDetailComplexQryService {

    static transactional = false
    def dataSource
    JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource: dataSource)

    def queryOrderDetails(params) {
        def orderNo = params.orderNo
        println orderNo
        OrderDetail orderDetail = jdbcTemplate
            .execute("select * from tb_order_detail limit 1 where order_no := order_no", { PreparedStatement statement ->
                statement.setString("order_no", "A")
            } as PreparedStatementCallback)
    }
}
