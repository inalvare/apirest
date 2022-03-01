package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Cliente;

@Repository
public interface ClienteDao extends CrudRepository<Cliente, Long>{

}
