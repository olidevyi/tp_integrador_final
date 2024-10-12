package com.olidev.pe.tp_integrador_final.service.implementation;

import com.olidev.pe.tp_integrador_final.model.dao.ProductoRepository;
import com.olidev.pe.tp_integrador_final.model.dto.request.ProductoRequestDTO;
import com.olidev.pe.tp_integrador_final.model.dto.response.ProductoResponseDTO;
import com.olidev.pe.tp_integrador_final.service.abstraction.IProductoService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductoServiceImplementation implements IProductoService {
    private final ProductoRepository productoRepository;
    private final ModelMapper modelMapper;

    @Override
    public ProductoResponseDTO save(ProductoRequestDTO productoRequestDTO) {
        return null;
    }

    @Override
    public List<ProductoResponseDTO> listAll() {
        return List.of();
    }

    @Override
    public ProductoResponseDTO findById(Long codigo_producto) {
        return null;
    }

    @Override
    public ProductoResponseDTO update(Long codigo_producto, ProductoRequestDTO productoRequestDTO) {
        return null;
    }

    @Override
    public ProductoResponseDTO delete(Long codigo_producto) {
        return null;
    }
}
