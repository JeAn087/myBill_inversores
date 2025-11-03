package com.unicauca.edu.mybill.inversores.Dominio.Modelos;

import com.unicauca.edu.mybill.inversores.Common.TipoPersonaEnum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Pagador {

    private Long idPagador;

    private String nombrePagador;

    private String cedulaPagador;

    private TipoPersonaEnum tipoPersona;

}
