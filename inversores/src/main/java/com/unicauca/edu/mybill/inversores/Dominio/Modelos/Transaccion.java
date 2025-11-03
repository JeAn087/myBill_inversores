package com.unicauca.edu.mybill.inversores.Dominio.Modelos;

import java.sql.Date;

import com.unicauca.edu.mybill.inversores.Common.EstadoTransaccionesEnum;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Transaccion {

    private Long id;
    private String origen;
    private String destino;
    private Date fechaTransaccion;
    private double monto;
    private EstadoTransaccionesEnum estado;
}
