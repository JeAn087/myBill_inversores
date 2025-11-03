package com.unicauca.edu.mybill.inversores.Aplicacion.Output;

import java.util.List;

import com.unicauca.edu.mybill.inversores.Dominio.Modelos.Factura;

/**
 * Interface (Puerto) que define los métodos que la infraestructura (conectorBD) puede solicitar
 */
public interface DomGestionFacturas {
    public Factura getFacturaById(Long id);

    public List<Factura> getAllFacturas();
}
