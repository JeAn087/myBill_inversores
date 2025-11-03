package com.unicauca.edu.mybill.inversores.Aplicacion.Output;

import com.unicauca.edu.mybill.inversores.Dominio.Modelos.Cupo;
import com.unicauca.edu.mybill.inversores.Infraestructura.Input.DTOPeticion.DTOCupoPeticion;

/**
 * Interface (Puerto) que define los métodos que la infraestructura (conectorBD) puede solicitar
 */
public interface DomGestionCupos {
        public Cupo doRequest(DTOCupoPeticion prmCupoPeticion);

}
