package com.springboot.backend.damibackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.backend.damibackend.entity.Pedido;
import com.springboot.backend.damibackend.repository.PedidoRepository;

@Service
public class PedidoServiceImpl implements PedidoService {
	
	@Autowired
	private PedidoRepository pedidoRepository;

	@Override
	public List<Pedido> findAll() {
		return pedidoRepository.findAll();
	}

	@Override
	public Pedido findById(int id) {
		return pedidoRepository.findById(id).orElse(null);
	}

	@Override
	public Pedido save(Pedido pedido) {
		return pedidoRepository.save(pedido);
	}

	@Override
	public Pedido update(Pedido pedido) {
		Pedido pedidoOptional = pedidoRepository.findById(pedido.getId()).orElse(null);
		if(pedidoOptional != null) {
			pedidoOptional.setCliente(pedido.getCliente());
			pedidoOptional.setDetalles(pedido.getDetalles());
			return pedidoRepository.save(pedidoOptional);
		}
		
		return null;
	}

	@Override
	public void deleteById(int id) {
		pedidoRepository.deleteById(id);
	}
	
	

}
