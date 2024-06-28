package com.springboot.backend.damibackend.service;

import java.util.List;

import com.springboot.backend.damibackend.entity.DetallePedido;

public interface DetallePedidoService {
	
	public abstract List<DetallePedido> findAll();
	public abstract DetallePedido findById(int id);
	public abstract DetallePedido save(DetallePedido detallePedido);
	public abstract DetallePedido update(DetallePedido detallePedido);
	public abstract void deleteById(int id);
	
}
