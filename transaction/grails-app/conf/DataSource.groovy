dataSource {
    pooled = true
	driverClassName = "com.mysql.jdbc.Driver"
	username = "root"
	password = "123456"
	logSql =  true
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = true
    cache.provider_class = 'net.sf.ehcache.hibernate.EhCacheProvider'
}
// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "update" // one of 'create', 'create-drop', 'update', 'validate', ''
			url = "jdbc:mysql://localhost:3306/ecssdb?useUnicode=true&amp;characterEncoding=UTF8"
        }
    }
    test {
        dataSource {
            dbCreate = "update" // one of 'create', 'create-drop', 'update', 'validate', ''
			url = "jdbc:mysql://localhost:3306/ecssdb?useUnicode=true&amp;characterEncoding=UTF8"
        }
    }
    production {
        dataSource {
            dbCreate = "update" // one of 'create', 'create-drop', 'update', 'validate', ''
			url = "jdbc:mysql://localhost:3306/ecssdb?useUnicode=true&amp;characterEncoding=UTF8"
        }
    }
}

