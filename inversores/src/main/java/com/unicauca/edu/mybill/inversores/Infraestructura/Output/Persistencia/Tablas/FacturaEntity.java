package com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.Tablas;

import java.util.Date;
import java.util.List;

import com.unicauca.edu.mybill.inversores.Common.EstadoEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @Table (name = "Facturas")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class FacturaEntity {
    @Id @Column(name = "idFactura")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFactura;

    @ManyToOne
    @JoinColumn(name = "nitEmisora")
    private EmpresaEntity empresaEmisora;

    @ManyToOne
    @JoinColumn(name = "nitPagadora")
    private EmpresaEntity empresaPagadora;

    private Date fechaVencimiento;

    @Enumerated(EnumType.STRING)
    private EstadoEnum estado;

    private Date fechaCreacion;

    private String dirFacura;

    private String dirEnvio;

    private Double total;

    @ManyToMany(mappedBy = "facturasList")
    private List<InversorEntity> inversoresList;

}
