package com.unicauca.edu.mybill.inversores.Dominio.Modelos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Modelo de dominio que representa una empresa del sistema.
 * @author Jeison Andrés Vallejo Gómez
 */

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Empresa {
    private Long idNit;

    private String direccionDomicilio;

    private String departamentoDomicilio;

    private String ciudadDomicilio;

    private String pais;

    private String celular;

    private String email;

    private String numeroCuenta;

    private String razonSocial;

}
