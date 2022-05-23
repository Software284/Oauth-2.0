package com.lamichhane.oauth2.resource.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Oauth2resourceserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(Oauth2resourceserverApplication.class, args);
	}

}
