package com.github.com.RobsonGDS.cruddeclientes.repositories;

import com.github.com.RobsonGDS.cruddeclientes.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
