package com.springboot.backend.damibackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.backend.damibackend.entity.Cliente;
import com.springboot.backend.damibackend.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}

	@Override
	public Cliente findById(int id) {
		return clienteRepository.findById(id).orElse(null);
	}

	@Override
	public Cliente save(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	@Override
	public Cliente update(Cliente cliente) {
		Cliente clienteOptional = clienteRepository.findById(cliente.getId()).orElse(null);
		if( clienteOptional != null){
			clienteOptional.setNombre(cliente.getNombre());
			clienteOptional.setDireccion(cliente.getDireccion());
			clienteOptional.setTelefono(cliente.getTelefono());
			clienteOptional.setEmail(cliente.getEmail());
			clienteOptional.setFoto(cliente.getFoto());
			
			return clienteRepository.save(clienteOptional);
		}
		
		return null;
	}

	@Override
	public void deleteById(int id) {
		clienteRepository.deleteById(id);
	}
	
	

}
