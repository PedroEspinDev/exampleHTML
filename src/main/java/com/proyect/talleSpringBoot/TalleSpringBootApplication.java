package com.proyect.talleSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.thymeleaf.dialect.springdata.SpringDataDialect;

@SpringBootApplication
public class TalleSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(TalleSpringBootApplication.class, args);
	}

	@Bean
	SpringDataDialect springDataDialect() {
		return new SpringDataDialect();
	}
}
