package com.verdevia.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class VerdeviaApplication {

	public static void main(String[] args) {
		SpringApplication.run(VerdeviaApplication.class, args);
	}

}
