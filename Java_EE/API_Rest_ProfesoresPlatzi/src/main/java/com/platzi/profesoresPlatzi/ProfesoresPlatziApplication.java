package com.platzi.profesoresPlatzi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {HibernateJpaAutoConfiguration.class})
public class ProfesoresPlatziApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfesoresPlatziApplication.class, args);
	}
}
