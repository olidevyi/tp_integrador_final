package com.olidev.pe.tp_integrador_final.model.dto.request;

import com.olidev.pe.tp_integrador_final.model.entity.Venta;

import java.time.LocalDate;

public record VentaRequestDTO(LocalDate fecha_venta, Double total) {
    public VentaRequestDTO(Venta venta) {
        this(venta.getFecha_venta(), venta.getTotal());
    }
}
