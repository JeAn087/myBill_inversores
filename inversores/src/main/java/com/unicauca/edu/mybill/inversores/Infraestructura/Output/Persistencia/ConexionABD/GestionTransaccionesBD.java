package com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.ConexionABD;

import org.springframework.stereotype.Service;

import com.unicauca.edu.mybill.inversores.Aplicacion.Output.DomGestionTransacciones;
import com.unicauca.edu.mybill.inversores.Dominio.Modelos.Transaccion;
import com.unicauca.edu.mybill.inversores.Infraestructura.Input.DTOPeticion.DTOTransaccionPeticion;

@Service
public class GestionTransaccionesBD implements DomGestionTransacciones{

    @Override
    public Transaccion añadirTransaccion(DTOTransaccionPeticion prmDTOTransaccion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'añadirTransaccion'");
    }

}
