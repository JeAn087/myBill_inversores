package com.unicauca.edu.mybill.inversores.Infraestructura.Input.DTORespuesta;

import java.util.Date;

import com.unicauca.edu.mybill.inversores.Common.EstadoEnum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class DTOFacturaRespuesta {

    private Long idFactura;

    private Date fechaVencimiento;

    private EstadoEnum estado;

    private Date fechaCreacion;

    private String dirFacura;

    private String dirEnvio;

    private Double total;

    private String empresaEmisoraName;

    private String empresaPagadoraName;
}
