package com.unicauca.edu.mybill.inversores.Infraestructura.Input.DTORespuesta;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class DTOCupoRespuesta {

    private Long idCupo;
    
    private String tipoCupo;
    
    private Double valorCupo;

}
