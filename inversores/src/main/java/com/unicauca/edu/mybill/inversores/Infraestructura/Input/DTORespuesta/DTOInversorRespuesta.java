package com.unicauca.edu.mybill.inversores.Infraestructura.Input.DTORespuesta;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class DTOInversorRespuesta {

    private Long idInversor;

    private String nombreInversor;

    private String cedulaInversor;

    private String tipoPersona;
}
