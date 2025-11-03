package com.unicauca.edu.mybill.inversores.Infraestructura.Input.DTORespuesta;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class DTOPagadorRespuesta {

    private Long idPagador;

    private String nombrePagador;

    private String cedulaPagador;

    private String tipoPersona;
}
