package com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.Tablas.TransaccionEntity;

/**
 * Repositorio que guarda todas las transacciones del sistema
 */
public interface TransaccionRepository extends JpaRepository<TransaccionEntity, Long> {

}
