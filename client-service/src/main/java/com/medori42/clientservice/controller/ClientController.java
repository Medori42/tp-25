package com.medori42.clientservice.controller;

import com.medori42.clientservice.model.Client;
import com.medori42.clientservice.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST Controller for managing clients.
 * 
 * @author Medori42
 */
@RestController
@RequestMapping("/api/clients")
public class ClientController {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    /**
     * Retrieves all clients.
     * 
     * @return List of clients.
     */
    @GetMapping
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    /**
     * Retrieves a client by ID.
     * 
     * @param id Client ID.
     * @return The client if found.
     */
    @GetMapping("/{id}")
    public Client getClientById(@PathVariable Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    /**
     * Creates a new client.
     * 
     * @param client Client object to create.
     * @return The created client.
     */
    @PostMapping
    public Client createClient(@RequestBody Client client) {
        return clientRepository.save(client);
    }
}
