package com.unicauca.edu.mybill.inversores.Infraestructura.Input.DTOPeticion;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class DTOTransaccionPeticion {
    private Long id;
    private String origen;
    private String destino;
    private String fechaTransaccion;
    private double monto;
    private String estado;
}
