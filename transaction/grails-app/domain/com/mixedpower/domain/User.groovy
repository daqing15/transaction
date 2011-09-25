package com.mixedpower.domain

/**
 * 用户实体
 * @author daqing chen
 * @email  daqing15@gmail.com
 */
class User implements Serializable {
    String areaCode;
    String custCode;
    String custName;
    String identyNo;
    String identyTpye;
    String linkMan;
    String linkPhone;
    String address;
    String email;
    String post_code;
    String loginNumber;
    String loginTime;
    String lastLoginTime;

    static constraints = {
        areaCode(blank: false)
        custCode(blank: false)
        custName(blank: false)
        identyNo(blank: false)
        identyTpye(blank: false)
        linkMan(nullable: true)
        address(nullable: true)
        linkPhone(nullable: true)
        email(nullable: true)
        post_code(nullable: true, maxSize: 6)
        loginNumber(nullable: true)
        loginTime(nullable: true)
        lastLoginTime(nullable: true)
    }

    static mapping = {
        version false
        table "tb_user"
    }
}
