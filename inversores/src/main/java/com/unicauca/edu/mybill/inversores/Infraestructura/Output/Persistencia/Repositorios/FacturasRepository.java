package com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.Tablas.FacturaEntity;

public interface FacturasRepository extends JpaRepository<FacturaEntity, Long>{

}
