package com.olidev.pe.tp_integrador_final.model.dto.request;

import com.olidev.pe.tp_integrador_final.model.entity.Producto;

public record ProductoRequestDTO(String nombre, String marca, Double costo, Double cantidad_disponible) {
    public ProductoRequestDTO(Producto producto) {
        this(producto.getNombre(), producto.getMarca(), producto.getCosto(), producto.getCantidad_disponible());
    }
}
