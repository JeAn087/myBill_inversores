package com.unicauca.edu.mybill.inversores.Aplicacion.Input;

import com.unicauca.edu.mybill.inversores.Dominio.Modelos.Cupo;
import com.unicauca.edu.mybill.inversores.Infraestructura.Input.DTOPeticion.DTOCupoPeticion;

/**
 * Interface (Puerto) que define los métodos que la infraestructura (controlador) puede solicitar
 */
public interface InfraGestionCupos {

    public Cupo doRequest(DTOCupoPeticion prmCupoPeticion);

}
