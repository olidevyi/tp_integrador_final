package com.olidev.pe.tp_integrador_final.model.dto.response;

import com.olidev.pe.tp_integrador_final.model.entity.Venta;

import java.time.LocalDate;

public record VentaResponseDTO(Long codigo_venta, LocalDate fecha_venta, Double total) {
    public VentaResponseDTO(Venta venta) {
        this(venta.getCodigo_venta(), venta.getFecha_venta(), venta.getTotal());
    }
}
