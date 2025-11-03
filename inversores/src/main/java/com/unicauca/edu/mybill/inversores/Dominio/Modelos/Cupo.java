package com.unicauca.edu.mybill.inversores.Dominio.Modelos;

import com.unicauca.edu.mybill.inversores.Common.TipoCupoEnum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Modelo de dominio que relaciona los cupos aprobados a los inversores.
 * @author Jeison Andrés Vallejo Gómez
 */

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Cupo {
    private Long idCupo;
    
    private TipoCupoEnum tipoCupo;
    
    private Double valorCupo;
}
