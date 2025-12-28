package com.medori42.clientservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Main application class for the Client Service.
 * This microservice manages client-related operations and registers itself with
 * Consul.
 * 
 * @author Medori42
 * @version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ClientServiceApplication {

    /**
     * Entry point for the Client Service application.
     * 
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        SpringApplication.run(ClientServiceApplication.class, args);
    }

}
