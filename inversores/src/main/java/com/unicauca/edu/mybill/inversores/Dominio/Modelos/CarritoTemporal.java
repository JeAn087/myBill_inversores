package com.unicauca.edu.mybill.inversores.Dominio.Modelos;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CarritoTemporal {
    private Long idCarrito;
    private Long idInversor;
    private Long idFactura;
    private String fechaAgregado;
}
