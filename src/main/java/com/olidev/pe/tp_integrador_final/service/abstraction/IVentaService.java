package com.olidev.pe.tp_integrador_final.service.abstraction;

import com.olidev.pe.tp_integrador_final.model.dto.request.VentaRequestDTO;
import com.olidev.pe.tp_integrador_final.model.dto.response.VentaResponseDTO;

import java.util.List;

public interface IVentaService {
    VentaResponseDTO save(VentaRequestDTO ventaRequestDTO);
    List<VentaResponseDTO> listAll();
    VentaResponseDTO findById(Long codigo_venta);
    VentaResponseDTO update(Long codigo_venta, VentaRequestDTO ventaRequestDTO);
    VentaResponseDTO delete(Long codigo_venta);
}
