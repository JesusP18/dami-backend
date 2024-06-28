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

import com.springboot.backend.damibackend.entity.DetallePedido;
import com.springboot.backend.damibackend.service.DetallePedidoService;

@RestController
@RequestMapping("/api/detallePedidos")
@CrossOrigin(origins = "*")
public class DetallePedidoController {
	
	@Autowired
    private DetallePedidoService detallePedidoService;

    @GetMapping
    public List<DetallePedido> getAllDetallesPedido() {
        return detallePedidoService.findAll();
    }

    @PostMapping
    public DetallePedido createDetallePedido(@RequestBody DetallePedido detallePedido) {
        return detallePedidoService.save(detallePedido);
    }

    @GetMapping("/{id}")
    public DetallePedido getDetallePedidoById(@PathVariable int id) {
        return detallePedidoService.findById(id);
    }

    @PutMapping
    public DetallePedido updateDetallePedido( @RequestBody DetallePedido detallePedido) {
        return detallePedidoService.update(detallePedido);
    }

    @DeleteMapping("/{id}")
    public void deleteDetallePedido(@PathVariable int id) {
        detallePedidoService.deleteById(id);
    }

}
