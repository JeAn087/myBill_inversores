package com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.Tablas.PagadorEntity;

public interface PagadorRepository extends JpaRepository<PagadorEntity,Long>{

}
