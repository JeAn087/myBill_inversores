package com.unicauca.edu.mybill.inversores.Aplicacion.Output;

import com.unicauca.edu.mybill.inversores.Dominio.Modelos.Transaccion;
import com.unicauca.edu.mybill.inversores.Infraestructura.Input.DTOPeticion.DTOTransaccionPeticion;

/**
 * Interface (Puerto) que define los métodos que la infraestructura (conectorBD) puede solicitar
 */
public interface DomGestionTransacciones {
    public Transaccion añadirTransaccion(DTOTransaccionPeticion prmDTOTransaccion);
}
