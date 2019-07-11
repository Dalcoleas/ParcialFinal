package com.uca.capas.service;

import java.util.List;

import com.uca.capas.domain.Cliente;

public interface ClienteService {
	
	public List<Cliente> findAll();
	
	public Cliente findOne(Integer c);
}
