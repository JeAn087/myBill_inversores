package com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.Tablas;

import java.sql.Date;
import java.util.List;

import com.unicauca.edu.mybill.inversores.Common.EstadoTransaccionesEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @Table(name = "Transacciones")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class TransaccionEntity {

    @Id @Column(name = "idTransaccion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTransaccion;
    private String origen;
    private String destino;
    private Date fechaTransaccion;
    private double monto;

    @Enumerated(EnumType.STRING)
    private EstadoTransaccionesEnum estado;

    @ManyToMany(mappedBy = "transaccionesList")
    private List<PagadorEntity> pagadoresList;
}
