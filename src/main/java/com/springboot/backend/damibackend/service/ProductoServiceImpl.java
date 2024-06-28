package com.springboot.backend.damibackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.backend.damibackend.entity.Producto;
import com.springboot.backend.damibackend.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {
	
	@Autowired
	private ProductoRepository productoRepository;

	@Override
	public List<Producto> findAll() {
		return productoRepository.findAll();
	}

	@Override
	public Producto findById(int id) {
		return productoRepository.findById(id).orElse(null);
	}

	@Override
	public Producto save(Producto producto) {
		return productoRepository.save(producto);
	}

	@Override
	public Producto update(Producto producto) {
		Producto productoOptional = productoRepository.findById(producto.getId()).orElse(null);
		if(productoOptional != null) {
			productoOptional.setNombre(producto.getNombre());
			productoOptional.setCategoria(producto.getCategoria());
			productoOptional.setPrecio(producto.getPrecio());
			productoOptional.setFoto(producto.getFoto());
			
			return productoRepository.save(productoOptional);
		}
		
		return null;		
	}

	@Override
	public void deleteById(int id) {
		productoRepository.deleteById(id);
	}

	
	
}
