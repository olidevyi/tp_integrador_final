package com.olidev.pe.tp_integrador_final.service.implementation;

import com.olidev.pe.tp_integrador_final.model.dao.VentasRepository;
import com.olidev.pe.tp_integrador_final.model.dto.request.VentaRequestDTO;
import com.olidev.pe.tp_integrador_final.model.dto.response.VentaResponseDTO;
import com.olidev.pe.tp_integrador_final.service.abstraction.IVentaService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VentaServiceImplementation implements IVentaService {
    private final VentasRepository ventasRepository;
    private final ModelMapper modelMapper;

    @Override
    public VentaResponseDTO save(VentaRequestDTO ventaRequestDTO) {
        return null;
    }

    @Override
    public List<VentaResponseDTO> listAll() {
        return List.of();
    }

    @Override
    public VentaResponseDTO findById(Long codigo_venta) {
        return null;
    }

    @Override
    public VentaResponseDTO update(Long codigo_venta, VentaRequestDTO ventaRequestDTO) {
        return null;
    }

    @Override
    public VentaResponseDTO delete(Long codigo_venta) {
        return null;
    }
}
