package com.springboot.backend.damibackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.backend.damibackend.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
