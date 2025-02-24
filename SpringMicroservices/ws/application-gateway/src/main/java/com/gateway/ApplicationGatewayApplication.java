package com.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

import io.netty.handler.codec.http.HttpMethod;

@EnableDiscoveryClient
@SpringBootApplication
public class ApplicationGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationGatewayApplication.class, args);
	}
	
	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		String[] method = {"GET"};
		return builder.routes().route(r ->r.path("/catalog/**").and().method(method).uri("http://localhost:8081")).route(r -> r.path("/product/**").and().method(method).uri("http://localhost:8080")).build();
	}

}
