package com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.Tablas;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "carritotemporal")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CarritoTemporalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCarrito;

    @ManyToOne(optional = true)
    @JoinColumn(name = "idInversor", nullable = true)
    private InversorEntity inversor;

    @ManyToOne(optional = false)
    @JoinColumn(name = "idFactura", nullable = false)
    private FacturaEntity factura;

    private LocalDateTime fechaAgregado = LocalDateTime.now();
}

