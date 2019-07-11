package com.uca.capas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uca.capas.domain.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
