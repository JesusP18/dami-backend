package com.springboot.backend.damibackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.backend.damibackend.entity.Pedido;
import com.springboot.backend.damibackend.service.PedidoService;

@RestController
@RequestMapping("/api/pedidos")
@CrossOrigin(origins = "*")
public class PedidoController {
	
	//

	@Autowired
	private PedidoService pedidoService;
	
	@GetMapping
    public List<Pedido> getAllPedidos() {
        return pedidoService.findAll();
    }

    @PostMapping
    public Pedido createPedido(@RequestBody Pedido pedido) {
        return pedidoService.save(pedido);
    }

    @GetMapping("/{id}")
    public Pedido getPedidoById(@PathVariable int id) {
        return pedidoService.findById(id);
    }

    @PutMapping
    public Pedido updatePedido(@RequestBody Pedido pedido) {
        return pedidoService.update(pedido);
    }

    @DeleteMapping("/{id}")
    public void deletePedido(@PathVariable int id) {
    	pedidoService.deleteById(id);
    }
	
}
