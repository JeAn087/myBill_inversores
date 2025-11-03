package com.unicauca.edu.mybill.inversores.Infraestructura.Input.DTOPeticion;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class DTOEmpresaPeticion {

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
