package com.olidev.pe.tp_integrador_final.model.dto.request;

import com.olidev.pe.tp_integrador_final.model.entity.Cliente;

public record ClienteRequestDTO(String nombre, String apellido, String dni) {
    public ClienteRequestDTO (Cliente cliente) {
        this(cliente.getNombre(), cliente.getApellido(), cliente.getDni());
    }
}
