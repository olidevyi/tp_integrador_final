package com.olidev.pe.tp_integrador_final.controller;

import com.olidev.pe.tp_integrador_final.model.dto.request.VentaRequestDTO;
import com.olidev.pe.tp_integrador_final.model.dto.response.VentaResponseDTO;
import com.olidev.pe.tp_integrador_final.service.implementation.VentaServiceImplementation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class VentaController {
    private final VentaServiceImplementation ventaServiceImplementation;

    @PostMapping("/venta")
    public ResponseEntity<VentaResponseDTO> guardarVenta(@RequestBody VentaRequestDTO ventaRequestDTO,
                                                         UriComponentsBuilder uriComponentsBuilder) {
        return ResponseEntity.created(null).body(null);
    }

    @GetMapping("/venta")
    public ResponseEntity<List<VentaResponseDTO>> listarVenta() {
        return ResponseEntity.ok(null);
    }

    @GetMapping("/venta/{codigo_venta}")
    public ResponseEntity<VentaResponseDTO> obtenerVenta(@PathVariable Long codigo_venta) {
        return ResponseEntity.ok(null);
    }

    @PutMapping("/venta")
    public ResponseEntity<VentaResponseDTO> editarVenta(@RequestParam Long codigo_venta, @RequestBody VentaRequestDTO ventaRequestDTO) {
        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/venta")
    public ResponseEntity<VentaResponseDTO> eliminarVenta(@RequestParam Long codigo_venta) {
        return ResponseEntity.ok(null);
    }
}
