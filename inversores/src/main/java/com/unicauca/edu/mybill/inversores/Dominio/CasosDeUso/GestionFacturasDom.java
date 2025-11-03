package com.unicauca.edu.mybill.inversores.Dominio.CasosDeUso;

import java.util.List;

import com.unicauca.edu.mybill.inversores.Aplicacion.Input.InfraGestionFacturas;
import com.unicauca.edu.mybill.inversores.Dominio.Modelos.Factura;
import com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.ConexionABD.GestionFacturasBD;

/**
 * Clase que añade las validaciones de negocio antes de persistir los datos a la BD
 */
public class GestionFacturasDom implements InfraGestionFacturas{

    private final GestionFacturasBD gestionFacturasBD;

    public GestionFacturasDom(GestionFacturasBD gestionFacturasBD) {
        this.gestionFacturasBD = gestionFacturasBD;
    }

    @Override
    public Factura getFacturaById(Long id) {
        return this.gestionFacturasBD.getFacturaById(id);
    }

    @Override
    public List<Factura> getAllFacturas() {
        return this.gestionFacturasBD.getAllFacturas();
    }

}
