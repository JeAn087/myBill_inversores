package com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.Repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.Tablas.EmpresaEntity;
import com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.Tablas.FacturaEntity;

public interface EmpresaRepository extends JpaRepository<EmpresaEntity, Long> {
    //Facturas emitidas por una empresa
    @Query("SELECT f FROM FacturaEntity f WHERE f.empresaEmisora.idNit = :nit")
    List<FacturaEntity> findFacturasEmitidasByEmpresaNit(Long nit);

    // Facturas por pagar de una empresa dado su NIT
    @Query("SELECT f FROM FacturaEntity f WHERE f.empresaPagadora.idNit = :nit")
    List<FacturaEntity> findFacturasPorPagarByEmpresaNit(Long nit);

    /**
     * Busca empresas cuyo nombre comience con el patron dado (sin importar mayúsculas/minúsculas)
     * y las ordena alfabéticamente.
     */
    @Query("SELECT e FROM EmpresaEntity e " +
            "WHERE LOWER(e.empresaName) LIKE LOWER(CONCAT(:patron, '%')) " +
        "ORDER BY e.empresaName ASC")
    List<EmpresaEntity> buscarEmpresasPorPatron(@Param("patron") String patron);
}
