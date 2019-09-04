package com.epiuse.recruiting;

import java.sql.DriverManager;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DatabaseConfig {
@Bean
public DataSource datasource() {
	DriverManagerDataSource dataSource = new DriverManagerDataSource();
	dataSource.setDriverClassName("");
	dataSource.setUsername("");
    dataSource.setPassword("");
    dataSource.setCatalog("");
    dataSource.setUrl("");

    return dataSource;
}
}
