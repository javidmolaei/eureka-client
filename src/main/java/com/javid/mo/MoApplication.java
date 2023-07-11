package com.javid.mo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoApplication.class, args);
	}

}
