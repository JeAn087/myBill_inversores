package com.unicauca.edu.mybill.inversores.Aplicacion.Input;

import java.util.List;

import com.unicauca.edu.mybill.inversores.Dominio.Modelos.Factura;

/**
 * Interface (Puerto) que define los métodos que la infraestructura (controlador) puede solicitar
 */
public interface InfraGestionFacturas {

    public Factura getFacturaById(Long id);

    public List<Factura> getAllFacturas();
}
