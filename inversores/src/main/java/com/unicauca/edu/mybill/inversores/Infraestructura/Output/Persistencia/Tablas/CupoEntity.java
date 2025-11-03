package com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.Tablas;

import java.util.List;

import com.unicauca.edu.mybill.inversores.Common.TipoCupoEnum;

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

@Entity @Table(name = "Cupos")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class CupoEntity {

    @Id @Column(name = "idCupo")    
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idCupo;
    
    @Enumerated(EnumType.STRING)
    private TipoCupoEnum tipoCupo;
    
    private Double valorCupo;

    @ManyToMany(mappedBy = "listaCuposEmpresa")
    private List<EmpresaEntity> empresasList;

    @ManyToMany(mappedBy = "listaCuposInversor")
    private List<InversorEntity> inversoresList;

    @ManyToMany(mappedBy = "cuposListPagador")
    private List<PagadorEntity> pagadoresList;

}