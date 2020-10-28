package com.jdaibello.taskchapterone.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jdaibello.taskchapterone.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
