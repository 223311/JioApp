package com.jio.booking.config;

import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.ui.Model;

@Configuration
@PropertySource(value = { "classpath:application.properties" })
public class RootConfig {
	@Autowired
	private Environment environment;

	private static final String DRIVER_CLASS = "mysql_driver";
	private static final String URL = "mysql_url";
	private static final String USERNAME = "mysql_user";
	private static final String PASSWORD = "mysql_password";

	@Bean
	public BasicDataSource createDataSource() {
		BasicDataSource dataSource = new BasicDataSource();

		dataSource.setDriverClassName(environment.getProperty(DRIVER_CLASS));
		dataSource.setUrl(environment.getProperty(URL));
		dataSource.setUsername(environment.getProperty(USERNAME));
		dataSource.setPassword(environment.getProperty(PASSWORD));
		System.out.println(dataSource);
		return dataSource;

	}

	@Bean
	public LocalSessionFactoryBean createSessionFactory() {
		LocalSessionFactoryBean factory = new LocalSessionFactoryBean();
		factory.setDataSource(createDataSource());
		factory.setAnnotatedPackages("com.jio.booking.model");
		factory.setAnnotatedClasses(new Class<?>[] { Model.class });
		factory.setHibernateProperties(hibernateProperties());
		return factory;
	}

	private Properties hibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.dialect", environment.getProperty("hibernate.dialect"));
		properties.put("hibernate.show_sql", environment.getProperty("hibernate.show_sql"));
		properties.put("hibernate.hbm2ddl.auto", environment.getProperty("hibernate.hbm2ddl.auto"));
		return properties;
	}

	@Bean
	@Autowired
	public HibernateTemplate getHibernateTemplate(SessionFactory s) {
		HibernateTemplate hb = new HibernateTemplate();
		hb.setSessionFactory(s);
		return hb;
	}

}
