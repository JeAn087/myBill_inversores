package com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.Tablas;

import java.util.List;

import com.unicauca.edu.mybill.inversores.Common.TipoPersonaEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @Table(name = "Pagadores")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class PagadorEntity {

    @Id @Column(name = "idPagador")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPagador;

    private String nombrePagador;

    private String cedulaPagador;

    @Enumerated(EnumType.STRING)
    private TipoPersonaEnum tipoPersona;

    @ManyToMany
    @JoinTable(name = "historial_transacciones",
    joinColumns = @JoinColumn(name = "idPagador"),
    inverseJoinColumns = @JoinColumn(name="idTransaccion"))
    private List<TransaccionEntity> transaccionesList;

    @ManyToMany
    @JoinTable(name = "cupos_pagadores",
    joinColumns = @JoinColumn(name = "idPagador"),
    inverseJoinColumns = @JoinColumn(name="idCupo"))
    private List<CupoEntity> cuposListPagador;

}
