package com.example.AV1_IBGE.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = {"com.example"})
@EnableMongoRepositories("com.example.AV1_IBGE.repository")

public class Av1IbgeApplication {

	public static void main(String[] args) {
		SpringApplication.run(Av1IbgeApplication.class, args);
	}

}
