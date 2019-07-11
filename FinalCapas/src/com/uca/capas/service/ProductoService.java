package com.uca.capas.service;

import java.util.List;

import com.uca.capas.domain.Producto;

public interface ProductoService {
	
	public List<Producto> findAll();
	
	public Producto findOne(Integer p);
}
