package com.uca.capas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uca.capas.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
