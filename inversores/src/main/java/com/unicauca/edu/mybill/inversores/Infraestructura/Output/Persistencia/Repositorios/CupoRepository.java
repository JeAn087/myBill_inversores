package com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.Tablas.CupoEntity;

public interface CupoRepository extends JpaRepository<CupoEntity,Long>{

}
