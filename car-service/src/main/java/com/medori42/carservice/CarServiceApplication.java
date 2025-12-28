package com.medori42.carservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Main application class for the Car Service.
 * This microservice manages car-related operations and registers itself with
 * Consul.
 * 
 * @author Medori42
 * @version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CarServiceApplication {

    /**
     * Entry point for the Car Service application.
     * 
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        SpringApplication.run(CarServiceApplication.class, args);
    }

}
