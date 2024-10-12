package com.olidev.pe.tp_integrador_final.service.abstraction;

import com.olidev.pe.tp_integrador_final.model.dto.request.ClienteRequestDTO;
import com.olidev.pe.tp_integrador_final.model.dto.response.ClienteResponseDTO;

import java.util.List;

public interface IClienteService {
    ClienteResponseDTO save(ClienteRequestDTO clienteRequestDTO);
    List<ClienteResponseDTO> listAll();
    ClienteResponseDTO findById(Long id_cliente);
    ClienteResponseDTO update(Long id_cliente, ClienteRequestDTO clienteRequestDTO);
    ClienteResponseDTO delete(Long id_cliente);
}
