package com.ust.eurekaserver.eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

	public static void main(String[] args) {
		System.out.println("testing1");
		System.out.println("testing2");
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
