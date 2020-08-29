package com.baeldung.ls.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.baeldung.ls.persistence.repository.impl.ProjectRepositoryImpl;

@Configuration
@ComponentScan(basePackages = {"com.baeldung.ls.persistence"})
public class PersistanceConfig {

	@Bean
	public ProjectRepositoryImpl projectRepository() {
		return new ProjectRepositoryImpl();
	}
}
