package com.example.demo.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ClienteDao;
import com.example.demo.entity.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteDao clienteDao;
	
	@Override
	public List<Cliente> findAll(){
		return (List<Cliente>) clienteDao;
	}
	
	@Override
	@Transactional(readOnly=true)
	public Cliente findById(Long id){
		return clienteDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public Cliente save(Cliente cliente){
		return clienteDao.save(cliente);
	}

	@Override
	public Cliente delete(Long id) {
		return null;
	}
}
