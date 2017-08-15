package com.jio.booking.config;

import javax.sql.DataSource;

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
@PropertySource("classpath:application.properties")
public class RootConfig {
	@Autowired
	private static Environment environment;

	private static final String DRIVER_CLASS = "mysql_driver";
	private static final String URL = "mysql_url";
	private static final String USERNAME = "mysql_user";
	private static final String PASSWORD = "mysql_password";

	@Bean
	public static DataSource createDataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(environment.getRequiredProperty(DRIVER_CLASS));
		dataSource.setUrl(environment.getRequiredProperty(URL));
		dataSource.setUsername(environment.getRequiredProperty(USERNAME));
		dataSource.setPassword(environment.getRequiredProperty(PASSWORD));
		return dataSource;

	}

	@Bean
	public static LocalSessionFactoryBean createSessionFactory() {
		LocalSessionFactoryBean factory = new LocalSessionFactoryBean();
		factory.setDataSource(createDataSource());
		factory.setAnnotatedPackages("com.jio.booking.model");
		factory.setAnnotatedClasses(new Class<?>[] { Model.class });
		return factory;
	}

	@Bean
	@Autowired
	public static HibernateTemplate getHibernateTemplate(SessionFactory s) {
		HibernateTemplate hb = new HibernateTemplate();
		hb.setSessionFactory(s);
		return hb;
	}

}
