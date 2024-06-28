package com.springboot.backend.damibackend.service;

import java.util.List;

import com.springboot.backend.damibackend.entity.Pedido;

public interface PedidoService {
	
	public abstract List<Pedido> findAll();
	public abstract Pedido findById(int id);
	public abstract Pedido save(Pedido pedido);
	public abstract Pedido update(Pedido pedido);
	public abstract void deleteById(int id);
	
}
