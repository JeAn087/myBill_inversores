package com.unicauca.edu.mybill.inversores.Dominio.Modelos;

import java.util.Date;

import com.unicauca.edu.mybill.inversores.Common.EstadoEnum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Modelo de dominio que representa una factura del sistema.
 * @author Jeison Andrés Vallejo Gómez
 */

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Factura {

    private Long idFactura;

    private Date fechaVencimiento;

    private EstadoEnum estado;

    private Date fechaCreacion;

    private String dirFacura;

    private String dirEnvio;

    private Double total;

}
