package com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.Repositorios;

import com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.Tablas.CarritoTemporalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CarritoTemporalRepository extends JpaRepository<CarritoTemporalEntity, Long> {
    List<CarritoTemporalEntity> findByInversor_IdInversor(Long idInversor);
    void deleteByInversor_IdInversorAndFactura_IdFactura(Long idInversor, Long idFactura);
    void deleteByInversor_IdInversor(Long idInversor);
}
