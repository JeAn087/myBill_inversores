package com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.Tablas.EmpresaEntity;

public interface EmpresaRepository extends JpaRepository<EmpresaEntity, Long> {

}
