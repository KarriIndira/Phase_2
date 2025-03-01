package com.example.Spring_Circuit_Breaker;

import reactor.core.publisher.Mono;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@SpringBootApplication
public class SpringCircuitBreakerApplication {
	@RequestMapping(value = "/recommended")
	  public Mono<String> readingList(){
	    return Mono.just("Spring in Action (Manning), Cloud Native Java (O'Reilly), Learning Spring Boot (Packt)");
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringCircuitBreakerApplication.class, args);
	}

}
