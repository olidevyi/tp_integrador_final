package com.olidev.pe.tp_integrador_final.controller;

import com.olidev.pe.tp_integrador_final.model.dto.request.ProductoRequestDTO;
import com.olidev.pe.tp_integrador_final.model.dto.response.ProductoResponseDTO;
import com.olidev.pe.tp_integrador_final.service.implementation.ProductoServiceImplementation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class ProductoController {
    private final ProductoServiceImplementation productoServiceImplementation;

    @PostMapping("/producto")
    public ResponseEntity<ProductoResponseDTO> guardarProducto(ProductoRequestDTO productoRequestDTO,
                                                             UriComponentsBuilder uriComponentsBuilder) {
        return ResponseEntity.created(null).body(null);
    }

    @GetMapping("/productos")
    public ResponseEntity<List<ProductoResponseDTO>> listarProductos() {
        return ResponseEntity.ok(null);
    }

    @GetMapping("/producto/{codigo_producto}")
    public ResponseEntity<ProductoResponseDTO> buscarProductoPorCodigo(@PathVariable Long codigo_producto) {
        return ResponseEntity.ok(null);
    }

    @PutMapping("/producto")
    public ResponseEntity<ProductoResponseDTO> editarProducto(@RequestParam Long codigo_producto,
                                                              @RequestBody ProductoRequestDTO productoRequestDTO) {
        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/producto")
    public ResponseEntity<ProductoResponseDTO> eliminarProducto(@RequestParam Long codigo_producto) {
        return ResponseEntity.ok(null);
    }
}
