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

@Entity @Table (name = "Inversores")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class InversorEntity {
    @Id @Column(name = "idInversor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInversor;

    private String nombreInversor;

    private String cedulaInversor;

    @Enumerated(EnumType.STRING)
    private TipoPersonaEnum tipoPersona;

    @ManyToMany
    @JoinTable(name = "inversor_factura",
    joinColumns = @JoinColumn(name = "idInversor"),
    inverseJoinColumns = @JoinColumn(name = "idFactura"))
    private List<FacturaEntity> facturasList;

    @ManyToMany
    @JoinTable(name = "inversor_cupo",
    joinColumns = @JoinColumn(name = "idNit"),
    inverseJoinColumns = @JoinColumn(name = "idCupo"))
    private List<CupoEntity> listaCuposInversor;    
}
