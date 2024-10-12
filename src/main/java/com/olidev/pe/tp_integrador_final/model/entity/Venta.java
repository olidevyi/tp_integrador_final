package com.olidev.pe.tp_integrador_final.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "ventas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_venta")
    private Long codigo_venta;

    @Column(name = "fecha_venta")
    private LocalDate fecha_venta = LocalDate.now();

    @Column(name = "total")
    private Double total;

    @OneToMany(mappedBy = "venta")
    private List<Producto> listaProductos;

    @OneToOne
    @JoinColumn(name = "FK_id_cliente",
                referencedColumnName = "id_cliente")
    private Cliente unCliente;
}
