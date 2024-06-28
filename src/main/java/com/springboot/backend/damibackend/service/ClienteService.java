package com.springboot.backend.damibackend.service;

import java.util.List;

import com.springboot.backend.damibackend.entity.Cliente;

public interface ClienteService {
	
	public abstract List<Cliente> findAll();
	public abstract Cliente findById(int id);
	public abstract Cliente save(Cliente cliente);
	public abstract Cliente update(Cliente cliente);
	public abstract void deleteById(int id);
	
}
