package com.olidev.pe.tp_integrador_final.service.abstraction;

import com.olidev.pe.tp_integrador_final.model.dto.request.ProductoRequestDTO;
import com.olidev.pe.tp_integrador_final.model.dto.response.ProductoResponseDTO;

import java.util.List;

public interface IProductoService {
    ProductoResponseDTO save(ProductoRequestDTO productoRequestDTO);
    List<ProductoResponseDTO> listAll();
    ProductoResponseDTO findById(Long codigo_producto);
    ProductoResponseDTO update(Long codigo_producto, ProductoRequestDTO productoRequestDTO);
    ProductoResponseDTO delete(Long codigo_producto);
}
