package com.springboot.backend.damibackend.service;

import java.util.List;

import com.springboot.backend.damibackend.entity.Producto;

public interface ProductoService {
	
	public abstract List<Producto> findAll();
	public abstract Producto findById(int id);
	public abstract Producto save(Producto producto);
	public abstract Producto update(Producto producto);
	public abstract void deleteById(int id);

}
