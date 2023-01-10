package com.springcloud.microservices.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.retry.annotation.Retry;


@RestController
public class CircuitBreakerController {

	private Logger logger = LoggerFactory.getLogger(CircuitBreakerController.class);
	
	/*
	 * @GetMapping("/circuit-retry")
	 * 
	 * @Retry(name = "circuit-retry",fallbackMethod = "defaultResponse") public
	 * String circuitBreaker() { logger.info("Request Recieved");
	 * ResponseEntity<String> forEntity = new
	 * RestTemplate().getForEntity("http://localhost:8080/circuit-breaker",
	 * String.class); return forEntity.getBody(); }
	 */
	
	public String defaultResponse(Exception exception) {
		return "Default Fault Response";
	}
}
