package com.olidev.pe.tp_integrador_final.controller;

import com.olidev.pe.tp_integrador_final.model.dto.request.ClienteRequestDTO;
import com.olidev.pe.tp_integrador_final.model.dto.response.ClienteResponseDTO;
import com.olidev.pe.tp_integrador_final.service.implementation.ClienteServiceImplementation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class ClienteController {
    private final ClienteServiceImplementation clienteServiceImplementation;

    @PostMapping("/cliente")
    public ResponseEntity<ClienteResponseDTO> guardarCliente(ClienteRequestDTO clienteRequestDTO,
                                                           UriComponentsBuilder uriComponentsBuilder) {
        return ResponseEntity.created(null).body(null);
    }

    @GetMapping("/clientes")
    public ResponseEntity<List<ClienteResponseDTO>> listarClientes() {
        return ResponseEntity.ok(null);
    }

    @GetMapping("/cliente/{id_cliente}")
    public ResponseEntity<ClienteResponseDTO> buscarClientePorId(@PathVariable Long id_cliente) {
        return ResponseEntity.ok(null);
    }

    @PutMapping("/cliente")
    public ResponseEntity<ClienteResponseDTO> editarCliente(@RequestParam Long id_cliente,
                                                            @RequestBody ClienteRequestDTO clienteRequestDTO) {
        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/cliente")
    public ResponseEntity<ClienteResponseDTO> eliminarCliente(@RequestParam Long id_cliente) {
        return ResponseEntity.ok(null);
    }
}