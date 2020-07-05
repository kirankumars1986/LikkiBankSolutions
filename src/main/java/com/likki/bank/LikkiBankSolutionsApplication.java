package com.likki.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LikkiBankSolutionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LikkiBankSolutionsApplication.class, args);
	}

}
