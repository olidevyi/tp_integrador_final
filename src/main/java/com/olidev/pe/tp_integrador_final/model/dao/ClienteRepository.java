package com.olidev.pe.tp_integrador_final.model.dao;

import com.olidev.pe.tp_integrador_final.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
