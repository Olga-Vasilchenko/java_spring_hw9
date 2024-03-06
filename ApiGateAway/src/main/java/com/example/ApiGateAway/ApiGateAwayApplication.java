package com.example.ApiGateAway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiGateAwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGateAwayApplication.class, args);
	}

	/**
	 * Блок-маршрутизатор
	 * @param builder
	 * @return
	 */
	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("Seminar6HomeWork6",r->r.path("/note_service/**")
						.uri("http://localhost:8089/"))
				.route("Microservice1",r->r.path("/service1/**")
						.uri("http://localhost:8086/"))
				.route("Microservice2",r->r.path("/service2/**")
						.uri("http://localhost:8087/")).build();}

}
