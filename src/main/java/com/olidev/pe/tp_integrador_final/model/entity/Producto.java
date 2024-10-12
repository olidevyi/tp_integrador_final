package com.olidev.pe.tp_integrador_final.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "productos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_producto")
    private Long codigo_producto;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "marca")
    private String marca;

    @Column(name = "costo")
    private Double costo;

    @Column(name = "cantidad_disponible")
    private Double cantidad_disponible;

    @ManyToOne
    @JoinColumn(name = "FK_codigo_venta",
                referencedColumnName = "codigo_venta")
    private Venta venta;
}
