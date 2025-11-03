package com.unicauca.edu.mybill.inversores.Dominio.Modelos;

import com.unicauca.edu.mybill.inversores.Common.TipoPersonaEnum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Modelo de dominio que representa un inversor.
 * @author Jeison Andrés Vallejo Gómez
 */

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Inversor {

    private Long idInversor;

    private String nombreInversor;

    private String cedulaInversor;

    private TipoPersonaEnum tipoPersona;

}
