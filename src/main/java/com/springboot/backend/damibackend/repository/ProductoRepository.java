package com.springboot.backend.damibackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.backend.damibackend.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
