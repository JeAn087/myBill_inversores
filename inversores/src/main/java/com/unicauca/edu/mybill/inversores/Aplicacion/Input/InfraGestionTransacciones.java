package com.unicauca.edu.mybill.inversores.Aplicacion.Input;

import com.unicauca.edu.mybill.inversores.Dominio.Modelos.Transaccion;
import com.unicauca.edu.mybill.inversores.Infraestructura.Input.DTOPeticion.DTOTransaccionPeticion;


/**
 * Interface (Puerto) que define los métodos que la infraestructura (controlador) puede solicitar
 */
public interface InfraGestionTransacciones {

    public Transaccion añadirTransaccion(DTOTransaccionPeticion prmDTOTransaccion);
}


