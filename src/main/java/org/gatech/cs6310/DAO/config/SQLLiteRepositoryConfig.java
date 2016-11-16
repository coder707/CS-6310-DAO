package org.gatech.cs6310.dao.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableAutoConfiguration
@EnableJpaRepositories(transactionManagerRef="transactionManager", basePackages={"org.gatech.cs6310.dao.sqlLite"})
public class SQLLiteRepositoryConfig {
}
