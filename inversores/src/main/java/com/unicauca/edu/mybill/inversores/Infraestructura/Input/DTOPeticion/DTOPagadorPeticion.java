package com.unicauca.edu.mybill.inversores.Infraestructura.Input.DTOPeticion;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class DTOPagadorPeticion {
    
    private Long idPagador;

    private String nombrePagador;

    private String cedulaPagador;

    private String tipoPersona;

}
