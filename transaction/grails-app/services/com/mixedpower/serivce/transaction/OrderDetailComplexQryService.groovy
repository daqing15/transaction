package com.mixedpower.serivce.transaction

import org.springframework.jdbc.core.JdbcTemplate
import com.mixedpower.domain.Business

/**
 * Order订单复杂类查询服务类，使用SpringJDBC模板技术
 * @author daqing chen
 * @email  daqing15@gmail.com
 */
class OrderDetailComplexQryService {

    static transactional = false
    JdbcTemplate jdbcTemplate //= new JdbcTemplate(dataSource: dataSource)

    def queryOrderDetails(params) {
        def orderNo = params.orderNo
        println orderNo
        println jdbcTemplate.toString()
        //jdbcTemplate.execute("select * from tb_operation_info")
        List resList = jdbcTemplate.queryForList("select * from tb_operation_info")
        List bizList = new ArrayList()
        resList?.each {oper ->
            println oper
            Business b   = new Business()
            b.agreeFlag  = oper.agree_flag
            b.agreeUrl   = oper.agree_url
            b.id         = oper.id
            b.createTime = oper.create_time
            bizList.add(b)
        }

        bizList?.each {
            println it
        }
    }
}
