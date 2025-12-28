package com.medori42.clientservice.repository;

import com.medori42.clientservice.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Client entity.
 * 
 * @author Medori42
 */
@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
