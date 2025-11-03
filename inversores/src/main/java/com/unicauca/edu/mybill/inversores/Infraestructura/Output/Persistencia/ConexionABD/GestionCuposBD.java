package com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.ConexionABD;

import org.springframework.stereotype.Service;

import com.unicauca.edu.mybill.inversores.Aplicacion.Output.DomGestionCupos;
import com.unicauca.edu.mybill.inversores.Dominio.Modelos.Cupo;
import com.unicauca.edu.mybill.inversores.Infraestructura.Input.DTOPeticion.DTOCupoPeticion;

@Service
public class GestionCuposBD implements DomGestionCupos{

    @Override
    public Cupo doRequest(DTOCupoPeticion prmCupoPeticion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'doRequest'");
    }

}
