package com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.Tablas;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @Table(name = "Empresas")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class EmpresaEntity {

    @Id @Column (name = "idNit")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNit;

    private String direccionDomicilio;

    private String departamentoDomicilio;

    private String ciudadDomicilio;

    private String pais;

    private String celular;

    private String email;

    private String numeroCuenta;

    private String empresaName;

    @ManyToMany
    @JoinTable(name = "empresa_cupo",
    joinColumns = @JoinColumn(name = "idNit"),
    inverseJoinColumns = @JoinColumn(name = "idCupo"))
    private List<CupoEntity> listaCuposEmpresa;

    @OneToMany(mappedBy = "empresaEmisora", fetch = FetchType.EAGER)
    private List<FacturaEntity> facturasEmitidas;

    @OneToMany(mappedBy = "empresaPagadora", fetch = FetchType.EAGER)
    private List<FacturaEntity> facturasPorPagar;

}
