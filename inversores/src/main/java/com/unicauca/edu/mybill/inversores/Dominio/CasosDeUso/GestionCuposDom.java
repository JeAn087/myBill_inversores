package com.unicauca.edu.mybill.inversores.Dominio.CasosDeUso;

import com.unicauca.edu.mybill.inversores.Aplicacion.Input.InfraGestionCupos;
import com.unicauca.edu.mybill.inversores.Dominio.Modelos.Cupo;
import com.unicauca.edu.mybill.inversores.Infraestructura.Input.DTOPeticion.DTOCupoPeticion;
import com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.ConexionABD.GestionCuposBD;


/**
 * Clase que añade las validaciones de negocio antes de persistir los datos a la BD
 */
public class GestionCuposDom implements InfraGestionCupos {

    private final GestionCuposBD gestionCuposBD;
    

    public GestionCuposDom(GestionCuposBD gestionCuposBD) {
        this.gestionCuposBD = gestionCuposBD;
    }
    @Override
    public Cupo doRequest(DTOCupoPeticion prmCupoPeticion) {
        return this.gestionCuposBD.doRequest(prmCupoPeticion);
    }

}
