package com.ecommerce.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories("com.ecommerce.repository")
@EnableTransactionManagement
public class JDBCconfig {

	 @Bean
	    DataSource dataSource() {
	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	        dataSource.setUrl("jdbc:mysql://localhost:3306/EcomDB?createDatabaseIfNotExist=true&serverTimezone=UTC");
	        dataSource.setUsername("root");
	        dataSource.setPassword("1507");
	        return dataSource;
	    }

	    @Bean(name = "entityManagerFactory")
	    LocalContainerEntityManagerFactoryBean entityMannagerFactory(DataSource dataSource) {
	        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
	        entityManagerFactoryBean.setDataSource(dataSource);
	        entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
	        entityManagerFactoryBean.setPackagesToScan("com.ecommerce.entity");

	        Properties jpaProperties = new Properties();
	        jpaProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
	        jpaProperties.setProperty("hibernate.hbm2ddl.auto", "create-drop");
	        jpaProperties.setProperty("hibernate.show_sql", "true");
	        jpaProperties.setProperty("hibernate.format_sql", "true");
	        entityManagerFactoryBean.setJpaProperties(jpaProperties);

	        return entityManagerFactoryBean;
	    }
	    @Bean
	    public PlatformTransactionManager transactionManager (EntityManagerFactory entityManagerFactory){
	        JpaTransactionManager transactionManager = new JpaTransactionManager();
	        transactionManager.setEntityManagerFactory(entityManagerFactory);
	        return transactionManager;

	    }
}
