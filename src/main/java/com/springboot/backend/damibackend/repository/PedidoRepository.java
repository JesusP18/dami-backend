package com.springboot.backend.damibackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.backend.damibackend.entity.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
