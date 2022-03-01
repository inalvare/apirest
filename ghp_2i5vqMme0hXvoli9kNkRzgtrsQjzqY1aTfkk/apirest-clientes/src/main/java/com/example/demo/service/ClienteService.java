package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Cliente;

public interface ClienteService {

	public List<Cliente> findAll();
	
	public Cliente findById(Long id);

	public Cliente save(Cliente cliente);
	
	public Cliente delete(Long id);
}
