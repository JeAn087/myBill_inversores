package com.unicauca.edu.mybill.inversores.Infraestructura.Input.DTOPeticion;

import com.unicauca.edu.mybill.inversores.Common.TipoCupoEnum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class DTOCupoPeticion {
    private Long idCupo;
    private TipoCupoEnum tipoCupo;
    private Double valorCupo;
}
