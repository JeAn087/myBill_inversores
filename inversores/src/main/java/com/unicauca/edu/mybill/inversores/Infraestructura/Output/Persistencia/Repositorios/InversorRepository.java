package com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.Tablas.InversorEntity;

public interface InversorRepository extends JpaRepository<InversorEntity, Long> {

}
