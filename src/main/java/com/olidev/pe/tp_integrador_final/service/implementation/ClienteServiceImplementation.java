package com.olidev.pe.tp_integrador_final.service.implementation;

import com.olidev.pe.tp_integrador_final.model.dao.ClienteRepository;
import com.olidev.pe.tp_integrador_final.model.dto.request.ClienteRequestDTO;
import com.olidev.pe.tp_integrador_final.model.dto.response.ClienteResponseDTO;
import com.olidev.pe.tp_integrador_final.service.abstraction.IClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteServiceImplementation implements IClienteService {
    private final ClienteRepository clienteRepository;

    @Override
    public ClienteResponseDTO save(ClienteRequestDTO clienteRequestDTO) {
        return null;
    }

    @Override
    public List<ClienteResponseDTO> listAll() {
        return List.of();
    }

    @Override
    public ClienteResponseDTO findById(Long id_cliente) {
        return null;
    }

    @Override
    public ClienteResponseDTO update(Long id_cliente, ClienteRequestDTO clienteRequestDTO) {
        return null;
    }

    @Override
    public ClienteResponseDTO delete(Long id_cliente) {
        return null;
    }
}
