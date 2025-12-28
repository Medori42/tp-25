package com.medori42.gatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * API Gateway Service for the microservices architecture.
 * Routes requests to the appropriate microservices using discovery-based
 * routing.
 * 
 * @author Medori42
 * @version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GatewayServiceApplication {

    /**
     * Entry point for the Gateway Service application.
     * 
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        SpringApplication.run(GatewayServiceApplication.class, args);
    }

}
