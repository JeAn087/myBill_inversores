package com.unicauca.edu.mybill.inversores.Infraestructura.Input.DTOPeticion;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class DTOInversorPeticion {

    private Long idInversor;

    private String nombreInversor;

    private String cedulaInversor;

    private String tipoPersona;

}
