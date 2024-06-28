package com.springboot.backend.damibackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.backend.damibackend.entity.DetallePedido;
import com.springboot.backend.damibackend.repository.DetallePedidoRepository;

@Service
public class DetallePedidoServiceImpl implements DetallePedidoService {
	
	@Autowired
	private DetallePedidoRepository detallePedidoRepository;
	
	@Override
	public List<DetallePedido> findAll() {
		return detallePedidoRepository.findAll();
	}

	@Override
	public DetallePedido findById(int id) {
		return detallePedidoRepository.findById(id).orElse(null);
	}

	@Override
	public DetallePedido save(DetallePedido detallePedido) {
		return detallePedidoRepository.save(detallePedido);
	}

	@Override
	public DetallePedido update(DetallePedido detallePedido) {
		DetallePedido detallePedidoOptional = detallePedidoRepository.findById(detallePedido.getId()).orElse(null);
        if (detallePedidoOptional != null) {
        	detallePedidoOptional.setProducto(detallePedido.getProducto());
        	detallePedidoOptional.setCantidad(detallePedido.getCantidad());
        	
            return detallePedidoRepository.save(detallePedidoOptional);
        }
        
        return null;
	}

	@Override
	public void deleteById(int id) {
		detallePedidoRepository.deleteById(id);
	}
	
	 
	

}
