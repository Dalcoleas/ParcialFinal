package com.uca.capas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Producto;
import com.uca.capas.repositories.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService{
	
	@Autowired
	ProductoRepository productoRepository;

	@Override
	public List<Producto> findAll() {
		
		return productoRepository.findAll();
	}

	@Override
	public Producto findOne(Integer p) {
		return productoRepository.findById(p).get();
	}
	
	
	
}
