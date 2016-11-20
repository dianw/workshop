package org.meruvian.workshop.jaxrs.config;

import org.meruvian.workshop.jaxrs.Main;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackageClasses = Main.class)
@EnableTransactionManagement
public class JPAConfig {
}
