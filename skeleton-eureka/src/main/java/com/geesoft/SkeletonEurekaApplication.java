package com.geesoft;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SkeletonEurekaApplication {

	//public static void main(String[] args) {
		//SpringApplication.run(SkeletonEurekaApplication.class, args);
	public static void main(String[] args) {
		new SpringApplicationBuilder(SkeletonEurekaApplication.class)
				.web(true).run(args);
	}
}
