package com.olidev.pe.tp_integrador_final.model.dto.response;

import com.olidev.pe.tp_integrador_final.model.entity.Producto;

public record ProductoResponseDTO(Long codigo_producto, String nombre, String marca, Double costo, Double cantidad_disponible) {
    public ProductoResponseDTO(Producto producto) {
        this(producto.getCodigo_producto(), producto.getNombre(), producto.getMarca(), producto.getCosto(), producto.getCantidad_disponible());
    }
}
