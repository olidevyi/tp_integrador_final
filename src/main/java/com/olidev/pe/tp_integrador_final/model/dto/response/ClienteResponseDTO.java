package com.olidev.pe.tp_integrador_final.model.dto.response;

import com.olidev.pe.tp_integrador_final.model.entity.Cliente;

public record ClienteResponseDTO(Long id_cliente, String nombre, String apellido, String dni) {
    public ClienteResponseDTO(Cliente cliente) {
        this(cliente.getId_cliente(), cliente.getNombre(), cliente.getApellido(), cliente.getDni());
    }
}
