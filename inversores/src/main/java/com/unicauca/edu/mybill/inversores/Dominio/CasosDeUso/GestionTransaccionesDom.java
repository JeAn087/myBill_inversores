package com.unicauca.edu.mybill.inversores.Dominio.CasosDeUso;

import com.unicauca.edu.mybill.inversores.Aplicacion.Input.InfraGestionTransacciones;
import com.unicauca.edu.mybill.inversores.Dominio.Modelos.Transaccion;
import com.unicauca.edu.mybill.inversores.Infraestructura.Input.DTOPeticion.DTOTransaccionPeticion;
import com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.ConexionABD.GestionTransaccionesBD;

/**
 * Clase que añade las validaciones de negocio antes de persistir los datos a la BD
 */
public class GestionTransaccionesDom implements InfraGestionTransacciones{

    private final GestionTransaccionesBD atrGestionCuposBD;

    public GestionTransaccionesDom(GestionTransaccionesBD prmGestionCuposBD) {
        this.atrGestionCuposBD = prmGestionCuposBD;
    }

    @Override
    public Transaccion añadirTransaccion(DTOTransaccionPeticion prmDTOTransaccion) {
        return this.atrGestionCuposBD.añadirTransaccion(prmDTOTransaccion);
    }

}
