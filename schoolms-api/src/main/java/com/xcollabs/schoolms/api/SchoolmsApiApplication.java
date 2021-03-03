package com.xcollabs.schoolms.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.xcollabs.schoolms"})
@EnableJpaRepositories("com.xcollabs.schoolms.repository.interfaces")
@EntityScan("com.xcollabs.schoolms.entities")
public class SchoolmsApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(SchoolmsApiApplication.class, args);
	}
}
