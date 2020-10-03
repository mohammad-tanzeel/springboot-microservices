package com.microservice.p1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroservicEurakaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicEurakaApplication.class, args);
	}

}
